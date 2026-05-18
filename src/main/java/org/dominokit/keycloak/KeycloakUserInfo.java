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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class KeycloakUserInfo extends JsMap<String, Any> {

  @JsProperty
  native String getSub();

  @JsProperty
  native void setSub(String sub);

  @JsProperty
  native String getName();

  @JsProperty
  native void setName(String name);

  @JsProperty(name = "preferred_username")
  native String getPreferredUsername();

  @JsProperty(name = "preferred_username")
  native void setPreferredUsername(String preferredUsername);

  @JsProperty(name = "given_name")
  native String getGivenName();

  @JsProperty(name = "given_name")
  native void setGivenName(String givenName);

  @JsProperty(name = "family_name")
  native String getFamilyName();

  @JsProperty(name = "family_name")
  native void setFamilyName(String familyName);

  @JsProperty(name = "middle_name")
  native String getMiddleName();

  @JsProperty(name = "middle_name")
  native void setMiddleName(String middleName);

  @JsProperty
  native String getNickname();

  @JsProperty
  native void setNickname(String nickname);

  @JsProperty
  native String getProfile();

  @JsProperty
  native void setProfile(String profile);

  @JsProperty
  native String getPicture();

  @JsProperty
  native void setPicture(String picture);

  @JsProperty
  native String getWebsite();

  @JsProperty
  native void setWebsite(String website);

  @JsProperty
  native String getEmail();

  @JsProperty
  native void setEmail(String email);

  @JsProperty(name = "email_verified")
  native boolean isEmailVerified();

  @JsProperty(name = "email_verified")
  native void setEmailVerified(boolean emailVerified);

  @JsProperty
  native String getGender();

  @JsProperty
  native void setGender(String gender);

  @JsProperty
  native String getBirthdate();

  @JsProperty
  native void setBirthdate(String birthdate);

  @JsProperty
  native String getZoneinfo();

  @JsProperty
  native void setZoneinfo(String zoneinfo);

  @JsProperty
  native String getLocale();

  @JsProperty
  native void setLocale(String locale);

  @JsProperty(name = "phone_number")
  native String getPhoneNumber();

  @JsProperty(name = "phone_number")
  native void setPhoneNumber(String phoneNumber);

  @JsProperty(name = "phone_number_verified")
  native boolean isPhoneNumberVerified();

  @JsProperty(name = "phone_number_verified")
  native void setPhoneNumberVerified(boolean phoneNumberVerified);

  @JsProperty(name = "updated_at")
  native double getUpdatedAt();

  @JsProperty(name = "updated_at")
  native void setUpdatedAt(double updatedAt);

  @JsOverlay
  public static KeycloakUserInfo create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }
}
