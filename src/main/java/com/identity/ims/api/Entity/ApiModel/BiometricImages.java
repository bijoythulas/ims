package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.FacialImage;
import com.identity.ims.api.Entity.ApiModel.Fingerprint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The content of this has to be either facialImage or fingerprints, not both together
 **/
@ApiModel(description = "The content of this has to be either facialImage or fingerprints, not both together")
public class BiometricImages   {
  
  private  FacialImage facialImage;
  private  List<Fingerprint> fingerprints = new ArrayList<>();

  /**
   **/
  public BiometricImages facialImage(FacialImage facialImage) {
    this.facialImage = facialImage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("facialImage")
  public FacialImage getFacialImage() {
    return facialImage;
  }
  public void setFacialImage(FacialImage facialImage) {
    this.facialImage = facialImage;
  }

  /**
   **/
  public BiometricImages fingerprints(List<Fingerprint> fingerprints) {
    this.fingerprints = fingerprints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fingerprints")
  public List<Fingerprint> getFingerprints() {
    return fingerprints;
  }
  public void setFingerprints(List<Fingerprint> fingerprints) {
    this.fingerprints = fingerprints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiometricImages biometricImages = (BiometricImages) o;
    return Objects.equals(this.facialImage, biometricImages.facialImage) &&
        Objects.equals(this.fingerprints, biometricImages.fingerprints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facialImage, fingerprints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricImages {\n");
    
    sb.append("    facialImage: ").append(toIndentedString(facialImage)).append("\n");
    sb.append("    fingerprints: ").append(toIndentedString(fingerprints)).append("\n");
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

