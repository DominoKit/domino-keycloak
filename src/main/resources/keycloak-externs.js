/**
 *@externs
 */

/**
 * @constructor
 */
function KeycloakConfig() {}

/**
 * @type {?string}
 */
KeycloakConfig.prototype.url;

/**
 * @type {string}
 */
KeycloakConfig.prototype.realm;

/**
 * @type {string}
 */
KeycloakConfig.prototype.clientId;


/**
 * @constructor
 */
function Acr() {};

/**
 *@type {Array<string>}
 */
Acr.prototype.values;

/**
 *@type {boolean}
 */
Acr.prototype.essential;

/**
 * @interface
 */
function KeycloakInitOptions() {}

/**
 * @type {?boolean}
 */
KeycloakInitOptions.prototype.useNonce;

/**
 * @type {?KeycloakAdapter}
 */
KeycloakInitOptions.prototype.adapter;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.onLoad;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.token;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.refreshToken;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.idToken;

/**
 * @type {?number}
 */
KeycloakInitOptions.prototype.timeSkew;

/**
 * @type {?boolean}
 */
KeycloakInitOptions.prototype.checkLoginIframe;

/**
 * @type {?number}
 */
KeycloakInitOptions.prototype.checkLoginIframeInterval;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.responseMode;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.redirectUri;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.silentCheckSsoRedirectUri;

/**
 * @type {?boolean}
 */
KeycloakInitOptions.prototype.silentCheckSsoFallback;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.flow;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.pkceMethod;

/**
 * @type {?boolean}
 */
KeycloakInitOptions.prototype.enableLogging;

/**
 * @type {?string}
 */
KeycloakInitOptions.prototype.scope;

/**
 * @type {?number}
 */
KeycloakInitOptions.prototype.messageReceiveTimeout;


/**
 * @interface
 */
function KeycloakLoginOptions() {}


/**
 * @type {?string}
 */
KeycloakLoginOptions.prototype.scope;

/**
 * @type {?string}
 */
KeycloakLoginOptions.prototype.redirectUri;

/**
 * @type {?string}
 */
KeycloakLoginOptions.prototype.prompt;

/**
 * @type {?string}
 */
KeycloakLoginOptions.prototype.action;

/**
 * @type {?number}
 */
KeycloakLoginOptions.prototype.maxAge;

/**
 * @type {?string}
 */
KeycloakLoginOptions.prototype.loginHint;

/**
 * @type {?Acr}
 */
KeycloakLoginOptions.prototype.acr;

/**
 * @type {?string}
 */
KeycloakLoginOptions.prototype.idpHint;

/**
 * @type {?string}
 */
KeycloakLoginOptions.prototype.locale;

/**
 * @type {?Object<string,string>}
 */
KeycloakLoginOptions.prototype.cordovaOptions;


/**
 * @interface
 */
function KeycloakLogoutOptions() {}

/**
 * @type {?string}
 */
KeycloakLogoutOptions.prototype.redirectUri;

/**
 * @interface
 */
function KeycloakRegisterOptions() {}

/**
 * @type {?string}
 */
KeycloakRegisterOptions.prototype.scope;

/**
 * @type {?string}
 */
KeycloakRegisterOptions.prototype.redirectUri;

/**
 * @type {?string}
 */
KeycloakRegisterOptions.prototype.prompt;

/**
 * @type {?number}
 */
KeycloakRegisterOptions.prototype.maxAge;

/**
 * @type {?string}
 */
KeycloakRegisterOptions.prototype.loginHint;

/**
 * @type {?Acr}
 */
KeycloakRegisterOptions.prototype.acr;

/**
 * @type {?string}
 */
KeycloakRegisterOptions.prototype.idpHint;

/**
 * @type {?string}
 */
KeycloakRegisterOptions.prototype.locale;

/**
 * @type {?Object<string,string>}
 */
KeycloakRegisterOptions.prototype.cordovaOptions;

/**
 * @interface
 */
function KeycloakAccountOptions() {}

/**
 * @type {?string}
 */
KeycloakAccountOptions.prototype.redirectUri;

/**
 * @constructor
 */
function KeycloakPromise() {}


/**
 * @param {KeycloakPromiseCallback} callback
 * @return {KeycloakPromise}
 */
KeycloakPromise.prototype.success = function(callback) {};


/**
 * @param {KeycloakPromiseCallback} callback
 * @return {KeycloakPromise}
 */
KeycloakPromise.prototype.error = function(callback) {};

/**
 * @typedef {!function(Object): void}
 */
var KeycloakPromiseCallback;

/**
 * @constructor
 */
function KeycloakError() {}

/**
 * @type {string}
 */
KeycloakError.prototype.error;

/**
 * @type {string}
 */
KeycloakError.prototype.error_description;


/**
 * @constructor
 */
function KeycloakAdapter() {}

/**
 * @param {KeycloakLoginOptions=} options
 * @return {KeycloakPromise}
 */
KeycloakAdapter.prototype.login = function (options){}

/**
 * @param {KeycloakLogoutOptions=} options
 * @return {KeycloakPromise}
 */
KeycloakAdapter.prototype.logout = function (options){}

/**
 * @param {KeycloakRegisterOptions=} opt_options
 * @return {KeycloakPromise}
 */
KeycloakAdapter.prototype.register = function(opt_options) {};


/**
 * @return {KeycloakPromise}
 */
KeycloakAdapter.prototype.accountManagement = function() {};


/**
 * @param {{redirectUri: string}} options
 * @param {boolean} encodeHash
 * @return {string}
 */
KeycloakAdapter.prototype.redirectUri = function(options, encodeHash) {};

/**
 * @interface
 */
function KeycloakProfile() {}

/**
 * @type {?string}
 */
KeycloakProfile.prototype.id;

/**
 * @type {?string}
 */
KeycloakProfile.prototype.username;

/**
 * @type {?string}
 */
KeycloakProfile.prototype.email;

/**
 * @type {?string}
 */
KeycloakProfile.prototype.firstName;

/**
 * @type {?string}
 */
KeycloakProfile.prototype.lastName;

/**
 * @type {?boolean}
 */
KeycloakProfile.prototype.enabled;

/**
 * @type {?boolean}
 */
KeycloakProfile.prototype.emailVerified;

/**
 * @type {?boolean}
 */
KeycloakProfile.prototype.totp;

/**
 * @type {?number}
 */
KeycloakProfile.prototype.createdTimestamp;

/**
 * @interface
 */
function KeycloakTokenParsed() {}

/**
 * @type {?string}
 */
KeycloakTokenParsed.prototype.iss;

/**
 * @type {?string}
 */
KeycloakTokenParsed.prototype.sub;

/**
 * @type {?string}
 */
KeycloakTokenParsed.prototype.aud;

/**
 * @type {?number}
 */
KeycloakTokenParsed.prototype.exp;

/**
 * @type {?number}
 */
KeycloakTokenParsed.prototype.iat;

/**
 * @type {?number}
 */
KeycloakTokenParsed.prototype.auth_time;

/**
 * @type {?string}
 */
KeycloakTokenParsed.prototype.nonce;

/**
 * @type {?string}
 */
KeycloakTokenParsed.prototype.acr;

/**
 * @type {?string}
 */
KeycloakTokenParsed.prototype.amr;

/**
 * @type {?string}
 */
KeycloakTokenParsed.prototype.azp;

/**
 * @type {?string}
 */
KeycloakTokenParsed.prototype.session_state;

/**
 * @type {?KeycloakRoles}
 */
KeycloakTokenParsed.prototype.realm_access;

/**
 * @type {?KeycloakResourceAccess}
 */
KeycloakTokenParsed.prototype.resource_access;

/**
 * @interface
 */
function KeycloakRoles() {}

/**
 * @type {Array<string>}
 */
KeycloakRoles.prototype.roles;

/**
 * @interface
 */
function KeycloakResourceAccess() {}

/**
 * @type {Object<String, KeycloakRoles>}
 */
KeycloakResourceAccess.prototype;

/**
 * @param {string|KeycloakConfig} url
 * @constructor
 */
function Keycloak(url) {}

/**
 * @type {?boolean}
 */
Keycloak.prototype.authenticated;

/**
 * @type {?string}
 */
Keycloak.prototype.subject;

/**
 * @type {?string}
 */
Keycloak.prototype.responseMode;

/**
 * @type {?string}
 */
Keycloak.prototype.responseType;

/**
 * @type {?string}
 */
Keycloak.prototype.flow;

/**
 * @type {?KeycloakRoles}
 */
Keycloak.prototype.realmAccess;

/**
 * @type {?KeycloakResourceAccess}
 */
Keycloak.prototype.resourceAccess;

/**
 * @type {?string}
 */
Keycloak.prototype.token;

/**
 * @type {?KeycloakTokenParsed}
 */
Keycloak.prototype.tokenParsed;

/**
 * @type {?string}
 */
Keycloak.prototype.refreshToken;

/**
 * @type {?KeycloakTokenParsed}
 */
Keycloak.prototype.refreshTokenParsed;

/**
 * @type {?string}
 */
Keycloak.prototype.idToken;

/**
 * @type {?KeycloakTokenParsed}
 */
Keycloak.prototype.idTokenParsed;

/**
 * @type {?number}
 */
Keycloak.prototype.timeSkew;

/**
 * @type {?boolean}
 * @private
 */
Keycloak.prototype.loginRequired;

/**
 * @type {?string}
 * @private
 */
Keycloak.prototype.authServerUrl;

/**
 * @type {?string}
 * @private
 */
Keycloak.prototype.realm;

/**
 * @type {?string}
 * @private
 */
Keycloak.prototype.clientId;

/**
 * @type {?string}
 * @private
 */
Keycloak.prototype.clientSecret;

/**
 * @type {?string}
 * @private
 */
Keycloak.prototype.redirectUri;

/**
 * @type {?string}
 * @private
 */
Keycloak.prototype.sessionId;

/**
 * @type {?KeycloakProfile}
 * @private
 */
Keycloak.prototype.profile;

/**
 * @type {?Object}
 * @private
 */
Keycloak.prototype.userInfo;


//------------------------------------

/**
 * @param {boolean=} authenticated
 */
Keycloak.prototype.onReady = function(authenticated){}

/**
 *
 */
Keycloak.prototype.onAuthSuccess = function() {}

/**
 * @param {KeycloakError} errorData
 */
Keycloak.prototype.onAuthError = function(errorData){}

/**
 *
 */
Keycloak.prototype.onAuthRefreshSuccess = function() {}

/**
 *
 */
Keycloak.prototype.onAuthRefreshError = function() {}

/**
 *
 */
Keycloak.prototype.onAuthLogout = function(){}

/**
 *
 */
Keycloak.prototype.onTokenExpired = function(){};

/**
 * @param {string} status
 */
Keycloak.prototype.onActionUpdate = function(status){};

/**
 * @param {KeycloakInitOptions} initOptions
 * @return {KeycloakPromise<boolean,KeycloakError>}
 */
Keycloak.prototype.init = function(initOptions){}

/**
 * @param {KeycloakLoginOptions=} options.
 * @return {KeycloakPromise}
 */
Keycloak.prototype.login = function(options){}

/**
 * @param {KeycloakLogoutOptions=} options
 * @return {KeycloakPromise}
 */
Keycloak.prototype.logout = function(options){}

/**
 * @param {KeycloakRegisterOptions=} options
 * @return {KeycloakPromise}
 */
Keycloak.prototype.register = function(options){}

/**
 * @return {KeycloakPromise}
 */
Keycloak.prototype.accountManagement = function(){}

/**
 * @param {KeycloakLoginOptions=} options
 * @return {string}
 */
Keycloak.prototype.createLoginUrl = function(options){}

/**
 * @param {KeycloakLogoutOptions=} options
 * @return {string}
 */
Keycloak.prototype.createLogoutUrl = function(options){}

/**
 * @param {KeycloakRegisterOptions=} options
 * @return {string}
 */
Keycloak.prototype.createRegisterUrl = function(options){}

/**
 * @param {KeycloakAccountOptions=} options
 * @return {string}
 */
Keycloak.prototype.createAccountUrl = function(options){}

/**
 * @param {number=} minValidity
 * @return {boolean}
 */
Keycloak.prototype.isTokenExpired = function(minValidity){}

/**
 * @param {number} minValidity
 * @return {KeycloakPromise<boolean, boolean>}
 */
Keycloak.prototype.updateToken = function(minValidity){}

/**
 *
 */
Keycloak.prototype.clearToken = function(){}

/**
 * @param {string} role
 * @return {boolean}
 */
Keycloak.prototype.hasRealmRole = function(role){}

/**
 * Returns true if the token has the given role for the resource.
 * @param {string} role
 * @param {string=} resource
 * @return {boolean}
 */
Keycloak.prototype.hasResourceRole = function(role, resource){}

/**
 * @return {KeycloakPromise<KeycloakProfile, ?>}
 */
Keycloak.prototype.loadUserProfile = function(){}

/**
 * @return {KeycloakPromise<Object, ?>}
 */
Keycloak.prototype.loadUserInfo = function(){}