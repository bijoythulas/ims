package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class BiometricException   {
  
  private  String exceptionComment;
  private  String exceptionType;

  /**
   **/
  public BiometricException exceptionComment(String exceptionComment) {
    this.exceptionComment = exceptionComment;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exceptionComment")
  public String getExceptionComment() {
    return exceptionComment;
  }
  public void setExceptionComment(String exceptionComment) {
    this.exceptionComment = exceptionComment;
  }

  /**
   **/
  public BiometricException exceptionType(String exceptionType) {
    this.exceptionType = exceptionType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("exceptionType")
  public String getExceptionType() {
    return exceptionType;
  }
  public void setExceptionType(String exceptionType) {
    this.exceptionType = exceptionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiometricException biometricException = (BiometricException) o;
    return Objects.equals(this.exceptionComment, biometricException.exceptionComment) &&
        Objects.equals(this.exceptionType, biometricException.exceptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptionComment, exceptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricException {\n");
    
    sb.append("    exceptionComment: ").append(toIndentedString(exceptionComment)).append("\n");
    sb.append("    exceptionType: ").append(toIndentedString(exceptionType)).append("\n");
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

