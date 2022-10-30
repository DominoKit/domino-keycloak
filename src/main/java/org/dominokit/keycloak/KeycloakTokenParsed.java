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

import elemental2.core.JsMap;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class KeycloakTokenParsed extends JsMap<String, Any> {

  @JsProperty
  native String getIss();

  @JsProperty
  native void setIss(String iss);

  @JsProperty
  native String getSub();

  @JsProperty
  native void setSub(String sub);

  @JsProperty
  native String getAud();

  @JsProperty
  native void setAud(String aud);

  @JsProperty
  native double getExp();

  @JsProperty
  native void setExp(double exp);

  @JsProperty(name = "auth_time")
  native double getAuthTime();

  @JsProperty(name = "auth_time")
  native void setAuthTime(double authTime);

  @JsProperty
  native String getNonce();

  @JsProperty
  native void setNonce(String nonce);

  @JsProperty
  native String getAcr();

  @JsProperty
  native void setAcr(String acr);

  @JsProperty
  native String getAmr();

  @JsProperty
  native void setAmr(String amr);

  @JsProperty
  native String getAzp();

  @JsProperty
  native void setAzp(String azp);

  @JsProperty(name = "session_state")
  native String getSessionState();

  @JsProperty(name = "session_state")
  native void setSessionState(String sessionState);

  @JsProperty(name = "realm_access")
  native KeycloakRoles getRealmAccess();

  @JsProperty(name = "realm_access")
  native void setRealmAccess(KeycloakRoles realmAccess);

  @JsProperty(name = "resource_access")
  native KeycloakResourceAccess getResourceAccess();

  @JsProperty(name = "resource_access")
  native void setResourceAccess(KeycloakResourceAccess resourceAccess);
}
