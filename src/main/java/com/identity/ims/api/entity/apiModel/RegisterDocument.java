package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.DocumentDetail;
import com.identity.ims.api.entity.apiModel.DocumentImage;



public class RegisterDocument   {
  
  private  DocumentDetail documentDetails;
  private  List<DocumentImage> documentImages = new ArrayList<>();

  /**
   **/
  public RegisterDocument documentDetails(DocumentDetail documentDetails) {
    this.documentDetails = documentDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("documentDetails")
  public DocumentDetail getDocumentDetails() {
    return documentDetails;
  }
  public void setDocumentDetails(DocumentDetail documentDetails) {
    this.documentDetails = documentDetails;
  }

  /**
   **/
  public RegisterDocument documentImages(List<DocumentImage> documentImages) {
    this.documentImages = documentImages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentImages")
  public List<DocumentImage> getDocumentImages() {
    return documentImages;
  }
  public void setDocumentImages(List<DocumentImage> documentImages) {
    this.documentImages = documentImages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterDocument registerDocument = (RegisterDocument) o;
    return Objects.equals(this.documentDetails, registerDocument.documentDetails) &&
        Objects.equals(this.documentImages, registerDocument.documentImages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDetails, documentImages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterDocument {\n");
    
    sb.append("    documentDetails: ").append(toIndentedString(documentDetails)).append("\n");
    sb.append("    documentImages: ").append(toIndentedString(documentImages)).append("\n");
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

