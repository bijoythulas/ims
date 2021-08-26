package com.identity.ims.api.services;

import com.identity.ims.api.Entity.Encounter;
import com.identity.ims.api.Entity.EncounterSolr;
import com.identity.ims.api.mappers.EncounterEncounterSolrMapperImpl;
import com.identity.ims.api.repository.SolrEncounterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolrService {

  

  @Autowired
  private SolrEncounterRepository solrEncounterRepository;

  @Autowired 
  private EncounterEncounterSolrMapperImpl encounterEncounterSolrMapperImpl;

  public Boolean deleteAll(){
      solrEncounterRepository.deleteAll();
    return true;
  }

  public void Save(Encounter encounter)
	{
		EncounterSolr encounterSolr= encounterEncounterSolrMapperImpl.sourceToDestination(encounter);
		encounterSolr= solrEncounterRepository.save(encounterSolr);
	}

  

}
