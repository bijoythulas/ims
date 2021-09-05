package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Business capture context code represents is the line of business the encounter is related to. It can cover a combination of Business Context Type, Business Programme, Business Event Type, Business Event Classification.
 **/
@ApiModel(description = "Business capture context code represents is the line of business the encounter is related to. It can cover a combination of Business Context Type, Business Programme, Business Event Type, Business Event Classification.")
public class BusinessCaptureType   {
  
  private  Integer businessCaptureTypeCode;
  private  String businessCaptureTypeText;

  /**
   **/
  public BusinessCaptureType businessCaptureTypeCode(Integer businessCaptureTypeCode) {
    this.businessCaptureTypeCode = businessCaptureTypeCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("businessCaptureTypeCode")
  public Integer getBusinessCaptureTypeCode() {
    return businessCaptureTypeCode;
  }
  public void setBusinessCaptureTypeCode(Integer businessCaptureTypeCode) {
    this.businessCaptureTypeCode = businessCaptureTypeCode;
  }

  /**
   **/
  public BusinessCaptureType businessCaptureTypeText(String businessCaptureTypeText) {
    this.businessCaptureTypeText = businessCaptureTypeText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessCaptureTypeText")
  public String getBusinessCaptureTypeText() {
    return businessCaptureTypeText;
  }
  public void setBusinessCaptureTypeText(String businessCaptureTypeText) {
    this.businessCaptureTypeText = businessCaptureTypeText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessCaptureType businessCaptureType = (BusinessCaptureType) o;
    return Objects.equals(this.businessCaptureTypeCode, businessCaptureType.businessCaptureTypeCode) &&
        Objects.equals(this.businessCaptureTypeText, businessCaptureType.businessCaptureTypeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessCaptureTypeCode, businessCaptureTypeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessCaptureType {\n");
    
    sb.append("    businessCaptureTypeCode: ").append(toIndentedString(businessCaptureTypeCode)).append("\n");
    sb.append("    businessCaptureTypeText: ").append(toIndentedString(businessCaptureTypeText)).append("\n");
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

