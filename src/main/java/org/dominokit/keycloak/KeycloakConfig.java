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
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface KeycloakConfig {

  @JsOverlay
  static KeycloakConfig create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsOverlay
  static KeycloakConfig create(String url, String realm, String clientId) {
    KeycloakConfig config = Js.uncheckedCast(JsPropertyMap.of());
    config.setUrl(url);
    config.setRealm(realm);
    config.setClientId(clientId);
    return config;
  }

  @JsProperty
  String getUrl();

  @JsProperty
  void setUrl(String Url);

  @JsProperty
  String getRealm();

  @JsProperty
  void setRealm(String realm);

  @JsProperty
  String getClientId();

  @JsProperty
  void setClientId(String clientId);
}
