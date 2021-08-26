package com.identity.ims.api.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "EncounterType")
public class EncounterType extends BaseEntity {
    @Id
    @GeneratedValue
    private int id;

    private String code;

    private String description; 
 

}
