package com.identity.ims.api.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class EncounterLocation extends BaseEntity {

  private String locationName;

  @JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  //@JoinColumn(name="encounter_id")
  private Encounter encounter;
}
