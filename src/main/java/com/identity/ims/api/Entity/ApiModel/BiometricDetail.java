package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.AcquisitionMethod;
import com.identity.ims.api.Entity.ApiModel.BiometricDetailBiometricCaptureDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class BiometricDetail   {
  
  private  String aCTProvision;
  private  AcquisitionMethod acquisitionMethod;
  private  OffsetDateTime acquisitionTimeStamp;
  private  BiometricDetailBiometricCaptureDevice biometricCaptureDevice;

public enum BiometricModeEnum {

    FACE(String.valueOf("FACE")), FINGERPRINT_AND_FACE(String.valueOf("FINGERPRINT_AND_FACE")), FINGERPRINT(String.valueOf("FINGERPRINT")), FUSION(String.valueOf("FUSION")), IRIS_SCAN(String.valueOf("IRIS_SCAN"));


    private String value;

    BiometricModeEnum (String v) {
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
    public static BiometricModeEnum fromValue(String value) {
        for (BiometricModeEnum b : BiometricModeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private  BiometricModeEnum biometricMode;
  private  Boolean captureConsentFlag;
  private  String captureNonConsentComment;
  private  String captureReason;
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  String imageNote;

  /**
   **/
  public BiometricDetail aCTProvision(String aCTProvision) {
    this.aCTProvision = aCTProvision;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aCTProvision")
  public String getaCTProvision() {
    return aCTProvision;
  }
  public void setaCTProvision(String aCTProvision) {
    this.aCTProvision = aCTProvision;
  }

  /**
   **/
  public BiometricDetail acquisitionMethod(AcquisitionMethod acquisitionMethod) {
    this.acquisitionMethod = acquisitionMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("acquisitionMethod")
  public AcquisitionMethod getAcquisitionMethod() {
    return acquisitionMethod;
  }
  public void setAcquisitionMethod(AcquisitionMethod acquisitionMethod) {
    this.acquisitionMethod = acquisitionMethod;
  }

  /**
   **/
  public BiometricDetail acquisitionTimeStamp(OffsetDateTime acquisitionTimeStamp) {
    this.acquisitionTimeStamp = acquisitionTimeStamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("acquisitionTimeStamp")
  public OffsetDateTime getAcquisitionTimeStamp() {
    return acquisitionTimeStamp;
  }
  public void setAcquisitionTimeStamp(OffsetDateTime acquisitionTimeStamp) {
    this.acquisitionTimeStamp = acquisitionTimeStamp;
  }

  /**
   **/
  public BiometricDetail biometricCaptureDevice(BiometricDetailBiometricCaptureDevice biometricCaptureDevice) {
    this.biometricCaptureDevice = biometricCaptureDevice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("biometricCaptureDevice")
  public BiometricDetailBiometricCaptureDevice getBiometricCaptureDevice() {
    return biometricCaptureDevice;
  }
  public void setBiometricCaptureDevice(BiometricDetailBiometricCaptureDevice biometricCaptureDevice) {
    this.biometricCaptureDevice = biometricCaptureDevice;
  }

  /**
   **/
  public BiometricDetail biometricMode(BiometricModeEnum biometricMode) {
    this.biometricMode = biometricMode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("biometricMode")
  public BiometricModeEnum getBiometricMode() {
    return biometricMode;
  }
  public void setBiometricMode(BiometricModeEnum biometricMode) {
    this.biometricMode = biometricMode;
  }

  /**
   **/
  public BiometricDetail captureConsentFlag(Boolean captureConsentFlag) {
    this.captureConsentFlag = captureConsentFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("captureConsentFlag")
  public Boolean getCaptureConsentFlag() {
    return captureConsentFlag;
  }
  public void setCaptureConsentFlag(Boolean captureConsentFlag) {
    this.captureConsentFlag = captureConsentFlag;
  }

  /**
   **/
  public BiometricDetail captureNonConsentComment(String captureNonConsentComment) {
    this.captureNonConsentComment = captureNonConsentComment;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("captureNonConsentComment")
  public String getCaptureNonConsentComment() {
    return captureNonConsentComment;
  }
  public void setCaptureNonConsentComment(String captureNonConsentComment) {
    this.captureNonConsentComment = captureNonConsentComment;
  }

  /**
   **/
  public BiometricDetail captureReason(String captureReason) {
    this.captureReason = captureReason;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("captureReason")
  public String getCaptureReason() {
    return captureReason;
  }
  public void setCaptureReason(String captureReason) {
    this.captureReason = captureReason;
  }

  /**
   **/
  public BiometricDetail cessationDate(LocalDate cessationDate) {
    this.cessationDate = cessationDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cessationDate")
  public LocalDate getCessationDate() {
    return cessationDate;
  }
  public void setCessationDate(LocalDate cessationDate) {
    this.cessationDate = cessationDate;
  }

  /**
   **/
  public BiometricDetail commencementDate(LocalDate commencementDate) {
    this.commencementDate = commencementDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("commencementDate")
  public LocalDate getCommencementDate() {
    return commencementDate;
  }
  public void setCommencementDate(LocalDate commencementDate) {
    this.commencementDate = commencementDate;
  }

  /**
   **/
  public BiometricDetail imageNote(String imageNote) {
    this.imageNote = imageNote;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("imageNote")
  public String getImageNote() {
    return imageNote;
  }
  public void setImageNote(String imageNote) {
    this.imageNote = imageNote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiometricDetail biometricDetail = (BiometricDetail) o;
    return Objects.equals(this.aCTProvision, biometricDetail.aCTProvision) &&
        Objects.equals(this.acquisitionMethod, biometricDetail.acquisitionMethod) &&
        Objects.equals(this.acquisitionTimeStamp, biometricDetail.acquisitionTimeStamp) &&
        Objects.equals(this.biometricCaptureDevice, biometricDetail.biometricCaptureDevice) &&
        Objects.equals(this.biometricMode, biometricDetail.biometricMode) &&
        Objects.equals(this.captureConsentFlag, biometricDetail.captureConsentFlag) &&
        Objects.equals(this.captureNonConsentComment, biometricDetail.captureNonConsentComment) &&
        Objects.equals(this.captureReason, biometricDetail.captureReason) &&
        Objects.equals(this.cessationDate, biometricDetail.cessationDate) &&
        Objects.equals(this.commencementDate, biometricDetail.commencementDate) &&
        Objects.equals(this.imageNote, biometricDetail.imageNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aCTProvision, acquisitionMethod, acquisitionTimeStamp, biometricCaptureDevice, biometricMode, captureConsentFlag, captureNonConsentComment, captureReason, cessationDate, commencementDate, imageNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricDetail {\n");
    
    sb.append("    aCTProvision: ").append(toIndentedString(aCTProvision)).append("\n");
    sb.append("    acquisitionMethod: ").append(toIndentedString(acquisitionMethod)).append("\n");
    sb.append("    acquisitionTimeStamp: ").append(toIndentedString(acquisitionTimeStamp)).append("\n");
    sb.append("    biometricCaptureDevice: ").append(toIndentedString(biometricCaptureDevice)).append("\n");
    sb.append("    biometricMode: ").append(toIndentedString(biometricMode)).append("\n");
    sb.append("    captureConsentFlag: ").append(toIndentedString(captureConsentFlag)).append("\n");
    sb.append("    captureNonConsentComment: ").append(toIndentedString(captureNonConsentComment)).append("\n");
    sb.append("    captureReason: ").append(toIndentedString(captureReason)).append("\n");
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    imageNote: ").append(toIndentedString(imageNote)).append("\n");
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

