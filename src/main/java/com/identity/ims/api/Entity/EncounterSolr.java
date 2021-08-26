package com.identity.ims.api.Entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection = "identity")
public class EncounterSolr {
    
    
  @Id
  @Field
  private int id;

  @Field
  private String name;

  @Field
  private Integer age;

  @Field
  private String country;
}
