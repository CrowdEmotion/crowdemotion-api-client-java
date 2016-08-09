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
import org.joda.time.DateTime;


/**
 * Media
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-25T14:53:50.872+01:00")
public class Media   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("mediaPath")
  private String mediaPath = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("researchId")
  private Integer researchId = null;

  @SerializedName("timeCreated")
  private DateTime timeCreated = null;

  @SerializedName("lengthMS")
  private Integer lengthMS = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("videoOrder")
  private Integer videoOrder = null;

  @SerializedName("tags")
  private List<Tags> tags = new ArrayList<Tags>();

  @SerializedName("presignedUrl")
  private String presignedUrl = null;

  @SerializedName("isStored")
  private Boolean isStored = null;

  @SerializedName("isURL")
  private Boolean isURL = null;

  @SerializedName("isYouTube")
  private Boolean isYouTube = null;

  @SerializedName("videodetails")
  private Videodetails videodetails = null;

  public Media id(Integer id) {
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

  public Media name(String name) {
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

  public Media mediaPath(String mediaPath) {
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

  public Media path(String path) {
    this.path = path;
    return this;
  }

   /**
   * 
   * @return path
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Media researchId(Integer researchId) {
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

  public Media timeCreated(DateTime timeCreated) {
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

  public Media lengthMS(Integer lengthMS) {
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

  public Media length(Integer length) {
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

  public Media videoOrder(Integer videoOrder) {
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

  public Media tags(List<Tags> tags) {
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

  public Media presignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
    return this;
  }

   /**
   * 
   * @return presignedUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPresignedUrl() {
    return presignedUrl;
  }

  public void setPresignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
  }

  public Media isStored(Boolean isStored) {
    this.isStored = isStored;
    return this;
  }

   /**
   * 
   * @return isStored
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsStored() {
    return isStored;
  }

  public void setIsStored(Boolean isStored) {
    this.isStored = isStored;
  }

  public Media isURL(Boolean isURL) {
    this.isURL = isURL;
    return this;
  }

   /**
   * 
   * @return isURL
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsURL() {
    return isURL;
  }

  public void setIsURL(Boolean isURL) {
    this.isURL = isURL;
  }

  public Media isYouTube(Boolean isYouTube) {
    this.isYouTube = isYouTube;
    return this;
  }

   /**
   * 
   * @return isYouTube
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsYouTube() {
    return isYouTube;
  }

  public void setIsYouTube(Boolean isYouTube) {
    this.isYouTube = isYouTube;
  }

  public Media videodetails(Videodetails videodetails) {
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
    Media media = (Media) o;
    return Objects.equals(this.id, media.id) &&
        Objects.equals(this.name, media.name) &&
        Objects.equals(this.mediaPath, media.mediaPath) &&
        Objects.equals(this.path, media.path) &&
        Objects.equals(this.researchId, media.researchId) &&
        Objects.equals(this.timeCreated, media.timeCreated) &&
        Objects.equals(this.lengthMS, media.lengthMS) &&
        Objects.equals(this.length, media.length) &&
        Objects.equals(this.videoOrder, media.videoOrder) &&
        Objects.equals(this.tags, media.tags) &&
        Objects.equals(this.presignedUrl, media.presignedUrl) &&
        Objects.equals(this.isStored, media.isStored) &&
        Objects.equals(this.isURL, media.isURL) &&
        Objects.equals(this.isYouTube, media.isYouTube) &&
        Objects.equals(this.videodetails, media.videodetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mediaPath, path, researchId, timeCreated, lengthMS, length, videoOrder, tags, presignedUrl, isStored, isURL, isYouTube, videodetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mediaPath: ").append(toIndentedString(mediaPath)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    researchId: ").append(toIndentedString(researchId)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    lengthMS: ").append(toIndentedString(lengthMS)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    videoOrder: ").append(toIndentedString(videoOrder)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    presignedUrl: ").append(toIndentedString(presignedUrl)).append("\n");
    sb.append("    isStored: ").append(toIndentedString(isStored)).append("\n");
    sb.append("    isURL: ").append(toIndentedString(isURL)).append("\n");
    sb.append("    isYouTube: ").append(toIndentedString(isYouTube)).append("\n");
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
