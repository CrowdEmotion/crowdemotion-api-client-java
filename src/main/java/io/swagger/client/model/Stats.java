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


/**
 * Stats
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-11T15:53:16.377+01:00")
public class Stats   {
  @SerializedName("media")
  private Integer media = null;

  @SerializedName("visited")
  private Integer visited = null;

  @SerializedName("started")
  private Integer started = null;

  @SerializedName("partial")
  private Integer partial = null;

  @SerializedName("completes")
  private Integer completes = null;

  @SerializedName("processed")
  private Integer processed = null;

  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("unprocessed")
  private Integer unprocessed = null;

  @SerializedName("lastUpdated")
  private String lastUpdated = null;

  public Stats media(Integer media) {
    this.media = media;
    return this;
  }

   /**
   * 
   * @return media
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getMedia() {
    return media;
  }

  public void setMedia(Integer media) {
    this.media = media;
  }

  public Stats visited(Integer visited) {
    this.visited = visited;
    return this;
  }

   /**
   * 
   * @return visited
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getVisited() {
    return visited;
  }

  public void setVisited(Integer visited) {
    this.visited = visited;
  }

  public Stats started(Integer started) {
    this.started = started;
    return this;
  }

   /**
   * 
   * @return started
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getStarted() {
    return started;
  }

  public void setStarted(Integer started) {
    this.started = started;
  }

  public Stats partial(Integer partial) {
    this.partial = partial;
    return this;
  }

   /**
   * 
   * @return partial
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getPartial() {
    return partial;
  }

  public void setPartial(Integer partial) {
    this.partial = partial;
  }

  public Stats completes(Integer completes) {
    this.completes = completes;
    return this;
  }

   /**
   * 
   * @return completes
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getCompletes() {
    return completes;
  }

  public void setCompletes(Integer completes) {
    this.completes = completes;
  }

  public Stats processed(Integer processed) {
    this.processed = processed;
    return this;
  }

   /**
   * 
   * @return processed
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getProcessed() {
    return processed;
  }

  public void setProcessed(Integer processed) {
    this.processed = processed;
  }

  public Stats failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * 
   * @return failed
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public Stats unprocessed(Integer unprocessed) {
    this.unprocessed = unprocessed;
    return this;
  }

   /**
   * 
   * @return unprocessed
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getUnprocessed() {
    return unprocessed;
  }

  public void setUnprocessed(Integer unprocessed) {
    this.unprocessed = unprocessed;
  }

  public Stats lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * 
   * @return lastUpdated
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stats stats = (Stats) o;
    return Objects.equals(this.media, stats.media) &&
        Objects.equals(this.visited, stats.visited) &&
        Objects.equals(this.started, stats.started) &&
        Objects.equals(this.partial, stats.partial) &&
        Objects.equals(this.completes, stats.completes) &&
        Objects.equals(this.processed, stats.processed) &&
        Objects.equals(this.failed, stats.failed) &&
        Objects.equals(this.unprocessed, stats.unprocessed) &&
        Objects.equals(this.lastUpdated, stats.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, visited, started, partial, completes, processed, failed, unprocessed, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stats {\n");
    
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    visited: ").append(toIndentedString(visited)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    partial: ").append(toIndentedString(partial)).append("\n");
    sb.append("    completes: ").append(toIndentedString(completes)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    unprocessed: ").append(toIndentedString(unprocessed)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

