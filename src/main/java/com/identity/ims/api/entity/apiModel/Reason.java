package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class Reason   {
  
  private  String reasonCode;
  private  String reasonText;

  /**
   **/
  public Reason reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("reasonCode")
  public String getReasonCode() {
    return reasonCode;
  }
  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  /**
   **/
  public Reason reasonText(String reasonText) {
    this.reasonText = reasonText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reasonText")
  public String getReasonText() {
    return reasonText;
  }
  public void setReasonText(String reasonText) {
    this.reasonText = reasonText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reason reason = (Reason) o;
    return Objects.equals(this.reasonCode, reason.reasonCode) &&
        Objects.equals(this.reasonText, reason.reasonText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCode, reasonText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reason {\n");
    
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonText: ").append(toIndentedString(reasonText)).append("\n");
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

