# ResponseApi

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**responseGet**](ResponseApi.md#responseGet) | **GET** /response | Find all Responses
[**responsePost**](ResponseApi.md#responsePost) | **POST** /response | Create a Response
[**responseResponseIdDelete**](ResponseApi.md#responseResponseIdDelete) | **DELETE** /response/{response_id} | Delete a Response
[**responseResponseIdGet**](ResponseApi.md#responseResponseIdGet) | **GET** /response/{response_id} | Find a Response
[**responseResponseIdMetadataGet**](ResponseApi.md#responseResponseIdMetadataGet) | **GET** /response/{response_id}/metadata | Show Response Metadata
[**responseResponseIdMetadataPost**](ResponseApi.md#responseResponseIdMetadataPost) | **POST** /response/{response_id}/metadata | Add Response Metadata
[**responseResponseIdPut**](ResponseApi.md#responseResponseIdPut) | **PUT** /response/{response_id} | Update a Response


<a name="responseGet"></a>
# **responseGet**
> List&lt;Response&gt; responseGet(skip, limit, where, sort)

Find all Responses

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResponseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResponseApi apiInstance = new ResponseApi();
Integer skip = 56; // Integer | The number of results to skip.
Integer limit = 56; // Integer | The maximum number of results to return.
String where = "where_example"; // String | JSON formatted string.
String sort = "sort_example"; // String | Attribute used to sort results.
try {
    List<Response> result = apiInstance.responseGet(skip, limit, where, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseApi#responseGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| The number of results to skip. | [optional]
 **limit** | **Integer**| The maximum number of results to return. | [optional]
 **where** | **String**| JSON formatted string. | [optional]
 **sort** | **String**| Attribute used to sort results. | [optional]

### Return type

[**List&lt;Response&gt;**](Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="responsePost"></a>
# **responsePost**
> Response responsePost(body)

Create a Response

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResponseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResponseApi apiInstance = new ResponseApi();
ResponseCreation body = new ResponseCreation(); // ResponseCreation | Request body
try {
    Response result = apiInstance.responsePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseApi#responsePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResponseCreation**](ResponseCreation.md)| Request body |

### Return type

[**Response**](Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="responseResponseIdDelete"></a>
# **responseResponseIdDelete**
> String responseResponseIdDelete(responseId)

Delete a Response

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResponseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResponseApi apiInstance = new ResponseApi();
Integer responseId = 56; // Integer | ID of Response to update.
try {
    String result = apiInstance.responseResponseIdDelete(responseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseApi#responseResponseIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Integer**| ID of Response to update. |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="responseResponseIdGet"></a>
# **responseResponseIdGet**
> Response responseResponseIdGet(responseId)

Find a Response

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResponseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResponseApi apiInstance = new ResponseApi();
Integer responseId = 56; // Integer | ID of the Response
try {
    Response result = apiInstance.responseResponseIdGet(responseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseApi#responseResponseIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Integer**| ID of the Response |

### Return type

[**Response**](Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="responseResponseIdMetadataGet"></a>
# **responseResponseIdMetadataGet**
> ResponseMetadataResponse responseResponseIdMetadataGet(responseId)

Show Response Metadata

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResponseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResponseApi apiInstance = new ResponseApi();
Integer responseId = 56; // Integer | ID of the Response
try {
    ResponseMetadataResponse result = apiInstance.responseResponseIdMetadataGet(responseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseApi#responseResponseIdMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Integer**| ID of the Response |

### Return type

[**ResponseMetadataResponse**](ResponseMetadataResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="responseResponseIdMetadataPost"></a>
# **responseResponseIdMetadataPost**
> ResponseMetadataResponse responseResponseIdMetadataPost(responseId, body)

Add Response Metadata

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResponseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResponseApi apiInstance = new ResponseApi();
Integer responseId = 56; // Integer | ID of the Response.
ResponseMetadata body = new ResponseMetadata(); // ResponseMetadata | Request body
try {
    ResponseMetadataResponse result = apiInstance.responseResponseIdMetadataPost(responseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseApi#responseResponseIdMetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Integer**| ID of the Response. |
 **body** | [**ResponseMetadata**](ResponseMetadata.md)| Request body |

### Return type

[**ResponseMetadataResponse**](ResponseMetadataResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="responseResponseIdPut"></a>
# **responseResponseIdPut**
> Response responseResponseIdPut(responseId, body)

Update a Response

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResponseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResponseApi apiInstance = new ResponseApi();
Integer responseId = 56; // Integer | ID of Response to update.
ResponseCreation body = new ResponseCreation(); // ResponseCreation | Request body
try {
    Response result = apiInstance.responseResponseIdPut(responseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseApi#responseResponseIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Integer**| ID of Response to update. |
 **body** | [**ResponseCreation**](ResponseCreation.md)| Request body |

### Return type

[**Response**](Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

