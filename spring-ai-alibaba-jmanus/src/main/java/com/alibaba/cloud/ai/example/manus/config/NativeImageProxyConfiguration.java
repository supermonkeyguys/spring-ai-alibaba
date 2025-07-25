/*
 * Copyright 2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.cloud.ai.example.manus.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Configuration for native image mode to handle proxy creation properly. This
 * configuration ensures that CGLIB proxies are used instead of JDK dynamic proxies to
 * avoid issues in native image mode.
 */
@Configuration
@ConditionalOnProperty(name = "spring.aot.enabled", havingValue = "true", matchIfMissing = false)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class NativeImageProxyConfiguration {

	// This configuration class forces the use of CGLIB proxies
	// which work better in native image mode than JDK dynamic proxies

}
