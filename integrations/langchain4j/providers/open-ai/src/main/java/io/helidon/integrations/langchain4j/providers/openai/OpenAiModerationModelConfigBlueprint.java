/*
 * Copyright (c) 2025 Oracle and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.helidon.integrations.langchain4j.providers.openai;

import io.helidon.builder.api.Prototype;

/**
 * Configuration for the OpenAI moderation model, {@link dev.langchain4j.model.openai.OpenAiModerationModel}.
 * Provides methods for setting up and managing properties related to OpenAI API requests.
 *
 * @see dev.langchain4j.model.openai.OpenAiModerationModel
 */
@Prototype.Configured(OpenAiLanguageModelConfigBlueprint.CONFIG_ROOT)
@Prototype.Blueprint
// we want to have an explicit type for configuration, even if it does not add methods
@SuppressWarnings("checkstyle:InterfaceIsType")
interface OpenAiModerationModelConfigBlueprint extends OpenAiCommonConfig {
    /**
     * Default configuration prefix.
     */
    String CONFIG_ROOT = "langchain4j.open-ai.moderation-model";
}
