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
public interface KeycloakUserInfo extends JsPropertyMap<Any> {

  @JsOverlay
  static KeycloakUserInfo create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsProperty
  String getSub();

  @JsProperty
  void setSub(String sub);

  @JsProperty
  String getName();

  @JsProperty
  void setName(String name);

  @JsProperty(name = "preferred_username")
  String getPreferredUsername();

  @JsProperty(name = "preferred_username")
  void setPreferredUsername(String preferredUsername);

  @JsProperty(name = "given_name")
  String getGivenName();

  @JsProperty(name = "given_name")
  void setGivenName(String givenName);

  @JsProperty(name = "family_name")
  String getFamilyName();

  @JsProperty(name = "family_name")
  void setFamilyName(String familyName);

  @JsProperty(name = "middle_name")
  String getMiddleName();

  @JsProperty(name = "middle_name")
  void setMiddleName(String middleName);

  @JsProperty
  String getNickname();

  @JsProperty
  void setNickname(String nickname);

  @JsProperty
  String getProfile();

  @JsProperty
  void setProfile(String profile);

  @JsProperty
  String getPicture();

  @JsProperty
  void setPicture(String picture);

  @JsProperty
  String getWebsite();

  @JsProperty
  void setWebsite(String website);

  @JsProperty
  String getEmail();

  @JsProperty
  void setEmail(String email);

  @JsProperty(name = "email_verified")
  boolean isEmailVerified();

  @JsProperty(name = "email_verified")
  void setEmailVerified(boolean emailVerified);

  @JsProperty
  String getGender();

  @JsProperty
  void setGender(String gender);

  @JsProperty
  String getBirthdate();

  @JsProperty
  void setBirthdate(String birthdate);

  @JsProperty
  String getZoneinfo();

  @JsProperty
  void setZoneinfo(String zoneinfo);

  @JsProperty
  String getLocale();

  @JsProperty
  void setLocale(String locale);

  @JsProperty(name = "phone_number")
  String getPhoneNumber();

  @JsProperty(name = "phone_number")
  void setPhoneNumber(String phoneNumber);

  @JsProperty(name = "phone_number_verified")
  boolean isPhoneNumberVerified();

  @JsProperty(name = "phone_number_verified")
  void setPhoneNumberVerified(boolean phoneNumberVerified);

  @JsProperty(name = "updated_at")
  double getUpdatedAt();

  @JsProperty(name = "updated_at")
  void setUpdatedAt(double updatedAt);
}
