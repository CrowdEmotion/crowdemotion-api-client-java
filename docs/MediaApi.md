# MediaApi

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaGet**](MediaApi.md#mediaGet) | **GET** /media | Find all registered Media
[**mediaMediaIdDelete**](MediaApi.md#mediaMediaIdDelete) | **DELETE** /media/{media_id} | Delete Media
[**mediaMediaIdGet**](MediaApi.md#mediaMediaIdGet) | **GET** /media/{media_id} | Find a Media
[**mediaMediaIdPut**](MediaApi.md#mediaMediaIdPut) | **PUT** /media/{media_id} | Update a Media
[**mediaPost**](MediaApi.md#mediaPost) | **POST** /media | Create new Media


<a name="mediaGet"></a>
# **mediaGet**
> Media mediaGet(skip, limit, where, sort)

Find all registered Media

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer skip = 56; // Integer | The number of results to skip.
Integer limit = 56; // Integer | The maximum number of results to return.
String where = "where_example"; // String | JSON formatted string condition.
String sort = "sort_example"; // String | Attribute used to sort results.
try {
    Media result = apiInstance.mediaGet(skip, limit, where, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| The number of results to skip. | [optional]
 **limit** | **Integer**| The maximum number of results to return. | [optional]
 **where** | **String**| JSON formatted string condition. | [optional]
 **sort** | **String**| Attribute used to sort results. | [optional]

### Return type

[**Media**](Media.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mediaMediaIdDelete"></a>
# **mediaMediaIdDelete**
> String mediaMediaIdDelete(mediaId)

Delete Media

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer mediaId = 56; // Integer | 
try {
    String result = apiInstance.mediaMediaIdDelete(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaMediaIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **Integer**|  |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mediaMediaIdGet"></a>
# **mediaMediaIdGet**
> List&lt;Media&gt; mediaMediaIdGet(mediaId, presignedUrl)

Find a Media

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer mediaId = 56; // Integer | ID of Media to search.
Boolean presignedUrl = true; // Boolean | Returns the presignedUrl whose value is a signed (protected) URL to hosted video on our premises.
try {
    List<Media> result = apiInstance.mediaMediaIdGet(mediaId, presignedUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaMediaIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **Integer**| ID of Media to search. |
 **presignedUrl** | **Boolean**| Returns the presignedUrl whose value is a signed (protected) URL to hosted video on our premises. | [optional]

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mediaMediaIdPut"></a>
# **mediaMediaIdPut**
> Media mediaMediaIdPut(mediaId, body)

Update a Media

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer mediaId = 56; // Integer | 
MediaCreation body = new MediaCreation(); // MediaCreation | Request body
try {
    Media result = apiInstance.mediaMediaIdPut(mediaId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaMediaIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **Integer**|  |
 **body** | [**MediaCreation**](MediaCreation.md)| Request body |

### Return type

[**Media**](Media.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mediaPost"></a>
# **mediaPost**
> Media mediaPost(body)

Create new Media

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
MediaCreation body = new MediaCreation(); // MediaCreation | Request body
try {
    Media result = apiInstance.mediaPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MediaCreation**](MediaCreation.md)| Request body |

### Return type

[**Media**](Media.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

