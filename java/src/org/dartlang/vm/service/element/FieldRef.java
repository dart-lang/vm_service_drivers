/*
 * Copyright (c) 2015, the Dart project authors.
 *
 * Licensed under the Eclipse Public License v1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.dartlang.vm.service.element;

// This is a generated file.

import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

/**
 * An {@link FieldRef} is a reference to a {@link Field}.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class FieldRef extends ObjRef {

  public FieldRef(JsonObject json) {
    super(json);
  }

  /**
   * The declared type of this field.
   *
   * The value will always be of one of the kinds: Type, TypeRef, TypeParameter, BoundedType.
   */
  @NotNull
  public InstanceRef getDeclaredType() {
    return new InstanceRef((JsonObject) json.get("declaredType"));
  }

  /**
   * The name of this field.
   */
  @NotNull
  public String getName() {
    return json.get("name").getAsString();
  }

  /**
   * The owner of this field, which can be either a Library or a Class.
   */
  @NotNull
  public ObjRef getOwner() {
    return new ObjRef((JsonObject) json.get("owner"));
  }

  /**
   * Is this field const?
   */
  public boolean isConst() {
    return json.get("const").getAsBoolean();
  }

  /**
   * Is this field final?
   */
  public boolean isFinal() {
    return json.get("final").getAsBoolean();
  }

  /**
   * Is this field static?
   */
  public boolean isStatic() {
    return json.get("static").getAsBoolean();
  }
}
