package com.identity.ims.api.Entity;

import com.identity.ims.api.enums.BiometricCaptureType;
import com.identity.ims.api.enums.CodeTable;
import com.identity.ims.api.utils.validation.ListValidation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@ApiModel(
  description = "Party encounter details to be provided when registering encounters"
)
public class Encounter extends BaseEntity {

  @ApiModelProperty(
    notes = " includes first name and last name",
    example = "joe bloggs",
    required = true,
    position = 0
  )
  @Size(min = 0, max = 20)
  @NotEmpty
  @NonNull
  private String name;

  @ApiModelProperty(
    notes = "parties age",
    example = "60",
    required = true,
    position = 0
  )
  @NotNull(message = "age is required")
  @NonNull
  @Max(value = 100, message = "Maximum is 100")
  private Integer age;

  @Email
  @NotEmpty
  @NotNull
  @NonNull
  @Column(unique = true)
  private String contactEmail;

  @ListValidation(message = "Invalid country", codeTable = CodeTable.country)
  @NotNull(message = "country is required")
  @NonNull
  private String country;

  @Enumerated(EnumType.STRING)
  @NotNull(message = "imageBiometricCaptureType is required")
  @NonNull
  private BiometricCaptureType imageBiometricCaptureType;

  //region matches
  //@Setter(AccessLevel.NONE)

  @OneToMany(
    fetch = FetchType.LAZY,
    mappedBy = "encounter",
    cascade = CascadeType.ALL,
    orphanRemoval = true
  )
  private List<Match> matches;

  public void addMatch(Match match) {
    matches.add(match);
    match.setEncounter(this);
  }

  public void removeMatch(Match match) {
    matches.remove(match);
    match.setEncounter(null);
  }

  public void setMatches(List<Match> matches) {
    System.out.println("enter set matches");
    this.matches = matches;
    matches.forEach(entity -> entity.setEncounter(this));
  }

  //endregion

  //region encounterLocations
  //@Setter(AccessLevel.NONE)

  @OneToMany(
    fetch = FetchType.LAZY,
    mappedBy = "encounter",
    cascade = CascadeType.ALL,
    orphanRemoval = true
  )
  private List<EncounterLocation> encounterLocations;

  public void addEncounterLocation(EncounterLocation encounterlocation) {
    encounterLocations.add(encounterlocation);
    encounterlocation.setEncounter(this);
  }

  public void removeEncounterLocation(EncounterLocation encounterlocation) {
    encounterLocations.remove(encounterlocation);
    encounterlocation.setEncounter(null);
  }

  public void setEncounterLocations(
    List<EncounterLocation> encounterLocations
  ) {
    this.encounterLocations = encounterLocations;
    encounterLocations.forEach(entity -> entity.setEncounter(this));
  }
  //endregion

  //region childrens template
  /* 
//w preserveCase --> childList -> childobject  -> parentObject

@OneToMany(mappedBy = "parentObject",cascade = CascadeType.ALL,orphanRemoval = true)

private List<ChildObject> childList;
public void addChildObject(ChildObject childObject)
{
 
  childList.add(childObject);
  childObject.setParentObject(this);

}

public void removeChildObject(ChildObject childObject)
{
  childList.remove(childObject);
  childObject.setParentObject(null);
}

public void setChildList(List<ChildObject> childList) {
  this.childList = childList;
  childList.forEach(entity -> entity.setParentObject(this));
} 
//endregion

*/

}
