package com.identity.ims.api.entity.code;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.Version;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Nationalized;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners (AuditingEntityListener.class)

public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String code;

    @Size(min = 0, max = 100)
    @Column(length = 100)
    private String shortDescription; 

    @Nationalized
    @Column(columnDefinition = "varchar(max)")
    private String longDescription; 

    private boolean isActive;


    @JsonIgnore
    @Version protected Integer version;
    
    @JsonIgnore
    @CreatedBy
    private String createdBy;

    @JsonIgnore
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @JsonIgnore
    @LastModifiedBy
    private String lastModifiedBy;
 
    @JsonIgnore
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

 

    

}
