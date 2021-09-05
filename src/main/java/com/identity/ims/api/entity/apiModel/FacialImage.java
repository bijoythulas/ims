package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.BiometricException;
import com.identity.ims.api.entity.apiModel.FacialImageIdentifier;



public class FacialImage   {
  
  private  BiometricException biometricException;
  private  String collectionAttemptCount;
  private  String compressionAlgorithm;
  private  FacialImageIdentifier facialImageIdentifier;

public enum FacialImageTypeEnum {

    THUMBNAIL(String.valueOf("THUMBNAIL")), ORIGINAL(String.valueOf("ORIGINAL")), FORMATTED(String.valueOf("FORMATTED")), FACIAL(String.valueOf("FACIAL")), FINGERPRINT(String.valueOf("FINGERPRINT")), IRIS_SCAN(String.valueOf("IRIS_SCAN")), AUDIO_VIDEO_RECORDING(String.valueOf("AUDIO_VIDEO_RECORDING")), UNKNOWN(String.valueOf("UNKNOWN")), DOCUMENT_SCAN(String.valueOf("DOCUMENT_SCAN")), DOCUMENT_IMAGE(String.valueOf("DOCUMENT_IMAGE")), CHIP_READ(String.valueOf("CHIP_READ"));


    private String value;

    FacialImageTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static FacialImageTypeEnum fromValue(String value) {
        for (FacialImageTypeEnum b : FacialImageTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private  FacialImageTypeEnum facialImageType;
  private  String horizontalLineLength;
  private  byte[] imageData;
  private  String verticalLineLength;

  /**
   **/
  public FacialImage biometricException(BiometricException biometricException) {
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
  public FacialImage collectionAttemptCount(String collectionAttemptCount) {
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
  public FacialImage compressionAlgorithm(String compressionAlgorithm) {
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
  public FacialImage facialImageIdentifier(FacialImageIdentifier facialImageIdentifier) {
    this.facialImageIdentifier = facialImageIdentifier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("facialImageIdentifier")
  public FacialImageIdentifier getFacialImageIdentifier() {
    return facialImageIdentifier;
  }
  public void setFacialImageIdentifier(FacialImageIdentifier facialImageIdentifier) {
    this.facialImageIdentifier = facialImageIdentifier;
  }

  /**
   **/
  public FacialImage facialImageType(FacialImageTypeEnum facialImageType) {
    this.facialImageType = facialImageType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("facialImageType")
  public FacialImageTypeEnum getFacialImageType() {
    return facialImageType;
  }
  public void setFacialImageType(FacialImageTypeEnum facialImageType) {
    this.facialImageType = facialImageType;
  }

  /**
   **/
  public FacialImage horizontalLineLength(String horizontalLineLength) {
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
  public FacialImage imageData(byte[] imageData) {
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
  public FacialImage verticalLineLength(String verticalLineLength) {
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
    FacialImage facialImage = (FacialImage) o;
    return Objects.equals(this.biometricException, facialImage.biometricException) &&
        Objects.equals(this.collectionAttemptCount, facialImage.collectionAttemptCount) &&
        Objects.equals(this.compressionAlgorithm, facialImage.compressionAlgorithm) &&
        Objects.equals(this.facialImageIdentifier, facialImage.facialImageIdentifier) &&
        Objects.equals(this.facialImageType, facialImage.facialImageType) &&
        Objects.equals(this.horizontalLineLength, facialImage.horizontalLineLength) &&
        Objects.equals(this.imageData, facialImage.imageData) &&
        Objects.equals(this.verticalLineLength, facialImage.verticalLineLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometricException, collectionAttemptCount, compressionAlgorithm, facialImageIdentifier, facialImageType, horizontalLineLength, imageData, verticalLineLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialImage {\n");
    
    sb.append("    biometricException: ").append(toIndentedString(biometricException)).append("\n");
    sb.append("    collectionAttemptCount: ").append(toIndentedString(collectionAttemptCount)).append("\n");
    sb.append("    compressionAlgorithm: ").append(toIndentedString(compressionAlgorithm)).append("\n");
    sb.append("    facialImageIdentifier: ").append(toIndentedString(facialImageIdentifier)).append("\n");
    sb.append("    facialImageType: ").append(toIndentedString(facialImageType)).append("\n");
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

