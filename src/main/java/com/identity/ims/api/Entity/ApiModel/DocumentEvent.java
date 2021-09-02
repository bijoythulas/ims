package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.Reason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class DocumentEvent   {
  
  private  LocalDate eventDate;
  private  String eventNote;
  private  String eventPlace;
  private  Reason eventReason;
  private  String eventType;

  /**
   **/
  public DocumentEvent eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("eventDate")
  public LocalDate getEventDate() {
    return eventDate;
  }
  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  /**
   **/
  public DocumentEvent eventNote(String eventNote) {
    this.eventNote = eventNote;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("eventNote")
  public String getEventNote() {
    return eventNote;
  }
  public void setEventNote(String eventNote) {
    this.eventNote = eventNote;
  }

  /**
   **/
  public DocumentEvent eventPlace(String eventPlace) {
    this.eventPlace = eventPlace;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("eventPlace")
  public String getEventPlace() {
    return eventPlace;
  }
  public void setEventPlace(String eventPlace) {
    this.eventPlace = eventPlace;
  }

  /**
   **/
  public DocumentEvent eventReason(Reason eventReason) {
    this.eventReason = eventReason;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("eventReason")
  public Reason getEventReason() {
    return eventReason;
  }
  public void setEventReason(Reason eventReason) {
    this.eventReason = eventReason;
  }

  /**
   **/
  public DocumentEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentEvent documentEvent = (DocumentEvent) o;
    return Objects.equals(this.eventDate, documentEvent.eventDate) &&
        Objects.equals(this.eventNote, documentEvent.eventNote) &&
        Objects.equals(this.eventPlace, documentEvent.eventPlace) &&
        Objects.equals(this.eventReason, documentEvent.eventReason) &&
        Objects.equals(this.eventType, documentEvent.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDate, eventNote, eventPlace, eventReason, eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEvent {\n");
    
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventNote: ").append(toIndentedString(eventNote)).append("\n");
    sb.append("    eventPlace: ").append(toIndentedString(eventPlace)).append("\n");
    sb.append("    eventReason: ").append(toIndentedString(eventReason)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

