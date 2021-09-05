package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.XDataDef;


/**
 * EMP Resource Lifecycle State Change Event Notification Schema
 **/
@ApiModel(description = "EMP Resource Lifecycle State Change Event Notification Schema")
public class EventSchema   {
  
  private  String id;
  private  String source;
  private  String specversion;
  private  String type;
  private  String datacontenttype;
  private  URI dataschema;
  private  String subject;
  private  OffsetDateTime time;
  private  XDataDef data;
  private  String dataBase64;
  private  String dataref;
  private  String sequence;

public enum SequencetypeEnum {

    INTEGER(String.valueOf("Integer"));


    private String value;

    SequencetypeEnum (String v) {
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
    public static SequencetypeEnum fromValue(String value) {
        for (SequencetypeEnum b : SequencetypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private  SequencetypeEnum sequencetype;
  private  String traceparent;
  private  String tracestate;
  private  String xprotectivemarking;
  private  String xaccessattributes;
  private  String xcorrelationid;

  /**
   * Identifies the event
   **/
  public EventSchema id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "A234-1234-1234", required = true, value = "Identifies the event")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Identifies the context in which an event happened
   **/
  public EventSchema source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(example = "urn:uuid:6e8bc430-9c3a-11d9-9669-0800200c9a66", required = true, value = "Identifies the context in which an event happened")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The version of the CloudEvents specification which the event uses
   **/
  public EventSchema specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  
  @ApiModelProperty(example = "1.0", required = true, value = "The version of the CloudEvents specification which the event uses")
  @JsonProperty("specversion")
  public String getSpecversion() {
    return specversion;
  }
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  /**
   * Describes the type of event related to the originating occurrence
   **/
  public EventSchema type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "com.github.pull_request.opened", required = true, value = "Describes the type of event related to the originating occurrence")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format
   **/
  public EventSchema datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format")
  @JsonProperty("datacontenttype")
  public String getDatacontenttype() {
    return datacontenttype;
  }
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  /**
   * Identifies the schema that data adheres to
   **/
  public EventSchema dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies the schema that data adheres to")
  @JsonProperty("dataschema")
  public URI getDataschema() {
    return dataschema;
  }
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source)
   **/
  public EventSchema subject(String subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(example = "mynewfile.jpg", value = "Describes the subject of the event in the context of the event producer (identified by source)")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339
   **/
  public EventSchema time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(example = "2018-04-05T17:31Z", value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339")
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  /**
   **/
  public EventSchema data(XDataDef data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public XDataDef getData() {
    return data;
  }
  public void setData(XDataDef data) {
    this.data = data;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648
   **/
  public EventSchema dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  
  @ApiModelProperty(example = "dGhlIG1pdG9jaG9uZHJpYSBpcyB0aGUgcG93ZXJob3VzZSBvZiB0aGUgY2VsbA==", value = "Base64 encoded event payload. Must adhere to RFC4648")
  @JsonProperty("data_base64")
  public String getDataBase64() {
    return dataBase64;
  }
  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }

  /**
   * A reference to a location where the event payload is stored. The location MAY not be accessible without further information (e.g. a pre-shared secret). See https://github.com/cloudevents/spec/blob/master/extensions/dataref.md#dataref 
   **/
  public EventSchema dataref(String dataref) {
    this.dataref = dataref;
    return this;
  }

  
  @ApiModelProperty(value = "A reference to a location where the event payload is stored. The location MAY not be accessible without further information (e.g. a pre-shared secret). See https://github.com/cloudevents/spec/blob/master/extensions/dataref.md#dataref ")
  @JsonProperty("dataref")
  public String getDataref() {
    return dataref;
  }
  public void setDataref(String dataref) {
    this.dataref = dataref;
  }

  /**
   * Value expressing the relative order of the event. This enables interpretation of data supercedence. See https://github.com/cloudevents/spec/blob/master/extensions/sequence.md#sequence-1 
   **/
  public EventSchema sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  
  @ApiModelProperty(value = "Value expressing the relative order of the event. This enables interpretation of data supercedence. See https://github.com/cloudevents/spec/blob/master/extensions/sequence.md#sequence-1 ")
  @JsonProperty("sequence")
  public String getSequence() {
    return sequence;
  }
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  /**
   * Specifies the semantics of the sequence attribute. See https://github.com/cloudevents/spec/blob/master/extensions/sequence.md#sequencetype 
   **/
  public EventSchema sequencetype(SequencetypeEnum sequencetype) {
    this.sequencetype = sequencetype;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the semantics of the sequence attribute. See https://github.com/cloudevents/spec/blob/master/extensions/sequence.md#sequencetype ")
  @JsonProperty("sequencetype")
  public SequencetypeEnum getSequencetype() {
    return sequencetype;
  }
  public void setSequencetype(SequencetypeEnum sequencetype) {
    this.sequencetype = sequencetype;
  }

  /**
   * Contains a version, trace ID, span ID, and trace options. See https://github.com/cloudevents/spec/blob/master/extensions/distributed-tracing.md#traceparent 
   **/
  public EventSchema traceparent(String traceparent) {
    this.traceparent = traceparent;
    return this;
  }

  
  @ApiModelProperty(value = "Contains a version, trace ID, span ID, and trace options. See https://github.com/cloudevents/spec/blob/master/extensions/distributed-tracing.md#traceparent ")
  @JsonProperty("traceparent")
  public String getTraceparent() {
    return traceparent;
  }
  public void setTraceparent(String traceparent) {
    this.traceparent = traceparent;
  }

  /**
   * A comma-delimited list of key-value pairs. See https://github.com/cloudevents/spec/blob/master/extensions/distributed-tracing.md#tracestate 
   **/
  public EventSchema tracestate(String tracestate) {
    this.tracestate = tracestate;
    return this;
  }

  
  @ApiModelProperty(value = "A comma-delimited list of key-value pairs. See https://github.com/cloudevents/spec/blob/master/extensions/distributed-tracing.md#tracestate ")
  @JsonProperty("tracestate")
  public String getTracestate() {
    return tracestate;
  }
  public void setTracestate(String tracestate) {
    this.tracestate = tracestate;
  }

  /**
   * The modified regular expression syntax of the protective marking. See Annex B #20 of https://www.protectivesecurity.gov.au/sites/default/files/2019-09/infosec08-sensitive-and-classified-information-email.pdf 
   **/
  public EventSchema xprotectivemarking(String xprotectivemarking) {
    this.xprotectivemarking = xprotectivemarking;
    return this;
  }

  
  @ApiModelProperty(example = "VER=2018.1, NS=gov.au, SEC=OFFICIAL, ORIGIN=neville.jones@entity.gov.au", value = "The modified regular expression syntax of the protective marking. See Annex B #20 of https://www.protectivesecurity.gov.au/sites/default/files/2019-09/infosec08-sensitive-and-classified-information-email.pdf ")
  @JsonProperty("xprotectivemarking")
  public String getXprotectivemarking() {
    return xprotectivemarking;
  }
  public void setXprotectivemarking(String xprotectivemarking) {
    this.xprotectivemarking = xprotectivemarking;
  }

  /**
   * ABAC/RBAC object attributes that drives access control enforcement. See https://nvlpubs.nist.gov/nistpubs/specialpublications/nist.sp.800-162.pdf 
   **/
  public EventSchema xaccessattributes(String xaccessattributes) {
    this.xaccessattributes = xaccessattributes;
    return this;
  }

  
  @ApiModelProperty(example = "TBD", value = "ABAC/RBAC object attributes that drives access control enforcement. See https://nvlpubs.nist.gov/nistpubs/specialpublications/nist.sp.800-162.pdf ")
  @JsonProperty("xaccessattributes")
  public String getXaccessattributes() {
    return xaccessattributes;
  }
  public void setXaccessattributes(String xaccessattributes) {
    this.xaccessattributes = xaccessattributes;
  }

  /**
   * Identifier that is used as a reference to a particular transaction or event chain.
   **/
  public EventSchema xcorrelationid(String xcorrelationid) {
    this.xcorrelationid = xcorrelationid;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier that is used as a reference to a particular transaction or event chain.")
  @JsonProperty("xcorrelationid")
  public String getXcorrelationid() {
    return xcorrelationid;
  }
  public void setXcorrelationid(String xcorrelationid) {
    this.xcorrelationid = xcorrelationid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSchema eventSchema = (EventSchema) o;
    return Objects.equals(this.id, eventSchema.id) &&
        Objects.equals(this.source, eventSchema.source) &&
        Objects.equals(this.specversion, eventSchema.specversion) &&
        Objects.equals(this.type, eventSchema.type) &&
        Objects.equals(this.datacontenttype, eventSchema.datacontenttype) &&
        Objects.equals(this.dataschema, eventSchema.dataschema) &&
        Objects.equals(this.subject, eventSchema.subject) &&
        Objects.equals(this.time, eventSchema.time) &&
        Objects.equals(this.data, eventSchema.data) &&
        Objects.equals(this.dataBase64, eventSchema.dataBase64) &&
        Objects.equals(this.dataref, eventSchema.dataref) &&
        Objects.equals(this.sequence, eventSchema.sequence) &&
        Objects.equals(this.sequencetype, eventSchema.sequencetype) &&
        Objects.equals(this.traceparent, eventSchema.traceparent) &&
        Objects.equals(this.tracestate, eventSchema.tracestate) &&
        Objects.equals(this.xprotectivemarking, eventSchema.xprotectivemarking) &&
        Objects.equals(this.xaccessattributes, eventSchema.xaccessattributes) &&
        Objects.equals(this.xcorrelationid, eventSchema.xcorrelationid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64, dataref, sequence, sequencetype, traceparent, tracestate, xprotectivemarking, xaccessattributes, xcorrelationid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
    sb.append("    dataschema: ").append(toIndentedString(dataschema)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataBase64: ").append(toIndentedString(dataBase64)).append("\n");
    sb.append("    dataref: ").append(toIndentedString(dataref)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    sequencetype: ").append(toIndentedString(sequencetype)).append("\n");
    sb.append("    traceparent: ").append(toIndentedString(traceparent)).append("\n");
    sb.append("    tracestate: ").append(toIndentedString(tracestate)).append("\n");
    sb.append("    xprotectivemarking: ").append(toIndentedString(xprotectivemarking)).append("\n");
    sb.append("    xaccessattributes: ").append(toIndentedString(xaccessattributes)).append("\n");
    sb.append("    xcorrelationid: ").append(toIndentedString(xcorrelationid)).append("\n");
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

