# crowdemotion-api-client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>co.uk.crowdemotion</groupId>
    <artifactId>crowdemotion-api-client-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "co.uk.crowdemotion:crowdemotion-api-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/crowdemotion-api-client-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import co.uk.crowdemotion.*;
import co.uk.crowdemotion.auth.*;
import co.uk.crowdemotion.model.*;
import co.uk.crowdemotion.FaceVideoApi;

import java.io.File;
import java.util.*;

public class FaceVideoApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.crowdemotion.co.uk/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FaceVideoApi* | [**facevideoFacevideoIdDelete**](docs/FaceVideoApi.md#facevideoFacevideoIdDelete) | **DELETE** /facevideo/{facevideo_id} | Delete a FaceVideo
*FaceVideoApi* | [**facevideoGet**](docs/FaceVideoApi.md#facevideoGet) | **GET** /facevideo | Find a FaceVideo
*FaceVideoApi* | [**facevideoPost**](docs/FaceVideoApi.md#facevideoPost) | **POST** /facevideo | Analyse FaceVideo
*FaceVideoApi* | [**facevideoPut**](docs/FaceVideoApi.md#facevideoPut) | **PUT** /facevideo | Analyse FaceVideo
*MediaApi* | [**mediaGet**](docs/MediaApi.md#mediaGet) | **GET** /media | Find all registered Media
*MediaApi* | [**mediaMediaIdDelete**](docs/MediaApi.md#mediaMediaIdDelete) | **DELETE** /media/{media_id} | Delete Media
*MediaApi* | [**mediaMediaIdGet**](docs/MediaApi.md#mediaMediaIdGet) | **GET** /media/{media_id} | Find a Media
*MediaApi* | [**mediaMediaIdPut**](docs/MediaApi.md#mediaMediaIdPut) | **PUT** /media/{media_id} | Update a Media
*MediaApi* | [**mediaPost**](docs/MediaApi.md#mediaPost) | **POST** /media | Create new Media
*MetricApi* | [**metricGet**](docs/MetricApi.md#metricGet) | **GET** /metric | List all registered metrics
*MetricApi* | [**metricMetricIdDelete**](docs/MetricApi.md#metricMetricIdDelete) | **DELETE** /metric/{metric_id} | Delete a Metric
*MetricApi* | [**metricMetricIdGet**](docs/MetricApi.md#metricMetricIdGet) | **GET** /metric/{metric_id} | Find a Metric
*MetricApi* | [**metricPost**](docs/MetricApi.md#metricPost) | **POST** /metric | Create Metric
*ResearchApi* | [**researchGet**](docs/ResearchApi.md#researchGet) | **GET** /research | Find all Research
*ResearchApi* | [**researchPost**](docs/ResearchApi.md#researchPost) | **POST** /research | Create a Research Project
*ResearchApi* | [**researchResearchIdDelete**](docs/ResearchApi.md#researchResearchIdDelete) | **DELETE** /research/{research_id} | Delete Research Project
*ResearchApi* | [**researchResearchIdGet**](docs/ResearchApi.md#researchResearchIdGet) | **GET** /research/{research_id} | Find a Research Project
*ResearchApi* | [**researchResearchIdPut**](docs/ResearchApi.md#researchResearchIdPut) | **PUT** /research/{research_id} | Edit Research Project details
*RespondentApi* | [**respondentGet**](docs/RespondentApi.md#respondentGet) | **GET** /respondent | Find all Respondents of a Research
*RespondentApi* | [**respondentPost**](docs/RespondentApi.md#respondentPost) | **POST** /respondent | Create a Respondent
*RespondentApi* | [**respondentRespondentIdDelete**](docs/RespondentApi.md#respondentRespondentIdDelete) | **DELETE** /respondent/{respondent_id} | Delete a Respondent
*RespondentApi* | [**respondentRespondentIdGet**](docs/RespondentApi.md#respondentRespondentIdGet) | **GET** /respondent/{respondent_id} | Find a Respondent
*RespondentApi* | [**respondentRespondentIdMetadataGet**](docs/RespondentApi.md#respondentRespondentIdMetadataGet) | **GET** /respondent/{respondent_id}/metadata | Find Respondent Metadata
*RespondentApi* | [**respondentRespondentIdMetadataPost**](docs/RespondentApi.md#respondentRespondentIdMetadataPost) | **POST** /respondent/{respondent_id}/metadata | Add Respondent Metadata
*RespondentApi* | [**respondentRespondentIdPut**](docs/RespondentApi.md#respondentRespondentIdPut) | **PUT** /respondent/{respondent_id} | Update a Respondent
*ResponseApi* | [**responseGet**](docs/ResponseApi.md#responseGet) | **GET** /response | Find all Responses
*ResponseApi* | [**responsePost**](docs/ResponseApi.md#responsePost) | **POST** /response | Create a Response
*ResponseApi* | [**responseResponseIdDelete**](docs/ResponseApi.md#responseResponseIdDelete) | **DELETE** /response/{response_id} | Delete a Response
*ResponseApi* | [**responseResponseIdGet**](docs/ResponseApi.md#responseResponseIdGet) | **GET** /response/{response_id} | Find a Response
*ResponseApi* | [**responseResponseIdMetadataGet**](docs/ResponseApi.md#responseResponseIdMetadataGet) | **GET** /response/{response_id}/metadata | Show Response Metadata
*ResponseApi* | [**responseResponseIdMetadataPost**](docs/ResponseApi.md#responseResponseIdMetadataPost) | **POST** /response/{response_id}/metadata | Add Response Metadata
*ResponseApi* | [**responseResponseIdPut**](docs/ResponseApi.md#responseResponseIdPut) | **PUT** /response/{response_id} | Update a Response
*TimeseriesApi* | [**timeseriesDelete**](docs/TimeseriesApi.md#timeseriesDelete) | **DELETE** /timeseries | Delete a Timeseries
*TimeseriesApi* | [**timeseriesGet**](docs/TimeseriesApi.md#timeseriesGet) | **GET** /timeseries | Get all recorded timeseries for a Response
*UserApi* | [**userIdGet**](docs/UserApi.md#userIdGet) | **GET** /user/{id} | Get User information
*UserApi* | [**userIdPut**](docs/UserApi.md#userIdPut) | **PUT** /user/{id} | Edit User information
*UserApi* | [**userLoginPost**](docs/UserApi.md#userLoginPost) | **POST** /user/login | User Login
*UserApi* | [**userUserIdMetadataGet**](docs/UserApi.md#userUserIdMetadataGet) | **GET** /user/{user_id}/metadata | Find User metadata
*UserApi* | [**userUserIdMetadataPost**](docs/UserApi.md#userUserIdMetadataPost) | **POST** /user/{user_id}/metadata | Add user metadata


## Documentation for Models

 - [ContentDetails](docs/ContentDetails.md)
 - [Data](docs/Data.md)
 - [FaceVideo](docs/FaceVideo.md)
 - [FaceVideoUpload](docs/FaceVideoUpload.md)
 - [Login](docs/Login.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [Media](docs/Media.md)
 - [MediaCreation](docs/MediaCreation.md)
 - [Metric](docs/Metric.md)
 - [MetricCreation](docs/MetricCreation.md)
 - [Research](docs/Research.md)
 - [ResearchCreation](docs/ResearchCreation.md)
 - [Respondent](docs/Respondent.md)
 - [RespondentMetadata](docs/RespondentMetadata.md)
 - [RespondentMetadataResponse](docs/RespondentMetadataResponse.md)
 - [Response](docs/Response.md)
 - [ResponseCreation](docs/ResponseCreation.md)
 - [ResponseMetadata](docs/ResponseMetadata.md)
 - [ResponseMetadataResponse](docs/ResponseMetadataResponse.md)
 - [Statistics](docs/Statistics.md)
 - [Stats](docs/Stats.md)
 - [Status](docs/Status.md)
 - [Tags](docs/Tags.md)
 - [Timeseries](docs/Timeseries.md)
 - [User](docs/User.md)
 - [UserMetadata](docs/UserMetadata.md)
 - [UserMetadataResponse](docs/UserMetadataResponse.md)
 - [UserUpdateBody](docs/UserUpdateBody.md)
 - [Videodetails](docs/Videodetails.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



