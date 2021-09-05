package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.BiometricDetail;
import com.identity.ims.api.entity.apiModel.BiometricImages;



public class PersonBiometric   {
  
  private  BiometricDetail biometricDetail;
  private  BiometricImages biometricImages;

  /**
   **/
  public PersonBiometric biometricDetail(BiometricDetail biometricDetail) {
    this.biometricDetail = biometricDetail;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("biometricDetail")
  public BiometricDetail getBiometricDetail() {
    return biometricDetail;
  }
  public void setBiometricDetail(BiometricDetail biometricDetail) {
    this.biometricDetail = biometricDetail;
  }

  /**
   **/
  public PersonBiometric biometricImages(BiometricImages biometricImages) {
    this.biometricImages = biometricImages;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("biometricImages")
  public BiometricImages getBiometricImages() {
    return biometricImages;
  }
  public void setBiometricImages(BiometricImages biometricImages) {
    this.biometricImages = biometricImages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonBiometric personBiometric = (PersonBiometric) o;
    return Objects.equals(this.biometricDetail, personBiometric.biometricDetail) &&
        Objects.equals(this.biometricImages, personBiometric.biometricImages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometricDetail, biometricImages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonBiometric {\n");
    
    sb.append("    biometricDetail: ").append(toIndentedString(biometricDetail)).append("\n");
    sb.append("    biometricImages: ").append(toIndentedString(biometricImages)).append("\n");
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

