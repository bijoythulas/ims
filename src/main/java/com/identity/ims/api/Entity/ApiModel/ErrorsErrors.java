package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.ErrorsSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * standard error response structure as per jsonapi.org/format/#errors
 **/
@ApiModel(description = "standard error response structure as per jsonapi.org/format/#errors")
public class ErrorsErrors   {
  
  private  String code;
  private  String detail;
  private  String id;
  private  ErrorsSource source;

  /**
   * A provider-specific or enterprise defined error code. Codes must be in uppercase.
   **/
  public ErrorsErrors code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "A provider-specific or enterprise defined error code. Codes must be in uppercase.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A provider-specific or enterprise defined error message
   **/
  public ErrorsErrors detail(String detail) {
    this.detail = detail;
    return this;
  }

  
  @ApiModelProperty(value = "A provider-specific or enterprise defined error message")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  /**
   * Unique identifier for the error occurrence, to provide traceability in application logs.
   **/
  public ErrorsErrors id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier for the error occurrence, to provide traceability in application logs.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public ErrorsErrors source(ErrorsSource source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source")
  public ErrorsSource getSource() {
    return source;
  }
  public void setSource(ErrorsSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsErrors errorsErrors = (ErrorsErrors) o;
    return Objects.equals(this.code, errorsErrors.code) &&
        Objects.equals(this.detail, errorsErrors.detail) &&
        Objects.equals(this.id, errorsErrors.id) &&
        Objects.equals(this.source, errorsErrors.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detail, id, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsErrors {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

