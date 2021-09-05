package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class ContextContainer   {
  
  private  String containerDescription;
  private  String containerNumber;
  private  String containerTitle;
  private  String containerType;

  /**
   **/
  public ContextContainer containerDescription(String containerDescription) {
    this.containerDescription = containerDescription;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("containerDescription")
  public String getContainerDescription() {
    return containerDescription;
  }
  public void setContainerDescription(String containerDescription) {
    this.containerDescription = containerDescription;
  }

  /**
   **/
  public ContextContainer containerNumber(String containerNumber) {
    this.containerNumber = containerNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("containerNumber")
  public String getContainerNumber() {
    return containerNumber;
  }
  public void setContainerNumber(String containerNumber) {
    this.containerNumber = containerNumber;
  }

  /**
   **/
  public ContextContainer containerTitle(String containerTitle) {
    this.containerTitle = containerTitle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("containerTitle")
  public String getContainerTitle() {
    return containerTitle;
  }
  public void setContainerTitle(String containerTitle) {
    this.containerTitle = containerTitle;
  }

  /**
   **/
  public ContextContainer containerType(String containerType) {
    this.containerType = containerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("containerType")
  public String getContainerType() {
    return containerType;
  }
  public void setContainerType(String containerType) {
    this.containerType = containerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextContainer contextContainer = (ContextContainer) o;
    return Objects.equals(this.containerDescription, contextContainer.containerDescription) &&
        Objects.equals(this.containerNumber, contextContainer.containerNumber) &&
        Objects.equals(this.containerTitle, contextContainer.containerTitle) &&
        Objects.equals(this.containerType, contextContainer.containerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerDescription, containerNumber, containerTitle, containerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextContainer {\n");
    
    sb.append("    containerDescription: ").append(toIndentedString(containerDescription)).append("\n");
    sb.append("    containerNumber: ").append(toIndentedString(containerNumber)).append("\n");
    sb.append("    containerTitle: ").append(toIndentedString(containerTitle)).append("\n");
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
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

