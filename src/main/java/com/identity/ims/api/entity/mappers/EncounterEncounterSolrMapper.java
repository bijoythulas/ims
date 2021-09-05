package com.identity.ims.api.entity.mappers;


import com.identity.ims.api.entity.idh.Encounter;
import com.identity.ims.api.entity.idh.EncounterSolr;

import org.mapstruct.Mapper;

@Mapper
public interface EncounterEncounterSolrMapper {
    EncounterSolr sourceToDestination(Encounter source);
    //EncounterSolr destinationToSource(Encounter destination);
}
