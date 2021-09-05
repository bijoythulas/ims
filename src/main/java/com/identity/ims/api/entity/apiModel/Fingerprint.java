package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.BiometricException;



public class Fingerprint   {
  
  private  BiometricException biometricException;
  private  String collectionAttemptCount;
  private  String compressionAlgorithm;
  private  String fingerIndex;
  private  String horizontalLineLength;
  private  byte[] imageData;
  private  String verticalLineLength;

  /**
   **/
  public Fingerprint biometricException(BiometricException biometricException) {
    this.biometricException = biometricException;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("biometricException")
  public BiometricException getBiometricException() {
    return biometricException;
  }
  public void setBiometricException(BiometricException biometricException) {
    this.biometricException = biometricException;
  }

  /**
   **/
  public Fingerprint collectionAttemptCount(String collectionAttemptCount) {
    this.collectionAttemptCount = collectionAttemptCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("collectionAttemptCount")
  public String getCollectionAttemptCount() {
    return collectionAttemptCount;
  }
  public void setCollectionAttemptCount(String collectionAttemptCount) {
    this.collectionAttemptCount = collectionAttemptCount;
  }

  /**
   **/
  public Fingerprint compressionAlgorithm(String compressionAlgorithm) {
    this.compressionAlgorithm = compressionAlgorithm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compressionAlgorithm")
  public String getCompressionAlgorithm() {
    return compressionAlgorithm;
  }
  public void setCompressionAlgorithm(String compressionAlgorithm) {
    this.compressionAlgorithm = compressionAlgorithm;
  }

  /**
   **/
  public Fingerprint fingerIndex(String fingerIndex) {
    this.fingerIndex = fingerIndex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fingerIndex")
  public String getFingerIndex() {
    return fingerIndex;
  }
  public void setFingerIndex(String fingerIndex) {
    this.fingerIndex = fingerIndex;
  }

  /**
   **/
  public Fingerprint horizontalLineLength(String horizontalLineLength) {
    this.horizontalLineLength = horizontalLineLength;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("horizontalLineLength")
  public String getHorizontalLineLength() {
    return horizontalLineLength;
  }
  public void setHorizontalLineLength(String horizontalLineLength) {
    this.horizontalLineLength = horizontalLineLength;
  }

  /**
   * Base64-encoded image data
   **/
  public Fingerprint imageData(byte[] imageData) {
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
  public Fingerprint verticalLineLength(String verticalLineLength) {
    this.verticalLineLength = verticalLineLength;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verticalLineLength")
  public String getVerticalLineLength() {
    return verticalLineLength;
  }
  public void setVerticalLineLength(String verticalLineLength) {
    this.verticalLineLength = verticalLineLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fingerprint fingerprint = (Fingerprint) o;
    return Objects.equals(this.biometricException, fingerprint.biometricException) &&
        Objects.equals(this.collectionAttemptCount, fingerprint.collectionAttemptCount) &&
        Objects.equals(this.compressionAlgorithm, fingerprint.compressionAlgorithm) &&
        Objects.equals(this.fingerIndex, fingerprint.fingerIndex) &&
        Objects.equals(this.horizontalLineLength, fingerprint.horizontalLineLength) &&
        Objects.equals(this.imageData, fingerprint.imageData) &&
        Objects.equals(this.verticalLineLength, fingerprint.verticalLineLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometricException, collectionAttemptCount, compressionAlgorithm, fingerIndex, horizontalLineLength, imageData, verticalLineLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fingerprint {\n");
    
    sb.append("    biometricException: ").append(toIndentedString(biometricException)).append("\n");
    sb.append("    collectionAttemptCount: ").append(toIndentedString(collectionAttemptCount)).append("\n");
    sb.append("    compressionAlgorithm: ").append(toIndentedString(compressionAlgorithm)).append("\n");
    sb.append("    fingerIndex: ").append(toIndentedString(fingerIndex)).append("\n");
    sb.append("    horizontalLineLength: ").append(toIndentedString(horizontalLineLength)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    verticalLineLength: ").append(toIndentedString(verticalLineLength)).append("\n");
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

