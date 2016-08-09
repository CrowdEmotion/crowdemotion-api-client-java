# FaceVideoApi

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**facevideoFacevideoIdDelete**](FaceVideoApi.md#facevideoFacevideoIdDelete) | **DELETE** /facevideo/{facevideo_id} | Delete a FaceVideo
[**facevideoGet**](FaceVideoApi.md#facevideoGet) | **GET** /facevideo | Find a FaceVideo
[**facevideoPost**](FaceVideoApi.md#facevideoPost) | **POST** /facevideo | Analyse FaceVideo
[**facevideoPut**](FaceVideoApi.md#facevideoPut) | **PUT** /facevideo | Analyse FaceVideo


<a name="facevideoFacevideoIdDelete"></a>
# **facevideoFacevideoIdDelete**
> String facevideoFacevideoIdDelete(facevideoId)

Delete a FaceVideo

&lt;p&gt;Use this operation to delete a FaceVideo.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.FaceVideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FaceVideoApi apiInstance = new FaceVideoApi();
Integer facevideoId = 56; // Integer | ID of FaceVideo to be deleted.
try {
    String result = apiInstance.facevideoFacevideoIdDelete(facevideoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceVideoApi#facevideoFacevideoIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facevideoId** | **Integer**| ID of FaceVideo to be deleted. |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="facevideoGet"></a>
# **facevideoGet**
> FaceVideo facevideoGet(facevideoId, responseId)

Find a FaceVideo

&lt;p&gt;Use this operation to access information about the FaceVideo analysis.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Any one of the two parameters must be specified.&lt;/i&gt;&lt;/p&gt; &lt;p&gt;To discover if the video has been analyzed, check the meaning of status field in the following table:&lt;/p&gt; &lt;table&gt;   &lt;tr&gt;&lt;td&gt;Value&lt;/td&gt; &lt;td&gt;Description&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0&lt;/td&gt; &lt;td&gt;Not started&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;1&lt;/td&gt; &lt;td&gt;Processing started&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;2&lt;/td&gt; &lt;td&gt;Processing completed&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;-1&lt;/td&gt; &lt;td&gt;Error&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.FaceVideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FaceVideoApi apiInstance = new FaceVideoApi();
Integer facevideoId = 56; // Integer | FaceVideo ID. NOTE: Only this parameter is considered if both are specified.
Integer responseId = 56; // Integer | Response ID corresponding to the FaceVideo.
try {
    FaceVideo result = apiInstance.facevideoGet(facevideoId, responseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceVideoApi#facevideoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facevideoId** | **Integer**| FaceVideo ID. NOTE: Only this parameter is considered if both are specified. | [optional]
 **responseId** | **Integer**| Response ID corresponding to the FaceVideo. | [optional]

### Return type

[**FaceVideo**](FaceVideo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="facevideoPost"></a>
# **facevideoPost**
> FaceVideo facevideoPost(filename, sandbox, responseId, researchId, mediaId, respondentId, processVideo)

Analyse FaceVideo

&lt;p&gt;Starts the analysis of a single FaceVideo (in the supported formats) through either:&lt;/p&gt; &lt;ol&gt;   &lt;li&gt;a video URL pointing to a resource accessible through the Internet without authentication&lt;/li&gt;   &lt;li&gt;the binary contents of the video in the request&#39;s body, encoded as &lt;code&gt;multipart/form-data&lt;/code&gt; content type&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;The third option is a &lt;code&gt;PUT&lt;/code&gt; call to &lt;code&gt;/v1/facevideo/{filename}&lt;/code&gt; (&lt;code&gt;filename&lt;/code&gt; required string e.g. &lt;code&gt;facevideo1.mp4&lt;/code&gt;) which supports all the URL parameters as above with a body encoding &lt;code&gt;application/octet-stream&lt;/code&gt; and the file contents as plain binary: this call makes uploads more efficient but it does not respect HTTP/RESTful standards so it may be not supported in future.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.FaceVideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FaceVideoApi apiInstance = new FaceVideoApi();
File filename = new File("/path/to/file.txt"); // File | FaceVideo to be analysed.
Boolean sandbox = true; // Boolean | Generates random data for testing, at no cost. Default: false.
Integer responseId = 56; // Integer | Associates this Facevideo to a previously generated Response.
Integer researchId = 56; // Integer | Associates this Facevideo to a previously generated Research.
Integer mediaId = 56; // Integer | Associates this Facevideo to a previously generated Media.
Integer respondentId = 56; // Integer | Associates this Facevideo to a previously generated Respondent.
Boolean processVideo = true; // Boolean | Actually processes the video. Default: true.
try {
    FaceVideo result = apiInstance.facevideoPost(filename, sandbox, responseId, researchId, mediaId, respondentId, processVideo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceVideoApi#facevideoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **File**| FaceVideo to be analysed. | [optional]
 **sandbox** | **Boolean**| Generates random data for testing, at no cost. Default: false. | [optional]
 **responseId** | **Integer**| Associates this Facevideo to a previously generated Response. | [optional]
 **researchId** | **Integer**| Associates this Facevideo to a previously generated Research. | [optional]
 **mediaId** | **Integer**| Associates this Facevideo to a previously generated Media. | [optional]
 **respondentId** | **Integer**| Associates this Facevideo to a previously generated Respondent. | [optional]
 **processVideo** | **Boolean**| Actually processes the video. Default: true. | [optional]

### Return type

[**FaceVideo**](FaceVideo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="facevideoPut"></a>
# **facevideoPut**
> FaceVideo facevideoPut(sandbox, responseId, researchId, mediaId, respondentId, processVideo, body)

Analyse FaceVideo

&lt;p&gt;Starts the analysis of a single FaceVideo (in the supported formats) through either:&lt;/p&gt; &lt;ol&gt;   &lt;li&gt;a video URL pointing to a resource accessible through the Internet without authentication&lt;/li&gt;   &lt;li&gt;the binary contents of the video in the request&#39;s body, encoded as &lt;code&gt;multipart/form-data&lt;/code&gt; content type&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;The third option is a &lt;code&gt;PUT&lt;/code&gt; call to &lt;code&gt;/v1/facevideo/{filename}&lt;/code&gt; (&lt;code&gt;filename&lt;/code&gt; required string e.g. &lt;code&gt;facevideo1.mp4&lt;/code&gt;) which supports all the URL parameters as above with a body encoding &lt;code&gt;application/octet-stream&lt;/code&gt; and the file contents as plain binary: this call makes uploads more efficient but it does not respect HTTP/RESTful standards so it may be not supported in future.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;

### Example
```java
// Import classes:
//import co.uk.crowdemotion.ApiClient;
//import co.uk.crowdemotion.ApiException;
//import co.uk.crowdemotion.Configuration;
//import co.uk.crowdemotion.auth.*;
//import co.uk.crowdemotion.FaceVideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FaceVideoApi apiInstance = new FaceVideoApi();
Boolean sandbox = true; // Boolean | Generates random data for testing, at no cost. Default: false.
Integer responseId = 56; // Integer | Associates this Facevideo to a previously generated Response.
Integer researchId = 56; // Integer | Associates this Facevideo to a previously generated Research.
Integer mediaId = 56; // Integer | Associates this Facevideo to a previously generated Media.
Integer respondentId = 56; // Integer | Associates this Facevideo to a previously generated Respondent.
Boolean processVideo = true; // Boolean | Actually processes the video. Default: true.
FaceVideoUpload body = new FaceVideoUpload(); // FaceVideoUpload | Request body
try {
    FaceVideo result = apiInstance.facevideoPut(sandbox, responseId, researchId, mediaId, respondentId, processVideo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceVideoApi#facevideoPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sandbox** | **Boolean**| Generates random data for testing, at no cost. Default: false. | [optional]
 **responseId** | **Integer**| Associates this Facevideo to a previously generated Response. | [optional]
 **researchId** | **Integer**| Associates this Facevideo to a previously generated Research. | [optional]
 **mediaId** | **Integer**| Associates this Facevideo to a previously generated Media. | [optional]
 **respondentId** | **Integer**| Associates this Facevideo to a previously generated Respondent. | [optional]
 **processVideo** | **Boolean**| Actually processes the video. Default: true. | [optional]
 **body** | [**FaceVideoUpload**](FaceVideoUpload.md)| Request body | [optional]

### Return type

[**FaceVideo**](FaceVideo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

