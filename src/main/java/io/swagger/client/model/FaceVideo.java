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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * FaceVideo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-25T14:53:50.872+01:00")
public class FaceVideo   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("timeCreated")
  private DateTime timeCreated = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("fqAvg")
  private Integer fqAvg = null;

  @SerializedName("fqStddev")
  private Integer fqStddev = null;

  @SerializedName("frameRate")
  private Integer frameRate = null;

  @SerializedName("numFrames")
  private Integer numFrames = null;

  @SerializedName("remoteLocation")
  private String remoteLocation = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("statusText")
  private String statusText = null;

  @SerializedName("statusMessage")
  private String statusMessage = null;

  @SerializedName("responseId")
  private String responseId = null;

  @SerializedName("md5")
  private String md5 = null;

  @SerializedName("lengthMS")
  private Integer lengthMS = null;

  @SerializedName("lengthS")
  private Float lengthS = null;

  @SerializedName("framesProcessed")
  private Integer framesProcessed = null;

  @SerializedName("processingTime")
  private Integer processingTime = null;

  @SerializedName("engineVersion")
  private Integer engineVersion = null;

  public FaceVideo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public FaceVideo timeCreated(DateTime timeCreated) {
    this.timeCreated = timeCreated;
    return this;
  }

   /**
   * 
   * @return timeCreated
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getTimeCreated() {
    return timeCreated;
  }

  public void setTimeCreated(DateTime timeCreated) {
    this.timeCreated = timeCreated;
  }

  public FaceVideo filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * 
   * @return filename
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public FaceVideo fqAvg(Integer fqAvg) {
    this.fqAvg = fqAvg;
    return this;
  }

   /**
   * 
   * @return fqAvg
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getFqAvg() {
    return fqAvg;
  }

  public void setFqAvg(Integer fqAvg) {
    this.fqAvg = fqAvg;
  }

  public FaceVideo fqStddev(Integer fqStddev) {
    this.fqStddev = fqStddev;
    return this;
  }

   /**
   * 
   * @return fqStddev
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getFqStddev() {
    return fqStddev;
  }

  public void setFqStddev(Integer fqStddev) {
    this.fqStddev = fqStddev;
  }

  public FaceVideo frameRate(Integer frameRate) {
    this.frameRate = frameRate;
    return this;
  }

   /**
   * 
   * @return frameRate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getFrameRate() {
    return frameRate;
  }

  public void setFrameRate(Integer frameRate) {
    this.frameRate = frameRate;
  }

  public FaceVideo numFrames(Integer numFrames) {
    this.numFrames = numFrames;
    return this;
  }

   /**
   * 
   * @return numFrames
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getNumFrames() {
    return numFrames;
  }

  public void setNumFrames(Integer numFrames) {
    this.numFrames = numFrames;
  }

  public FaceVideo remoteLocation(String remoteLocation) {
    this.remoteLocation = remoteLocation;
    return this;
  }

   /**
   * 
   * @return remoteLocation
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getRemoteLocation() {
    return remoteLocation;
  }

  public void setRemoteLocation(String remoteLocation) {
    this.remoteLocation = remoteLocation;
  }

  public FaceVideo status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public FaceVideo statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * 
   * @return statusText
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }

  public FaceVideo statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * 
   * @return statusMessage
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public FaceVideo responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * 
   * @return responseId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public FaceVideo md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * 
   * @return md5
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public FaceVideo lengthMS(Integer lengthMS) {
    this.lengthMS = lengthMS;
    return this;
  }

   /**
   * 
   * @return lengthMS
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getLengthMS() {
    return lengthMS;
  }

  public void setLengthMS(Integer lengthMS) {
    this.lengthMS = lengthMS;
  }

  public FaceVideo lengthS(Float lengthS) {
    this.lengthS = lengthS;
    return this;
  }

   /**
   * 
   * @return lengthS
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Float getLengthS() {
    return lengthS;
  }

  public void setLengthS(Float lengthS) {
    this.lengthS = lengthS;
  }

  public FaceVideo framesProcessed(Integer framesProcessed) {
    this.framesProcessed = framesProcessed;
    return this;
  }

   /**
   * 
   * @return framesProcessed
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getFramesProcessed() {
    return framesProcessed;
  }

  public void setFramesProcessed(Integer framesProcessed) {
    this.framesProcessed = framesProcessed;
  }

  public FaceVideo processingTime(Integer processingTime) {
    this.processingTime = processingTime;
    return this;
  }

   /**
   * 
   * @return processingTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(Integer processingTime) {
    this.processingTime = processingTime;
  }

  public FaceVideo engineVersion(Integer engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

   /**
   * 
   * @return engineVersion
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(Integer engineVersion) {
    this.engineVersion = engineVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceVideo faceVideo = (FaceVideo) o;
    return Objects.equals(this.id, faceVideo.id) &&
        Objects.equals(this.timeCreated, faceVideo.timeCreated) &&
        Objects.equals(this.filename, faceVideo.filename) &&
        Objects.equals(this.fqAvg, faceVideo.fqAvg) &&
        Objects.equals(this.fqStddev, faceVideo.fqStddev) &&
        Objects.equals(this.frameRate, faceVideo.frameRate) &&
        Objects.equals(this.numFrames, faceVideo.numFrames) &&
        Objects.equals(this.remoteLocation, faceVideo.remoteLocation) &&
        Objects.equals(this.status, faceVideo.status) &&
        Objects.equals(this.statusText, faceVideo.statusText) &&
        Objects.equals(this.statusMessage, faceVideo.statusMessage) &&
        Objects.equals(this.responseId, faceVideo.responseId) &&
        Objects.equals(this.md5, faceVideo.md5) &&
        Objects.equals(this.lengthMS, faceVideo.lengthMS) &&
        Objects.equals(this.lengthS, faceVideo.lengthS) &&
        Objects.equals(this.framesProcessed, faceVideo.framesProcessed) &&
        Objects.equals(this.processingTime, faceVideo.processingTime) &&
        Objects.equals(this.engineVersion, faceVideo.engineVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeCreated, filename, fqAvg, fqStddev, frameRate, numFrames, remoteLocation, status, statusText, statusMessage, responseId, md5, lengthMS, lengthS, framesProcessed, processingTime, engineVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceVideo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fqAvg: ").append(toIndentedString(fqAvg)).append("\n");
    sb.append("    fqStddev: ").append(toIndentedString(fqStddev)).append("\n");
    sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
    sb.append("    numFrames: ").append(toIndentedString(numFrames)).append("\n");
    sb.append("    remoteLocation: ").append(toIndentedString(remoteLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    lengthMS: ").append(toIndentedString(lengthMS)).append("\n");
    sb.append("    lengthS: ").append(toIndentedString(lengthS)).append("\n");
    sb.append("    framesProcessed: ").append(toIndentedString(framesProcessed)).append("\n");
    sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

