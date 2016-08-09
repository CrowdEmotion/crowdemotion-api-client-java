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
import io.swagger.client.model.Tags;
import io.swagger.client.model.Videodetails;
import java.util.ArrayList;
import java.util.List;


/**
 * MediaCreation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-25T14:53:50.872+01:00")
public class MediaCreation   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("mediaPath")
  private String mediaPath = null;

  @SerializedName("research_id")
  private Integer researchId = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("videoOrder")
  private Integer videoOrder = null;

  @SerializedName("tags")
  private List<Tags> tags = new ArrayList<Tags>();

  @SerializedName("videodetails")
  private Videodetails videodetails = null;

  public MediaCreation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MediaCreation mediaPath(String mediaPath) {
    this.mediaPath = mediaPath;
    return this;
  }

   /**
   * 
   * @return mediaPath
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getMediaPath() {
    return mediaPath;
  }

  public void setMediaPath(String mediaPath) {
    this.mediaPath = mediaPath;
  }

  public MediaCreation researchId(Integer researchId) {
    this.researchId = researchId;
    return this;
  }

   /**
   * 
   * @return researchId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getResearchId() {
    return researchId;
  }

  public void setResearchId(Integer researchId) {
    this.researchId = researchId;
  }

  public MediaCreation length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * 
   * @return length
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public MediaCreation videoOrder(Integer videoOrder) {
    this.videoOrder = videoOrder;
    return this;
  }

   /**
   * 
   * @return videoOrder
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getVideoOrder() {
    return videoOrder;
  }

  public void setVideoOrder(Integer videoOrder) {
    this.videoOrder = videoOrder;
  }

  public MediaCreation tags(List<Tags> tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<Tags> getTags() {
    return tags;
  }

  public void setTags(List<Tags> tags) {
    this.tags = tags;
  }

  public MediaCreation videodetails(Videodetails videodetails) {
    this.videodetails = videodetails;
    return this;
  }

   /**
   * Get videodetails
   * @return videodetails
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Videodetails getVideodetails() {
    return videodetails;
  }

  public void setVideodetails(Videodetails videodetails) {
    this.videodetails = videodetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaCreation mediaCreation = (MediaCreation) o;
    return Objects.equals(this.name, mediaCreation.name) &&
        Objects.equals(this.mediaPath, mediaCreation.mediaPath) &&
        Objects.equals(this.researchId, mediaCreation.researchId) &&
        Objects.equals(this.length, mediaCreation.length) &&
        Objects.equals(this.videoOrder, mediaCreation.videoOrder) &&
        Objects.equals(this.tags, mediaCreation.tags) &&
        Objects.equals(this.videodetails, mediaCreation.videodetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mediaPath, researchId, length, videoOrder, tags, videodetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaCreation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mediaPath: ").append(toIndentedString(mediaPath)).append("\n");
    sb.append("    researchId: ").append(toIndentedString(researchId)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    videoOrder: ").append(toIndentedString(videoOrder)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    videodetails: ").append(toIndentedString(videodetails)).append("\n");
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
