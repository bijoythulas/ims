package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class FacialImageIdentifier   {
  
  private  String facialImageId;
  private  String facialImageIdType;

  /**
   **/
  public FacialImageIdentifier facialImageId(String facialImageId) {
    this.facialImageId = facialImageId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("facialImageId")
  public String getFacialImageId() {
    return facialImageId;
  }
  public void setFacialImageId(String facialImageId) {
    this.facialImageId = facialImageId;
  }

  /**
   **/
  public FacialImageIdentifier facialImageIdType(String facialImageIdType) {
    this.facialImageIdType = facialImageIdType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("facialImageIdType")
  public String getFacialImageIdType() {
    return facialImageIdType;
  }
  public void setFacialImageIdType(String facialImageIdType) {
    this.facialImageIdType = facialImageIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacialImageIdentifier facialImageIdentifier = (FacialImageIdentifier) o;
    return Objects.equals(this.facialImageId, facialImageIdentifier.facialImageId) &&
        Objects.equals(this.facialImageIdType, facialImageIdentifier.facialImageIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facialImageId, facialImageIdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialImageIdentifier {\n");
    
    sb.append("    facialImageId: ").append(toIndentedString(facialImageId)).append("\n");
    sb.append("    facialImageIdType: ").append(toIndentedString(facialImageIdType)).append("\n");
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

