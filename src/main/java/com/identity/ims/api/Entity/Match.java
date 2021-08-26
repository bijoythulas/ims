package com.identity.ims.api.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Match {

  @Id
  @GeneratedValue
  private int id;

  @NonNull
  private String name;

  @NonNull
  private String pid;

  @OneToMany(targetEntity = EncounterType.class,cascade = CascadeType.ALL)
  @JoinColumn(name ="match_id",referencedColumnName = "id")
  private List <EncounterType> encounterTypes;


}
