/**
 * CloudEmotion API v1
 * CrowdEmotion API
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package co.uk.crowdemotion;

import co.uk.crowdemotion.ApiCallback;
import co.uk.crowdemotion.ApiClient;
import co.uk.crowdemotion.ApiException;
import co.uk.crowdemotion.ApiResponse;
import co.uk.crowdemotion.Configuration;
import co.uk.crowdemotion.Pair;
import co.uk.crowdemotion.ProgressRequestBody;
import co.uk.crowdemotion.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.FaceVideo;
import java.io.File;
import io.swagger.client.model.FaceVideoUpload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FaceVideoApi {
    private ApiClient apiClient;

    public FaceVideoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FaceVideoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for facevideoFacevideoIdDelete */
    private com.squareup.okhttp.Call facevideoFacevideoIdDeleteCall(Integer facevideoId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'facevideoId' is set
        if (facevideoId == null) {
            throw new ApiException("Missing the required parameter 'facevideoId' when calling facevideoFacevideoIdDelete(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/facevideo/{facevideo_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "facevideo_id" + "\\}", apiClient.escapeString(facevideoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete a FaceVideo
     * &lt;p&gt;Use this operation to delete a FaceVideo.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     * @param facevideoId ID of FaceVideo to be deleted. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String facevideoFacevideoIdDelete(Integer facevideoId) throws ApiException {
        ApiResponse<String> resp = facevideoFacevideoIdDeleteWithHttpInfo(facevideoId);
        return resp.getData();
    }

    /**
     * Delete a FaceVideo
     * &lt;p&gt;Use this operation to delete a FaceVideo.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     * @param facevideoId ID of FaceVideo to be deleted. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> facevideoFacevideoIdDeleteWithHttpInfo(Integer facevideoId) throws ApiException {
        com.squareup.okhttp.Call call = facevideoFacevideoIdDeleteCall(facevideoId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a FaceVideo (asynchronously)
     * &lt;p&gt;Use this operation to delete a FaceVideo.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✗ Respondent ✗ Customer ✓ Manager&lt;/p&gt;
     * @param facevideoId ID of FaceVideo to be deleted. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call facevideoFacevideoIdDeleteAsync(Integer facevideoId, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = facevideoFacevideoIdDeleteCall(facevideoId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for facevideoGet */
    private com.squareup.okhttp.Call facevideoGetCall(Integer facevideoId, Integer responseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/facevideo".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (facevideoId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "facevideo_id", facevideoId));
        if (responseId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "response_id", responseId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Find a FaceVideo
     * &lt;p&gt;Use this operation to access information about the FaceVideo analysis.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Any one of the two parameters must be specified.&lt;/i&gt;&lt;/p&gt; &lt;p&gt;To discover if the video has been analyzed, check the meaning of status field in the following table:&lt;/p&gt; &lt;table&gt;   &lt;tr&gt;&lt;td&gt;Value&lt;/td&gt; &lt;td&gt;Description&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0&lt;/td&gt; &lt;td&gt;Not started&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;1&lt;/td&gt; &lt;td&gt;Processing started&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;2&lt;/td&gt; &lt;td&gt;Processing completed&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;-1&lt;/td&gt; &lt;td&gt;Error&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param facevideoId FaceVideo ID. NOTE: Only this parameter is considered if both are specified. (optional)
     * @param responseId Response ID corresponding to the FaceVideo. (optional)
     * @return FaceVideo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FaceVideo facevideoGet(Integer facevideoId, Integer responseId) throws ApiException {
        ApiResponse<FaceVideo> resp = facevideoGetWithHttpInfo(facevideoId, responseId);
        return resp.getData();
    }

    /**
     * Find a FaceVideo
     * &lt;p&gt;Use this operation to access information about the FaceVideo analysis.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Any one of the two parameters must be specified.&lt;/i&gt;&lt;/p&gt; &lt;p&gt;To discover if the video has been analyzed, check the meaning of status field in the following table:&lt;/p&gt; &lt;table&gt;   &lt;tr&gt;&lt;td&gt;Value&lt;/td&gt; &lt;td&gt;Description&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0&lt;/td&gt; &lt;td&gt;Not started&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;1&lt;/td&gt; &lt;td&gt;Processing started&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;2&lt;/td&gt; &lt;td&gt;Processing completed&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;-1&lt;/td&gt; &lt;td&gt;Error&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param facevideoId FaceVideo ID. NOTE: Only this parameter is considered if both are specified. (optional)
     * @param responseId Response ID corresponding to the FaceVideo. (optional)
     * @return ApiResponse&lt;FaceVideo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FaceVideo> facevideoGetWithHttpInfo(Integer facevideoId, Integer responseId) throws ApiException {
        com.squareup.okhttp.Call call = facevideoGetCall(facevideoId, responseId, null, null);
        Type localVarReturnType = new TypeToken<FaceVideo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find a FaceVideo (asynchronously)
     * &lt;p&gt;Use this operation to access information about the FaceVideo analysis.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Any one of the two parameters must be specified.&lt;/i&gt;&lt;/p&gt; &lt;p&gt;To discover if the video has been analyzed, check the meaning of status field in the following table:&lt;/p&gt; &lt;table&gt;   &lt;tr&gt;&lt;td&gt;Value&lt;/td&gt; &lt;td&gt;Description&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0&lt;/td&gt; &lt;td&gt;Not started&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;1&lt;/td&gt; &lt;td&gt;Processing started&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;2&lt;/td&gt; &lt;td&gt;Processing completed&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;-1&lt;/td&gt; &lt;td&gt;Error&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param facevideoId FaceVideo ID. NOTE: Only this parameter is considered if both are specified. (optional)
     * @param responseId Response ID corresponding to the FaceVideo. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call facevideoGetAsync(Integer facevideoId, Integer responseId, final ApiCallback<FaceVideo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = facevideoGetCall(facevideoId, responseId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FaceVideo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for facevideoPost */
    private com.squareup.okhttp.Call facevideoPostCall(File filename, Boolean sandbox, Integer responseId, Integer researchId, Integer mediaId, Integer respondentId, Boolean processVideo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/facevideo".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (sandbox != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sandbox", sandbox));
        if (responseId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "response_id", responseId));
        if (researchId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "research_id", researchId));
        if (mediaId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media_id", mediaId));
        if (respondentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "respondent_id", respondentId));
        if (processVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "processVideo", processVideo));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (filename != null)
        localVarFormParams.put("filename", filename);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Analyse FaceVideo
     * &lt;p&gt;Starts the analysis of a single FaceVideo (in the supported formats) through either:&lt;/p&gt; &lt;ol&gt;   &lt;li&gt;a video URL pointing to a resource accessible through the Internet without authentication&lt;/li&gt;   &lt;li&gt;the binary contents of the video in the request&#39;s body, encoded as &lt;code&gt;multipart/form-data&lt;/code&gt; content type&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;The third option is a &lt;code&gt;PUT&lt;/code&gt; call to &lt;code&gt;/v1/facevideo/{filename}&lt;/code&gt; (&lt;code&gt;filename&lt;/code&gt; required string e.g. &lt;code&gt;facevideo1.mp4&lt;/code&gt;) which supports all the URL parameters as above with a body encoding &lt;code&gt;application/octet-stream&lt;/code&gt; and the file contents as plain binary: this call makes uploads more efficient but it does not respect HTTP/RESTful standards so it may be not supported in future.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param filename FaceVideo to be analysed. (optional)
     * @param sandbox Generates random data for testing, at no cost. Default: false. (optional)
     * @param responseId Associates this Facevideo to a previously generated Response. (optional)
     * @param researchId Associates this Facevideo to a previously generated Research. (optional)
     * @param mediaId Associates this Facevideo to a previously generated Media. (optional)
     * @param respondentId Associates this Facevideo to a previously generated Respondent. (optional)
     * @param processVideo Actually processes the video. Default: true. (optional)
     * @return FaceVideo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FaceVideo facevideoPost(File filename, Boolean sandbox, Integer responseId, Integer researchId, Integer mediaId, Integer respondentId, Boolean processVideo) throws ApiException {
        ApiResponse<FaceVideo> resp = facevideoPostWithHttpInfo(filename, sandbox, responseId, researchId, mediaId, respondentId, processVideo);
        return resp.getData();
    }

    /**
     * Analyse FaceVideo
     * &lt;p&gt;Starts the analysis of a single FaceVideo (in the supported formats) through either:&lt;/p&gt; &lt;ol&gt;   &lt;li&gt;a video URL pointing to a resource accessible through the Internet without authentication&lt;/li&gt;   &lt;li&gt;the binary contents of the video in the request&#39;s body, encoded as &lt;code&gt;multipart/form-data&lt;/code&gt; content type&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;The third option is a &lt;code&gt;PUT&lt;/code&gt; call to &lt;code&gt;/v1/facevideo/{filename}&lt;/code&gt; (&lt;code&gt;filename&lt;/code&gt; required string e.g. &lt;code&gt;facevideo1.mp4&lt;/code&gt;) which supports all the URL parameters as above with a body encoding &lt;code&gt;application/octet-stream&lt;/code&gt; and the file contents as plain binary: this call makes uploads more efficient but it does not respect HTTP/RESTful standards so it may be not supported in future.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param filename FaceVideo to be analysed. (optional)
     * @param sandbox Generates random data for testing, at no cost. Default: false. (optional)
     * @param responseId Associates this Facevideo to a previously generated Response. (optional)
     * @param researchId Associates this Facevideo to a previously generated Research. (optional)
     * @param mediaId Associates this Facevideo to a previously generated Media. (optional)
     * @param respondentId Associates this Facevideo to a previously generated Respondent. (optional)
     * @param processVideo Actually processes the video. Default: true. (optional)
     * @return ApiResponse&lt;FaceVideo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FaceVideo> facevideoPostWithHttpInfo(File filename, Boolean sandbox, Integer responseId, Integer researchId, Integer mediaId, Integer respondentId, Boolean processVideo) throws ApiException {
        com.squareup.okhttp.Call call = facevideoPostCall(filename, sandbox, responseId, researchId, mediaId, respondentId, processVideo, null, null);
        Type localVarReturnType = new TypeToken<FaceVideo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Analyse FaceVideo (asynchronously)
     * &lt;p&gt;Starts the analysis of a single FaceVideo (in the supported formats) through either:&lt;/p&gt; &lt;ol&gt;   &lt;li&gt;a video URL pointing to a resource accessible through the Internet without authentication&lt;/li&gt;   &lt;li&gt;the binary contents of the video in the request&#39;s body, encoded as &lt;code&gt;multipart/form-data&lt;/code&gt; content type&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;The third option is a &lt;code&gt;PUT&lt;/code&gt; call to &lt;code&gt;/v1/facevideo/{filename}&lt;/code&gt; (&lt;code&gt;filename&lt;/code&gt; required string e.g. &lt;code&gt;facevideo1.mp4&lt;/code&gt;) which supports all the URL parameters as above with a body encoding &lt;code&gt;application/octet-stream&lt;/code&gt; and the file contents as plain binary: this call makes uploads more efficient but it does not respect HTTP/RESTful standards so it may be not supported in future.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param filename FaceVideo to be analysed. (optional)
     * @param sandbox Generates random data for testing, at no cost. Default: false. (optional)
     * @param responseId Associates this Facevideo to a previously generated Response. (optional)
     * @param researchId Associates this Facevideo to a previously generated Research. (optional)
     * @param mediaId Associates this Facevideo to a previously generated Media. (optional)
     * @param respondentId Associates this Facevideo to a previously generated Respondent. (optional)
     * @param processVideo Actually processes the video. Default: true. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call facevideoPostAsync(File filename, Boolean sandbox, Integer responseId, Integer researchId, Integer mediaId, Integer respondentId, Boolean processVideo, final ApiCallback<FaceVideo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = facevideoPostCall(filename, sandbox, responseId, researchId, mediaId, respondentId, processVideo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FaceVideo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for facevideoPut */
    private com.squareup.okhttp.Call facevideoPutCall(Boolean sandbox, Integer responseId, Integer researchId, Integer mediaId, Integer respondentId, Boolean processVideo, FaceVideoUpload body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        

        // create path and map variables
        String localVarPath = "/facevideo".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (sandbox != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sandbox", sandbox));
        if (responseId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "response_id", responseId));
        if (researchId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "research_id", researchId));
        if (mediaId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media_id", mediaId));
        if (respondentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "respondent_id", respondentId));
        if (processVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "processVideo", processVideo));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Analyse FaceVideo
     * &lt;p&gt;Starts the analysis of a single FaceVideo (in the supported formats) through either:&lt;/p&gt; &lt;ol&gt;   &lt;li&gt;a video URL pointing to a resource accessible through the Internet without authentication&lt;/li&gt;   &lt;li&gt;the binary contents of the video in the request&#39;s body, encoded as &lt;code&gt;multipart/form-data&lt;/code&gt; content type&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;The third option is a &lt;code&gt;PUT&lt;/code&gt; call to &lt;code&gt;/v1/facevideo/{filename}&lt;/code&gt; (&lt;code&gt;filename&lt;/code&gt; required string e.g. &lt;code&gt;facevideo1.mp4&lt;/code&gt;) which supports all the URL parameters as above with a body encoding &lt;code&gt;application/octet-stream&lt;/code&gt; and the file contents as plain binary: this call makes uploads more efficient but it does not respect HTTP/RESTful standards so it may be not supported in future.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param sandbox Generates random data for testing, at no cost. Default: false. (optional)
     * @param responseId Associates this Facevideo to a previously generated Response. (optional)
     * @param researchId Associates this Facevideo to a previously generated Research. (optional)
     * @param mediaId Associates this Facevideo to a previously generated Media. (optional)
     * @param respondentId Associates this Facevideo to a previously generated Respondent. (optional)
     * @param processVideo Actually processes the video. Default: true. (optional)
     * @param body Request body (optional)
     * @return FaceVideo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FaceVideo facevideoPut(Boolean sandbox, Integer responseId, Integer researchId, Integer mediaId, Integer respondentId, Boolean processVideo, FaceVideoUpload body) throws ApiException {
        ApiResponse<FaceVideo> resp = facevideoPutWithHttpInfo(sandbox, responseId, researchId, mediaId, respondentId, processVideo, body);
        return resp.getData();
    }

    /**
     * Analyse FaceVideo
     * &lt;p&gt;Starts the analysis of a single FaceVideo (in the supported formats) through either:&lt;/p&gt; &lt;ol&gt;   &lt;li&gt;a video URL pointing to a resource accessible through the Internet without authentication&lt;/li&gt;   &lt;li&gt;the binary contents of the video in the request&#39;s body, encoded as &lt;code&gt;multipart/form-data&lt;/code&gt; content type&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;The third option is a &lt;code&gt;PUT&lt;/code&gt; call to &lt;code&gt;/v1/facevideo/{filename}&lt;/code&gt; (&lt;code&gt;filename&lt;/code&gt; required string e.g. &lt;code&gt;facevideo1.mp4&lt;/code&gt;) which supports all the URL parameters as above with a body encoding &lt;code&gt;application/octet-stream&lt;/code&gt; and the file contents as plain binary: this call makes uploads more efficient but it does not respect HTTP/RESTful standards so it may be not supported in future.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param sandbox Generates random data for testing, at no cost. Default: false. (optional)
     * @param responseId Associates this Facevideo to a previously generated Response. (optional)
     * @param researchId Associates this Facevideo to a previously generated Research. (optional)
     * @param mediaId Associates this Facevideo to a previously generated Media. (optional)
     * @param respondentId Associates this Facevideo to a previously generated Respondent. (optional)
     * @param processVideo Actually processes the video. Default: true. (optional)
     * @param body Request body (optional)
     * @return ApiResponse&lt;FaceVideo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FaceVideo> facevideoPutWithHttpInfo(Boolean sandbox, Integer responseId, Integer researchId, Integer mediaId, Integer respondentId, Boolean processVideo, FaceVideoUpload body) throws ApiException {
        com.squareup.okhttp.Call call = facevideoPutCall(sandbox, responseId, researchId, mediaId, respondentId, processVideo, body, null, null);
        Type localVarReturnType = new TypeToken<FaceVideo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Analyse FaceVideo (asynchronously)
     * &lt;p&gt;Starts the analysis of a single FaceVideo (in the supported formats) through either:&lt;/p&gt; &lt;ol&gt;   &lt;li&gt;a video URL pointing to a resource accessible through the Internet without authentication&lt;/li&gt;   &lt;li&gt;the binary contents of the video in the request&#39;s body, encoded as &lt;code&gt;multipart/form-data&lt;/code&gt; content type&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;The third option is a &lt;code&gt;PUT&lt;/code&gt; call to &lt;code&gt;/v1/facevideo/{filename}&lt;/code&gt; (&lt;code&gt;filename&lt;/code&gt; required string e.g. &lt;code&gt;facevideo1.mp4&lt;/code&gt;) which supports all the URL parameters as above with a body encoding &lt;code&gt;application/octet-stream&lt;/code&gt; and the file contents as plain binary: this call makes uploads more efficient but it does not respect HTTP/RESTful standards so it may be not supported in future.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Permissions:&lt;/strong&gt; ✓ Respondent ✓ Customer ✓ Manager&lt;/p&gt;
     * @param sandbox Generates random data for testing, at no cost. Default: false. (optional)
     * @param responseId Associates this Facevideo to a previously generated Response. (optional)
     * @param researchId Associates this Facevideo to a previously generated Research. (optional)
     * @param mediaId Associates this Facevideo to a previously generated Media. (optional)
     * @param respondentId Associates this Facevideo to a previously generated Respondent. (optional)
     * @param processVideo Actually processes the video. Default: true. (optional)
     * @param body Request body (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call facevideoPutAsync(Boolean sandbox, Integer responseId, Integer researchId, Integer mediaId, Integer respondentId, Boolean processVideo, FaceVideoUpload body, final ApiCallback<FaceVideo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = facevideoPutCall(sandbox, responseId, researchId, mediaId, respondentId, processVideo, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FaceVideo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
