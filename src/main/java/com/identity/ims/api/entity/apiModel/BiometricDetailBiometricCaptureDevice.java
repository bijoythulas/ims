package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class BiometricDetailBiometricCaptureDevice   {
  
  private  String hostName;
  private  String iPAddress;
  private  String imageCaptureDeviceIdentifier;
  private  String imageCaptureDeviceModel;

public enum ImageCaptureDeviceTypeEnum {

    NULL_DEVICE(String.valueOf("NULL_DEVICE")), STATIC_PHOTOGRAPH_FROM_AN_UNKNOWN_SOURCE(String.valueOf("STATIC_PHOTOGRAPH_FROM_AN_UNKNOWN_SOURCE")), STATIC_PHOTOGRAPH_FROM_A_DIGITAL_STILL_IMAGE_CAMERA(String.valueOf("STATIC_PHOTOGRAPH_FROM_A_DIGITAL_STILL_IMAGE_CAMERA")), STATIC_PHOTOGRAPH_FROM_A_SCANNER(String.valueOf("STATIC_PHOTOGRAPH_FROM_A_SCANNER")), SINGLE_VIDEO_FRAME_FROM_AN_UNKNOWN_SOURCE(String.valueOf("SINGLE_VIDEO_FRAME_FROM_AN_UNKNOWN_SOURCE")), SINGLE_VIDEO_FRAME_FROM_AN_ANALOGUE_VIDEO_CAMERA(String.valueOf("SINGLE_VIDEO_FRAME_FROM_AN_ANALOGUE_VIDEO_CAMERA")), SINGLE_VIDEO_FRAME_FROM_A_DIGITAL_VIDEO_CAMERA(String.valueOf("SINGLE_VIDEO_FRAME_FROM_A_DIGITAL_VIDEO_CAMERA")), UNKNOWN(String.valueOf("UNKNOWN")), FINGERPRINT_SCANNER(String.valueOf("FINGERPRINT_SCANNER")), FINGERPRINT_FLAT_BED_SCANNER(String.valueOf("FINGERPRINT_FLAT_BED_SCANNER")), FRAUDULENT_TRAVEL_DOCUMENT_DETECTION_SYSTEM(String.valueOf("FRAUDULENT_TRAVEL_DOCUMENT_DETECTION_SYSTEM"));


    private String value;

    ImageCaptureDeviceTypeEnum (String v) {
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
    public static ImageCaptureDeviceTypeEnum fromValue(String value) {
        for (ImageCaptureDeviceTypeEnum b : ImageCaptureDeviceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private  ImageCaptureDeviceTypeEnum imageCaptureDeviceType;

  /**
   **/
  public BiometricDetailBiometricCaptureDevice hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hostName")
  public String getHostName() {
    return hostName;
  }
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  /**
   **/
  public BiometricDetailBiometricCaptureDevice iPAddress(String iPAddress) {
    this.iPAddress = iPAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("iPAddress")
  public String getiPAddress() {
    return iPAddress;
  }
  public void setiPAddress(String iPAddress) {
    this.iPAddress = iPAddress;
  }

  /**
   **/
  public BiometricDetailBiometricCaptureDevice imageCaptureDeviceIdentifier(String imageCaptureDeviceIdentifier) {
    this.imageCaptureDeviceIdentifier = imageCaptureDeviceIdentifier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("imageCaptureDeviceIdentifier")
  public String getImageCaptureDeviceIdentifier() {
    return imageCaptureDeviceIdentifier;
  }
  public void setImageCaptureDeviceIdentifier(String imageCaptureDeviceIdentifier) {
    this.imageCaptureDeviceIdentifier = imageCaptureDeviceIdentifier;
  }

  /**
   **/
  public BiometricDetailBiometricCaptureDevice imageCaptureDeviceModel(String imageCaptureDeviceModel) {
    this.imageCaptureDeviceModel = imageCaptureDeviceModel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("imageCaptureDeviceModel")
  public String getImageCaptureDeviceModel() {
    return imageCaptureDeviceModel;
  }
  public void setImageCaptureDeviceModel(String imageCaptureDeviceModel) {
    this.imageCaptureDeviceModel = imageCaptureDeviceModel;
  }

  /**
   **/
  public BiometricDetailBiometricCaptureDevice imageCaptureDeviceType(ImageCaptureDeviceTypeEnum imageCaptureDeviceType) {
    this.imageCaptureDeviceType = imageCaptureDeviceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("imageCaptureDeviceType")
  public ImageCaptureDeviceTypeEnum getImageCaptureDeviceType() {
    return imageCaptureDeviceType;
  }
  public void setImageCaptureDeviceType(ImageCaptureDeviceTypeEnum imageCaptureDeviceType) {
    this.imageCaptureDeviceType = imageCaptureDeviceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiometricDetailBiometricCaptureDevice biometricDetailBiometricCaptureDevice = (BiometricDetailBiometricCaptureDevice) o;
    return Objects.equals(this.hostName, biometricDetailBiometricCaptureDevice.hostName) &&
        Objects.equals(this.iPAddress, biometricDetailBiometricCaptureDevice.iPAddress) &&
        Objects.equals(this.imageCaptureDeviceIdentifier, biometricDetailBiometricCaptureDevice.imageCaptureDeviceIdentifier) &&
        Objects.equals(this.imageCaptureDeviceModel, biometricDetailBiometricCaptureDevice.imageCaptureDeviceModel) &&
        Objects.equals(this.imageCaptureDeviceType, biometricDetailBiometricCaptureDevice.imageCaptureDeviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostName, iPAddress, imageCaptureDeviceIdentifier, imageCaptureDeviceModel, imageCaptureDeviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricDetailBiometricCaptureDevice {\n");
    
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    iPAddress: ").append(toIndentedString(iPAddress)).append("\n");
    sb.append("    imageCaptureDeviceIdentifier: ").append(toIndentedString(imageCaptureDeviceIdentifier)).append("\n");
    sb.append("    imageCaptureDeviceModel: ").append(toIndentedString(imageCaptureDeviceModel)).append("\n");
    sb.append("    imageCaptureDeviceType: ").append(toIndentedString(imageCaptureDeviceType)).append("\n");
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

