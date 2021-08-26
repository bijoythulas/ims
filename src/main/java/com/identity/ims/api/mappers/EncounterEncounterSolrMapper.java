package com.identity.ims.api.mappers;


import com.identity.ims.api.Entity.Encounter;
import com.identity.ims.api.Entity.EncounterSolr;


import org.mapstruct.Mapper;

@Mapper
public interface EncounterEncounterSolrMapper {
    EncounterSolr sourceToDestination(Encounter source);
    //EncounterSolr destinationToSource(Encounter destination);
}
