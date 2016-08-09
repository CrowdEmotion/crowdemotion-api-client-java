# ResearchApi

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**researchGet**](ResearchApi.md#researchGet) | **GET** /research | Find all Research
[**researchPost**](ResearchApi.md#researchPost) | **POST** /research | Create a Research Project
[**researchResearchIdDelete**](ResearchApi.md#researchResearchIdDelete) | **DELETE** /research/{research_id} | Delete Research Project
[**researchResearchIdGet**](ResearchApi.md#researchResearchIdGet) | **GET** /research/{research_id} | Find a Research Project
[**researchResearchIdPut**](ResearchApi.md#researchResearchIdPut) | **PUT** /research/{research_id} | Edit Research Project details


<a name="researchGet"></a>
# **researchGet**
> List&lt;Research&gt; researchGet(skip, limit, where, sort)

Find all Research

&lt;p&gt;Returns all the Research created by an admin user.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResearchApi apiInstance = new ResearchApi();
Integer skip = 56; // Integer | The number of results to skip.
Integer limit = 56; // Integer | The maximum number of results to return.
String where = "where_example"; // String | JSON formatted string condition.
String sort = "sort_example"; // String | Attribute used to sort results.
try {
    List<Research> result = apiInstance.researchGet(skip, limit, where, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResearchApi#researchGet");
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

[**List&lt;Research&gt;**](Research.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="researchPost"></a>
# **researchPost**
> Research researchPost(body)

Create a Research Project

&lt;p&gt;New research projects can only be created with an admin account.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResearchApi apiInstance = new ResearchApi();
ResearchCreation body = new ResearchCreation(); // ResearchCreation | Request body
try {
    Research result = apiInstance.researchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResearchApi#researchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResearchCreation**](ResearchCreation.md)| Request body |

### Return type

[**Research**](Research.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="researchResearchIdDelete"></a>
# **researchResearchIdDelete**
> String researchResearchIdDelete(researchId)

Delete Research Project

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResearchApi apiInstance = new ResearchApi();
Integer researchId = 56; // Integer | 
try {
    String result = apiInstance.researchResearchIdDelete(researchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResearchApi#researchResearchIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **researchId** | **Integer**|  |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="researchResearchIdGet"></a>
# **researchResearchIdGet**
> Research researchResearchIdGet(researchId)

Find a Research Project

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResearchApi apiInstance = new ResearchApi();
Integer researchId = 56; // Integer | ID of Research Project to be found.
try {
    Research result = apiInstance.researchResearchIdGet(researchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResearchApi#researchResearchIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **researchId** | **Integer**| ID of Research Project to be found. |

### Return type

[**Research**](Research.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="researchResearchIdPut"></a>
# **researchResearchIdPut**
> Research researchResearchIdPut(researchId, body)

Edit Research Project details

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.ResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ResearchApi apiInstance = new ResearchApi();
Integer researchId = 56; // Integer | 
ResearchCreation body = new ResearchCreation(); // ResearchCreation | Request body
try {
    Research result = apiInstance.researchResearchIdPut(researchId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResearchApi#researchResearchIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **researchId** | **Integer**|  |
 **body** | [**ResearchCreation**](ResearchCreation.md)| Request body |

### Return type

[**Research**](Research.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

