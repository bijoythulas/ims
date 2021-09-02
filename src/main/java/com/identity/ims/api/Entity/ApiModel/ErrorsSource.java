package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * An object containing references to the source of the error.
 **/
@ApiModel(description = "An object containing references to the source of the error.")
public class ErrorsSource   {
  
  private  String location;
  private  String parameter;
  private  String pointer;

  /**
   * Describes the location of the data which the message is related to.
   **/
  public ErrorsSource location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "Describes the location of the data which the message is related to.")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * The parameter name which the message relates to. The message object should container either the pointer or parameter property â€“ not both.
   **/
  public ErrorsSource parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  
  @ApiModelProperty(value = "The parameter name which the message relates to. The message object should container either the pointer or parameter property â€“ not both.")
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  /**
   * A JSON pointer which describes which property in the request object the message relates to. For more details on JSON pointers see RFC6901: https://tools.ietf.org/html/rfc6901
   **/
  public ErrorsSource pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

  
  @ApiModelProperty(value = "A JSON pointer which describes which property in the request object the message relates to. For more details on JSON pointers see RFC6901: https://tools.ietf.org/html/rfc6901")
  @JsonProperty("pointer")
  public String getPointer() {
    return pointer;
  }
  public void setPointer(String pointer) {
    this.pointer = pointer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsSource errorsSource = (ErrorsSource) o;
    return Objects.equals(this.location, errorsSource.location) &&
        Objects.equals(this.parameter, errorsSource.parameter) &&
        Objects.equals(this.pointer, errorsSource.pointer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, parameter, pointer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsSource {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
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

