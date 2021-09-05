package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class BusinessRole   {
  
  private  String businessRoleStatusCode;
  private  String businessRoleStatusQualifierCode;
  private  String businessRoleType;

  /**
   **/
  public BusinessRole businessRoleStatusCode(String businessRoleStatusCode) {
    this.businessRoleStatusCode = businessRoleStatusCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessRoleStatusCode")
  public String getBusinessRoleStatusCode() {
    return businessRoleStatusCode;
  }
  public void setBusinessRoleStatusCode(String businessRoleStatusCode) {
    this.businessRoleStatusCode = businessRoleStatusCode;
  }

  /**
   **/
  public BusinessRole businessRoleStatusQualifierCode(String businessRoleStatusQualifierCode) {
    this.businessRoleStatusQualifierCode = businessRoleStatusQualifierCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessRoleStatusQualifierCode")
  public String getBusinessRoleStatusQualifierCode() {
    return businessRoleStatusQualifierCode;
  }
  public void setBusinessRoleStatusQualifierCode(String businessRoleStatusQualifierCode) {
    this.businessRoleStatusQualifierCode = businessRoleStatusQualifierCode;
  }

  /**
   **/
  public BusinessRole businessRoleType(String businessRoleType) {
    this.businessRoleType = businessRoleType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("businessRoleType")
  public String getBusinessRoleType() {
    return businessRoleType;
  }
  public void setBusinessRoleType(String businessRoleType) {
    this.businessRoleType = businessRoleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessRole businessRole = (BusinessRole) o;
    return Objects.equals(this.businessRoleStatusCode, businessRole.businessRoleStatusCode) &&
        Objects.equals(this.businessRoleStatusQualifierCode, businessRole.businessRoleStatusQualifierCode) &&
        Objects.equals(this.businessRoleType, businessRole.businessRoleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessRoleStatusCode, businessRoleStatusQualifierCode, businessRoleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessRole {\n");
    
    sb.append("    businessRoleStatusCode: ").append(toIndentedString(businessRoleStatusCode)).append("\n");
    sb.append("    businessRoleStatusQualifierCode: ").append(toIndentedString(businessRoleStatusQualifierCode)).append("\n");
    sb.append("    businessRoleType: ").append(toIndentedString(businessRoleType)).append("\n");
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

