/* Copyright 2016 Google Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.codegen.metacode;

import com.google.api.codegen.util.Name;
import com.google.api.tools.framework.model.TypeRef;
import com.google.auto.value.AutoValue;

/**
 * SimpleInitCodeLine represents an InitCodeLine that initializes a variable that does not depend
 * on other initialized variables.
 */
@AutoValue
public abstract class SimpleInitCodeLine implements InitCodeLine {

  public static SimpleInitCodeLine create(
      TypeRef type, Name identifier, InitValueConfig initValueConfig) {
    return new AutoValue_SimpleInitCodeLine(type, identifier, initValueConfig);
  }

  public abstract TypeRef getType();

  @Override
  public abstract Name getIdentifier();

  @Override
  public abstract InitValueConfig getInitValueConfig();

  @Override
  public InitCodeLineType getLineType() {
    return InitCodeLineType.SimpleInitLine;
  }
}
