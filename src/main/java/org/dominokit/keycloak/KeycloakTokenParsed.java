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
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface KeycloakTokenParsed extends JsPropertyMap<Any> {

  @JsOverlay
  static KeycloakTokenParsed create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsProperty
  String getIss();

  @JsProperty
  void setIss(String iss);

  @JsProperty
  String getSub();

  @JsProperty
  void setSub(String sub);

  @JsProperty
  String getAud();

  @JsProperty
  void setAud(String aud);

  @JsProperty
  double getExp();

  @JsProperty
  void setExp(double exp);

  @JsProperty
  double getIat();

  @JsProperty
  void setIat(double iat);

  @JsProperty(name = "auth_time")
  double getAuthTime();

  @JsProperty(name = "auth_time")
  void setAuthTime(double authTime);

  @JsProperty
  String getNonce();

  @JsProperty
  void setNonce(String nonce);

  @JsProperty
  String getAcr();

  @JsProperty
  void setAcr(String acr);

  @JsProperty
  String getAmr();

  @JsProperty
  void setAmr(String amr);

  @JsProperty
  String getAzp();

  @JsProperty
  void setAzp(String azp);

  @JsProperty(name = "session_state")
  String getSessionState();

  @JsProperty(name = "session_state")
  void setSessionState(String sessionState);

  @JsProperty(name = "realm_access")
  KeycloakRoles getRealmAccess();

  @JsProperty(name = "realm_access")
  void setRealmAccess(KeycloakRoles realmAccess);

  @JsProperty(name = "resource_access")
  KeycloakResourceAccess getResourceAccess();

  @JsProperty(name = "resource_access")
  void setResourceAccess(KeycloakResourceAccess resourceAccess);
}
