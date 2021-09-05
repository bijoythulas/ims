package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.Identifier;



public class DocumentImage   {
  
  private  String imageCode;
  private  byte[] imageData;
  private  String imageFormatType;
  private  Identifier imageIdentifier;
  private  Boolean inErrorFlag;
  private  Boolean photoIncludedFlag;
  private  String registrationMethod;
  private  String thirdPartyReason;

  /**
   **/
  public DocumentImage imageCode(String imageCode) {
    this.imageCode = imageCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("imageCode")
  public String getImageCode() {
    return imageCode;
  }
  public void setImageCode(String imageCode) {
    this.imageCode = imageCode;
  }

  /**
   * Base64-encoded image data
   **/
  public DocumentImage imageData(byte[] imageData) {
    this.imageData = imageData;
    return this;
  }

  
  @ApiModelProperty(value = "Base64-encoded image data")
  @JsonProperty("imageData")
  public byte[] getImageData() {
    return imageData;
  }
  public void setImageData(byte[] imageData) {
    this.imageData = imageData;
  }

  /**
   **/
  public DocumentImage imageFormatType(String imageFormatType) {
    this.imageFormatType = imageFormatType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("imageFormatType")
  public String getImageFormatType() {
    return imageFormatType;
  }
  public void setImageFormatType(String imageFormatType) {
    this.imageFormatType = imageFormatType;
  }

  /**
   **/
  public DocumentImage imageIdentifier(Identifier imageIdentifier) {
    this.imageIdentifier = imageIdentifier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("imageIdentifier")
  public Identifier getImageIdentifier() {
    return imageIdentifier;
  }
  public void setImageIdentifier(Identifier imageIdentifier) {
    this.imageIdentifier = imageIdentifier;
  }

  /**
   **/
  public DocumentImage inErrorFlag(Boolean inErrorFlag) {
    this.inErrorFlag = inErrorFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("inErrorFlag")
  public Boolean getInErrorFlag() {
    return inErrorFlag;
  }
  public void setInErrorFlag(Boolean inErrorFlag) {
    this.inErrorFlag = inErrorFlag;
  }

  /**
   **/
  public DocumentImage photoIncludedFlag(Boolean photoIncludedFlag) {
    this.photoIncludedFlag = photoIncludedFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("photoIncludedFlag")
  public Boolean getPhotoIncludedFlag() {
    return photoIncludedFlag;
  }
  public void setPhotoIncludedFlag(Boolean photoIncludedFlag) {
    this.photoIncludedFlag = photoIncludedFlag;
  }

  /**
   **/
  public DocumentImage registrationMethod(String registrationMethod) {
    this.registrationMethod = registrationMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("registrationMethod")
  public String getRegistrationMethod() {
    return registrationMethod;
  }
  public void setRegistrationMethod(String registrationMethod) {
    this.registrationMethod = registrationMethod;
  }

  /**
   **/
  public DocumentImage thirdPartyReason(String thirdPartyReason) {
    this.thirdPartyReason = thirdPartyReason;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyReason")
  public String getThirdPartyReason() {
    return thirdPartyReason;
  }
  public void setThirdPartyReason(String thirdPartyReason) {
    this.thirdPartyReason = thirdPartyReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentImage documentImage = (DocumentImage) o;
    return Objects.equals(this.imageCode, documentImage.imageCode) &&
        Objects.equals(this.imageData, documentImage.imageData) &&
        Objects.equals(this.imageFormatType, documentImage.imageFormatType) &&
        Objects.equals(this.imageIdentifier, documentImage.imageIdentifier) &&
        Objects.equals(this.inErrorFlag, documentImage.inErrorFlag) &&
        Objects.equals(this.photoIncludedFlag, documentImage.photoIncludedFlag) &&
        Objects.equals(this.registrationMethod, documentImage.registrationMethod) &&
        Objects.equals(this.thirdPartyReason, documentImage.thirdPartyReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageCode, imageData, imageFormatType, imageIdentifier, inErrorFlag, photoIncludedFlag, registrationMethod, thirdPartyReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentImage {\n");
    
    sb.append("    imageCode: ").append(toIndentedString(imageCode)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    imageFormatType: ").append(toIndentedString(imageFormatType)).append("\n");
    sb.append("    imageIdentifier: ").append(toIndentedString(imageIdentifier)).append("\n");
    sb.append("    inErrorFlag: ").append(toIndentedString(inErrorFlag)).append("\n");
    sb.append("    photoIncludedFlag: ").append(toIndentedString(photoIncludedFlag)).append("\n");
    sb.append("    registrationMethod: ").append(toIndentedString(registrationMethod)).append("\n");
    sb.append("    thirdPartyReason: ").append(toIndentedString(thirdPartyReason)).append("\n");
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

