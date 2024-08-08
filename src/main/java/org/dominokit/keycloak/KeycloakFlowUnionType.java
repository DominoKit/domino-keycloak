/*
 * Copyright © 2019 Dominokit
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
package org.dominokit.keycloak;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface KeycloakFlowUnionType {

  @JsOverlay
  static KeycloakFlowUnionType standard() {
    return Js.cast("standard");
  }

  @JsOverlay
  static KeycloakFlowUnionType implicit() {
    return Js.cast("implicit");
  }

  @JsOverlay
  static KeycloakFlowUnionType hybrid() {
    return Js.cast("hybrid");
  }

  @JsOverlay
  default String asString() {
    return Js.asString(this);
  }
}
