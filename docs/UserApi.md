# UserApi

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userIdGet**](UserApi.md#userIdGet) | **GET** /user/{id} | Get User information
[**userIdPut**](UserApi.md#userIdPut) | **PUT** /user/{id} | Edit User information
[**userLoginPost**](UserApi.md#userLoginPost) | **POST** /user/login | User Login
[**userUserIdMetadataGet**](UserApi.md#userUserIdMetadataGet) | **GET** /user/{user_id}/metadata | Find User metadata
[**userUserIdMetadataPost**](UserApi.md#userUserIdMetadataPost) | **POST** /user/{user_id}/metadata | Add user metadata


<a name="userIdGet"></a>
# **userIdGet**
> User userIdGet(id)

Get User information

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Integer id = 56; // Integer | User unique ID
try {
    User result = apiInstance.userIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| User unique ID |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userIdPut"></a>
# **userIdPut**
> User userIdPut(id, body)

Edit User information

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String id = "id_example"; // String | ID of User to update.
UserUpdateBody body = new UserUpdateBody(); // UserUpdateBody | Request body
try {
    User result = apiInstance.userIdPut(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of User to update. |
 **body** | [**UserUpdateBody**](UserUpdateBody.md)| Request body |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userLoginPost"></a>
# **userLoginPost**
> LoginResponse userLoginPost(body)

User Login

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; No authorization is required&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Login body = new Login(); // Login | Request body
try {
    LoginResponse result = apiInstance.userLoginPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Login**](Login.md)| Request body |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdMetadataGet"></a>
# **userUserIdMetadataGet**
> UserMetadataResponse userUserIdMetadataGet(userId)

Find User metadata

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | ID of User.
try {
    UserMetadataResponse result = apiInstance.userUserIdMetadataGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userUserIdMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| ID of User. |

### Return type

[**UserMetadataResponse**](UserMetadataResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUserIdMetadataPost"></a>
# **userUserIdMetadataPost**
> UserMetadataResponse userUserIdMetadataPost(userId, body)

Add user metadata

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | ID of User.
UserMetadata body = new UserMetadata(); // UserMetadata | Request body
try {
    UserMetadataResponse result = apiInstance.userUserIdMetadataPost(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userUserIdMetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| ID of User. |
 **body** | [**UserMetadata**](UserMetadata.md)| Request body |

### Return type

[**UserMetadataResponse**](UserMetadataResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

