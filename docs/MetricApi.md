# MetricApi

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metricGet**](MetricApi.md#metricGet) | **GET** /metric | List all registered metrics
[**metricMetricIdDelete**](MetricApi.md#metricMetricIdDelete) | **DELETE** /metric/{metric_id} | Delete a Metric
[**metricMetricIdGet**](MetricApi.md#metricMetricIdGet) | **GET** /metric/{metric_id} | Find a Metric
[**metricPost**](MetricApi.md#metricPost) | **POST** /metric | Create Metric


<a name="metricGet"></a>
# **metricGet**
> List&lt;Metric&gt; metricGet(skip, limit, where, sort)

List all registered metrics

&lt;p&gt;Metrics are linked to time-series and define their meaning.&lt;/p&gt; &lt;p&gt;Common metric ID are listed below:&lt;/p&gt; &lt;table&gt;   &lt;tr&gt;&lt;td&gt;id&lt;/td&gt;&lt;td&gt;Value&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;Timestamp&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;2&lt;/td&gt;&lt;td&gt;Neutral&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;3&lt;/td&gt;&lt;td&gt;Happiness&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;4&lt;/td&gt;&lt;td&gt;Surprise&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;5&lt;/td&gt;&lt;td&gt;Puzzlement&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;6&lt;/td&gt;&lt;td&gt;Disgust&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;7&lt;/td&gt;&lt;td&gt;Fear&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;8&lt;/td&gt;&lt;td&gt;Sadness&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MetricApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MetricApi apiInstance = new MetricApi();
Integer skip = 56; // Integer | The number of results to skip.
Integer limit = 56; // Integer | The maximum number of results to return.
String where = "where_example"; // String | JSON formatted string condition.
String sort = "sort_example"; // String | Attribute used to sort results.
try {
    List<Metric> result = apiInstance.metricGet(skip, limit, where, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricApi#metricGet");
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

[**List&lt;Metric&gt;**](Metric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="metricMetricIdDelete"></a>
# **metricMetricIdDelete**
> Metric metricMetricIdDelete(metricId)

Delete a Metric

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MetricApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MetricApi apiInstance = new MetricApi();
Integer metricId = 56; // Integer | ID of Metric to be deleted.
try {
    Metric result = apiInstance.metricMetricIdDelete(metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricApi#metricMetricIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricId** | **Integer**| ID of Metric to be deleted. |

### Return type

[**Metric**](Metric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="metricMetricIdGet"></a>
# **metricMetricIdGet**
> Metric metricMetricIdGet(metricId)

Find a Metric

&lt;p&gt;Metrics are linked to time-series and define their meaning.&lt;/p&gt; &lt;p&gt;Common metric ID are listed below:&lt;/p&gt; &lt;table&gt;   &lt;tr&gt;&lt;td&gt;id&lt;/td&gt;&lt;td&gt;Value&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;Timestamp&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;2&lt;/td&gt;&lt;td&gt;Neutral&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;3&lt;/td&gt;&lt;td&gt;Happiness&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;4&lt;/td&gt;&lt;td&gt;Surprise&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;5&lt;/td&gt;&lt;td&gt;Puzzlement&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;6&lt;/td&gt;&lt;td&gt;Disgust&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;7&lt;/td&gt;&lt;td&gt;Fear&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;8&lt;/td&gt;&lt;td&gt;Sadness&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MetricApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MetricApi apiInstance = new MetricApi();
Integer metricId = 56; // Integer | ID of Metric to find.
try {
    Metric result = apiInstance.metricMetricIdGet(metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricApi#metricMetricIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricId** | **Integer**| ID of Metric to find. |

### Return type

[**Metric**](Metric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="metricPost"></a>
# **metricPost**
> Metric metricPost(body)

Create Metric

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.MetricApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MetricApi apiInstance = new MetricApi();
MetricCreation body = new MetricCreation(); // MetricCreation | Request body
try {
    Metric result = apiInstance.metricPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricApi#metricPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetricCreation**](MetricCreation.md)| Request body |

### Return type

[**Metric**](Metric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

