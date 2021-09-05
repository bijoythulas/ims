package com.identity.ims.api.entity.idh;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class EncounterType extends BaseEntity {

  private String code;

  private String description;

  @JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  private Match match;
}
