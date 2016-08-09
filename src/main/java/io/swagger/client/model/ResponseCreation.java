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
 * ResponseCreation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-25T14:53:50.872+01:00")
public class ResponseCreation   {
  @SerializedName("research_id")
  private Integer researchId = null;

  @SerializedName("media_id")
  private Integer mediaId = null;

  @SerializedName("respondent_id")
  private Integer respondentId = null;

  public ResponseCreation researchId(Integer researchId) {
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

  public ResponseCreation mediaId(Integer mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * 
   * @return mediaId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getMediaId() {
    return mediaId;
  }

  public void setMediaId(Integer mediaId) {
    this.mediaId = mediaId;
  }

  public ResponseCreation respondentId(Integer respondentId) {
    this.respondentId = respondentId;
    return this;
  }

   /**
   * 
   * @return respondentId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getRespondentId() {
    return respondentId;
  }

  public void setRespondentId(Integer respondentId) {
    this.respondentId = respondentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreation responseCreation = (ResponseCreation) o;
    return Objects.equals(this.researchId, responseCreation.researchId) &&
        Objects.equals(this.mediaId, responseCreation.mediaId) &&
        Objects.equals(this.respondentId, responseCreation.respondentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(researchId, mediaId, respondentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreation {\n");
    
    sb.append("    researchId: ").append(toIndentedString(researchId)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    respondentId: ").append(toIndentedString(respondentId)).append("\n");
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

