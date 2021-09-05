package com.identity.ims.api.entity.idh;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Match {

  @Id
  @GeneratedValue
  private int id;

  @NonNull
  private String name;

  @NonNull
  private String pid;

  @JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  private Encounter encounter;

  //region encounterTypes

  @OneToMany(
    mappedBy = "match",
    cascade = CascadeType.ALL,
    orphanRemoval = true
  )
  private List<EncounterType> encounterTypes;

  public void addEncounterType(EncounterType encounterType) {
    encounterTypes.add(encounterType);
    encounterType.setMatch(this);
  }

  public void removeEncounterType(EncounterType encounterType) {
    encounterTypes.remove(encounterType);
    encounterType.setMatch(null);
  }

  public void setEncounterTypes(List<EncounterType> encounterTypes) {
    this.encounterTypes = encounterTypes;
    encounterTypes.forEach(entity -> entity.setMatch(this));
  }
  //endregion

  //endregion
}
