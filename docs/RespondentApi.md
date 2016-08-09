# RespondentApi

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**respondentGet**](RespondentApi.md#respondentGet) | **GET** /respondent | Find all Respondents of a Research
[**respondentPost**](RespondentApi.md#respondentPost) | **POST** /respondent | Create a Respondent
[**respondentRespondentIdDelete**](RespondentApi.md#respondentRespondentIdDelete) | **DELETE** /respondent/{respondent_id} | Delete a Respondent
[**respondentRespondentIdGet**](RespondentApi.md#respondentRespondentIdGet) | **GET** /respondent/{respondent_id} | Find a Respondent
[**respondentRespondentIdMetadataGet**](RespondentApi.md#respondentRespondentIdMetadataGet) | **GET** /respondent/{respondent_id}/metadata | Find Respondent Metadata
[**respondentRespondentIdMetadataPost**](RespondentApi.md#respondentRespondentIdMetadataPost) | **POST** /respondent/{respondent_id}/metadata | Add Respondent Metadata
[**respondentRespondentIdPut**](RespondentApi.md#respondentRespondentIdPut) | **PUT** /respondent/{respondent_id} | Update a Respondent


<a name="respondentGet"></a>
# **respondentGet**
> List&lt;Respondent&gt; respondentGet(researchId, skip, limit, where, sort)

Find all Respondents of a Research

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.RespondentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RespondentApi apiInstance = new RespondentApi();
Integer researchId = 56; // Integer | Search by research id.
Integer skip = 56; // Integer | The number of results to skip.
Integer limit = 56; // Integer | The maximum number of results to return.
String where = "where_example"; // String | JSON formatted string.
String sort = "sort_example"; // String | Attribute used to sort results.
try {
    List<Respondent> result = apiInstance.respondentGet(researchId, skip, limit, where, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RespondentApi#respondentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **researchId** | **Integer**| Search by research id. |
 **skip** | **Integer**| The number of results to skip. | [optional]
 **limit** | **Integer**| The maximum number of results to return. | [optional]
 **where** | **String**| JSON formatted string. | [optional]
 **sort** | **String**| Attribute used to sort results. | [optional]

### Return type

[**List&lt;Respondent&gt;**](Respondent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="respondentPost"></a>
# **respondentPost**
> Respondent respondentPost(body)

Create a Respondent

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.RespondentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RespondentApi apiInstance = new RespondentApi();
Respondent body = new Respondent(); // Respondent | Request body
try {
    Respondent result = apiInstance.respondentPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RespondentApi#respondentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Respondent**](Respondent.md)| Request body |

### Return type

[**Respondent**](Respondent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="respondentRespondentIdDelete"></a>
# **respondentRespondentIdDelete**
> String respondentRespondentIdDelete(respondentId)

Delete a Respondent

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.RespondentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RespondentApi apiInstance = new RespondentApi();
Integer respondentId = 56; // Integer | 
try {
    String result = apiInstance.respondentRespondentIdDelete(respondentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RespondentApi#respondentRespondentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **respondentId** | **Integer**|  |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="respondentRespondentIdGet"></a>
# **respondentRespondentIdGet**
> Respondent respondentRespondentIdGet(respondentId)

Find a Respondent

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.RespondentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RespondentApi apiInstance = new RespondentApi();
Integer respondentId = 56; // Integer | Search by research id.
try {
    Respondent result = apiInstance.respondentRespondentIdGet(respondentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RespondentApi#respondentRespondentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **respondentId** | **Integer**| Search by research id. |

### Return type

[**Respondent**](Respondent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="respondentRespondentIdMetadataGet"></a>
# **respondentRespondentIdMetadataGet**
> RespondentMetadataResponse respondentRespondentIdMetadataGet(respondentId)

Find Respondent Metadata

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.RespondentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RespondentApi apiInstance = new RespondentApi();
Integer respondentId = 56; // Integer | ID of the Respondent
try {
    RespondentMetadataResponse result = apiInstance.respondentRespondentIdMetadataGet(respondentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RespondentApi#respondentRespondentIdMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **respondentId** | **Integer**| ID of the Respondent |

### Return type

[**RespondentMetadataResponse**](RespondentMetadataResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="respondentRespondentIdMetadataPost"></a>
# **respondentRespondentIdMetadataPost**
> RespondentMetadataResponse respondentRespondentIdMetadataPost(respondentId, body)

Add Respondent Metadata

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.RespondentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RespondentApi apiInstance = new RespondentApi();
Integer respondentId = 56; // Integer | 
RespondentMetadata body = new RespondentMetadata(); // RespondentMetadata | Request body
try {
    RespondentMetadataResponse result = apiInstance.respondentRespondentIdMetadataPost(respondentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RespondentApi#respondentRespondentIdMetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **respondentId** | **Integer**|  |
 **body** | [**RespondentMetadata**](RespondentMetadata.md)| Request body |

### Return type

[**RespondentMetadataResponse**](RespondentMetadataResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="respondentRespondentIdPut"></a>
# **respondentRespondentIdPut**
> Respondent respondentRespondentIdPut(respondentId, body)

Update a Respondent

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.RespondentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RespondentApi apiInstance = new RespondentApi();
Integer respondentId = 56; // Integer | 
Respondent body = new Respondent(); // Respondent | Request body
try {
    Respondent result = apiInstance.respondentRespondentIdPut(respondentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RespondentApi#respondentRespondentIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **respondentId** | **Integer**|  |
 **body** | [**Respondent**](Respondent.md)| Request body |

### Return type

[**Respondent**](Respondent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

