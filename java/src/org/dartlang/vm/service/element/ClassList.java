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

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ClassList extends Response {

  public ClassList(JsonObject json) {
    super(json);
  }

  @NotNull
  public ElementList<ClassRef> getClasses() {
    return new ElementList<ClassRef>(json.get("classes").getAsJsonArray()) {
      @Override
      protected ClassRef basicGet(JsonArray array, int index) {
        return new ClassRef(array.get(index).getAsJsonObject());
      }
    };
  }
}
