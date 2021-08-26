package com.identity.ims.api.Entity;

import com.identity.ims.api.enums.BiometricCaptureType;
import com.identity.ims.api.utils.validation.ListValidation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.*;
import lombok.*;

//https://www.baeldung.com/jpa-entity-graph
/*
@NamedEntityGraph(
  name = "graph.Encounter.Match",
  attributeNodes = @NamedAttributeNode(
    value = "matches",
    subgraph = "subgraph.encounter.match.encountertype"
  ),
  subgraphs = {
    @NamedSubgraph(
      name = "subgraph.encounter.match.encountertype",
      attributeNodes = @NamedAttributeNode(value = "encounterTypes")
    ),
  }
)
*/

@Data
@Entity
@ApiModel(
  description = "Party encounter details to be provided when registering encounters"
)
@RequiredArgsConstructor
@NoArgsConstructor

public class Encounter extends BaseEntity {

  @ApiModelProperty(
    notes = " includes first name and last name",
    example = "joe bloggs",
    required = true,
    position = 0
  )
  @Size(min = 0, max = 20)
  @NotNull(message = "name is required")
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
  @NotNull(message = "contactEmail is required")
  @NonNull
  @Column(unique = true)
  private String contactEmail;

  @ListValidation(message = "Invalid country", codeTable = "Country")
  @NotNull(message = "country is required")
  @NonNull
  private String country;

  @Enumerated(EnumType.STRING)
  @NotNull(message = "imageBiometricCaptureType is required")
  @NonNull
  private BiometricCaptureType imageBiometricCaptureType;

  @OneToMany(targetEntity = Match.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "encounter_id", referencedColumnName = "id")
  private List<Match> matches;
}
