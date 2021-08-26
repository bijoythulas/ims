package com.identity.ims.api.Entity.Code;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.identity.ims.api.Entity.BaseCodeEntity;

@Entity
@Table(name = "country",schema="code")
public class Country extends BaseCodeEntity {
    
}
