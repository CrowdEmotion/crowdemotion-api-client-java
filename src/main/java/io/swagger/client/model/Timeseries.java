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
import java.util.ArrayList;
import java.util.List;


/**
 * Timeseries
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-11T15:53:16.377+01:00")
public class Timeseries   {
  @SerializedName("responseId")
  private Integer responseId = null;

  @SerializedName("metricId")
  private Integer metricId = null;

  @SerializedName("metricName")
  private String metricName = null;

  @SerializedName("startIndex")
  private Integer startIndex = null;

  @SerializedName("endIndex")
  private Integer endIndex = null;

  @SerializedName("stepSize")
  private Integer stepSize = null;

  @SerializedName("customMessage")
  private String customMessage = null;

  @SerializedName("data")
  private List<Float> data = new ArrayList<Float>();

  public Timeseries responseId(Integer responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * 
   * @return responseId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getResponseId() {
    return responseId;
  }

  public void setResponseId(Integer responseId) {
    this.responseId = responseId;
  }

  public Timeseries metricId(Integer metricId) {
    this.metricId = metricId;
    return this;
  }

   /**
   * 
   * @return metricId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getMetricId() {
    return metricId;
  }

  public void setMetricId(Integer metricId) {
    this.metricId = metricId;
  }

  public Timeseries metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * 
   * @return metricName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public Timeseries startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 
   * @return startIndex
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public Timeseries endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

   /**
   * 
   * @return endIndex
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public Timeseries stepSize(Integer stepSize) {
    this.stepSize = stepSize;
    return this;
  }

   /**
   * 
   * @return stepSize
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getStepSize() {
    return stepSize;
  }

  public void setStepSize(Integer stepSize) {
    this.stepSize = stepSize;
  }

  public Timeseries customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

   /**
   * 
   * @return customMessage
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  public Timeseries data(List<Float> data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<Float> getData() {
    return data;
  }

  public void setData(List<Float> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timeseries timeseries = (Timeseries) o;
    return Objects.equals(this.responseId, timeseries.responseId) &&
        Objects.equals(this.metricId, timeseries.metricId) &&
        Objects.equals(this.metricName, timeseries.metricName) &&
        Objects.equals(this.startIndex, timeseries.startIndex) &&
        Objects.equals(this.endIndex, timeseries.endIndex) &&
        Objects.equals(this.stepSize, timeseries.stepSize) &&
        Objects.equals(this.customMessage, timeseries.customMessage) &&
        Objects.equals(this.data, timeseries.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseId, metricId, metricName, startIndex, endIndex, stepSize, customMessage, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timeseries {\n");
    
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    stepSize: ").append(toIndentedString(stepSize)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

