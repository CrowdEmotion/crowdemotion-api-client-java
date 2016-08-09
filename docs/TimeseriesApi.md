# TimeseriesApi

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timeseriesDelete**](TimeseriesApi.md#timeseriesDelete) | **DELETE** /timeseries | Delete a Timeseries
[**timeseriesGet**](TimeseriesApi.md#timeseriesGet) | **GET** /timeseries | Get all recorded timeseries for a Response


<a name="timeseriesDelete"></a>
# **timeseriesDelete**
> String timeseriesDelete(responseId, metricId)

Delete a Timeseries

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.TimeseriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TimeseriesApi apiInstance = new TimeseriesApi();
Integer responseId = 56; // Integer | ID of the Response associated to the TimeSeries.
Integer metricId = 56; // Integer | ID of the Metric of the Timeseries to be deleted.
try {
    String result = apiInstance.timeseriesDelete(responseId, metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeseriesApi#timeseriesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Integer**| ID of the Response associated to the TimeSeries. |
 **metricId** | **Integer**| ID of the Metric of the Timeseries to be deleted. | [optional]

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="timeseriesGet"></a>
# **timeseriesGet**
> List&lt;Timeseries&gt; timeseriesGet(responseId, metricId, normalize, format)

Get all recorded timeseries for a Response

&lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.TimeseriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TimeseriesApi apiInstance = new TimeseriesApi();
Integer responseId = 56; // Integer | ID of the Response associated to the TimeSeries.
Integer metricId = 56; // Integer | ID of the Metric associated to the TimeSeries.
Boolean normalize = true; // Boolean | Return data beetwen 0 and 1. Default: false.
String format = "format_example"; // String | If value is 'csv' then data is passed back in CSV format insted of the default time-series format. Example: csv.
try {
    List<Timeseries> result = apiInstance.timeseriesGet(responseId, metricId, normalize, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeseriesApi#timeseriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **Integer**| ID of the Response associated to the TimeSeries. |
 **metricId** | **Integer**| ID of the Metric associated to the TimeSeries. | [optional]
 **normalize** | **Boolean**| Return data beetwen 0 and 1. Default: false. | [optional]
 **format** | **String**| If value is &#39;csv&#39; then data is passed back in CSV format insted of the default time-series format. Example: csv. | [optional]

### Return type

[**List&lt;Timeseries&gt;**](Timeseries.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

