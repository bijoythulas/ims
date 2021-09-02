package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A flag to enrol a person into the watchlist. Most consumers are to leave this set to false, specific consumers will set this to true.
 **/
@ApiModel(description = "A flag to enrol a person into the watchlist. Most consumers are to leave this set to false, specific consumers will set this to true.")
public class WatchlistEnrolment   {
  
  private  OffsetDateTime effectiveFromDateTime;
  private  OffsetDateTime effectiveToDateTime;
  private  Boolean watchlistEnrolmentFlag = false;

  /**
   **/
  public WatchlistEnrolment effectiveFromDateTime(OffsetDateTime effectiveFromDateTime) {
    this.effectiveFromDateTime = effectiveFromDateTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("effectiveFromDateTime")
  public OffsetDateTime getEffectiveFromDateTime() {
    return effectiveFromDateTime;
  }
  public void setEffectiveFromDateTime(OffsetDateTime effectiveFromDateTime) {
    this.effectiveFromDateTime = effectiveFromDateTime;
  }

  /**
   **/
  public WatchlistEnrolment effectiveToDateTime(OffsetDateTime effectiveToDateTime) {
    this.effectiveToDateTime = effectiveToDateTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("effectiveToDateTime")
  public OffsetDateTime getEffectiveToDateTime() {
    return effectiveToDateTime;
  }
  public void setEffectiveToDateTime(OffsetDateTime effectiveToDateTime) {
    this.effectiveToDateTime = effectiveToDateTime;
  }

  /**
   **/
  public WatchlistEnrolment watchlistEnrolmentFlag(Boolean watchlistEnrolmentFlag) {
    this.watchlistEnrolmentFlag = watchlistEnrolmentFlag;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("watchlistEnrolmentFlag")
  public Boolean getWatchlistEnrolmentFlag() {
    return watchlistEnrolmentFlag;
  }
  public void setWatchlistEnrolmentFlag(Boolean watchlistEnrolmentFlag) {
    this.watchlistEnrolmentFlag = watchlistEnrolmentFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistEnrolment watchlistEnrolment = (WatchlistEnrolment) o;
    return Objects.equals(this.effectiveFromDateTime, watchlistEnrolment.effectiveFromDateTime) &&
        Objects.equals(this.effectiveToDateTime, watchlistEnrolment.effectiveToDateTime) &&
        Objects.equals(this.watchlistEnrolmentFlag, watchlistEnrolment.watchlistEnrolmentFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveFromDateTime, effectiveToDateTime, watchlistEnrolmentFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistEnrolment {\n");
    
    sb.append("    effectiveFromDateTime: ").append(toIndentedString(effectiveFromDateTime)).append("\n");
    sb.append("    effectiveToDateTime: ").append(toIndentedString(effectiveToDateTime)).append("\n");
    sb.append("    watchlistEnrolmentFlag: ").append(toIndentedString(watchlistEnrolmentFlag)).append("\n");
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

