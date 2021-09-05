package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class DocumentVerificationVerificationActivities   {
  
  private  String activityNote;
  private  String activityOrder;
  private  String activityOutcome;
  private  OffsetDateTime activityTimeStamp;
  private  String officerName;

  /**
   **/
  public DocumentVerificationVerificationActivities activityNote(String activityNote) {
    this.activityNote = activityNote;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("activityNote")
  public String getActivityNote() {
    return activityNote;
  }
  public void setActivityNote(String activityNote) {
    this.activityNote = activityNote;
  }

  /**
   **/
  public DocumentVerificationVerificationActivities activityOrder(String activityOrder) {
    this.activityOrder = activityOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("activityOrder")
  public String getActivityOrder() {
    return activityOrder;
  }
  public void setActivityOrder(String activityOrder) {
    this.activityOrder = activityOrder;
  }

  /**
   **/
  public DocumentVerificationVerificationActivities activityOutcome(String activityOutcome) {
    this.activityOutcome = activityOutcome;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("activityOutcome")
  public String getActivityOutcome() {
    return activityOutcome;
  }
  public void setActivityOutcome(String activityOutcome) {
    this.activityOutcome = activityOutcome;
  }

  /**
   **/
  public DocumentVerificationVerificationActivities activityTimeStamp(OffsetDateTime activityTimeStamp) {
    this.activityTimeStamp = activityTimeStamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("activityTimeStamp")
  public OffsetDateTime getActivityTimeStamp() {
    return activityTimeStamp;
  }
  public void setActivityTimeStamp(OffsetDateTime activityTimeStamp) {
    this.activityTimeStamp = activityTimeStamp;
  }

  /**
   **/
  public DocumentVerificationVerificationActivities officerName(String officerName) {
    this.officerName = officerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("officerName")
  public String getOfficerName() {
    return officerName;
  }
  public void setOfficerName(String officerName) {
    this.officerName = officerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentVerificationVerificationActivities documentVerificationVerificationActivities = (DocumentVerificationVerificationActivities) o;
    return Objects.equals(this.activityNote, documentVerificationVerificationActivities.activityNote) &&
        Objects.equals(this.activityOrder, documentVerificationVerificationActivities.activityOrder) &&
        Objects.equals(this.activityOutcome, documentVerificationVerificationActivities.activityOutcome) &&
        Objects.equals(this.activityTimeStamp, documentVerificationVerificationActivities.activityTimeStamp) &&
        Objects.equals(this.officerName, documentVerificationVerificationActivities.officerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityNote, activityOrder, activityOutcome, activityTimeStamp, officerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVerificationVerificationActivities {\n");
    
    sb.append("    activityNote: ").append(toIndentedString(activityNote)).append("\n");
    sb.append("    activityOrder: ").append(toIndentedString(activityOrder)).append("\n");
    sb.append("    activityOutcome: ").append(toIndentedString(activityOutcome)).append("\n");
    sb.append("    activityTimeStamp: ").append(toIndentedString(activityTimeStamp)).append("\n");
    sb.append("    officerName: ").append(toIndentedString(officerName)).append("\n");
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

