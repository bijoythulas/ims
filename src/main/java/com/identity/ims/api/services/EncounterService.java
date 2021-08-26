package com.identity.ims.api.services;

import com.identity.ims.api.Entity.Encounter;
import com.identity.ims.api.Entity.Code.Country;
import com.identity.ims.api.dto.ShortsDto;

import com.identity.ims.api.repository.EncounterRepository;

import com.identity.ims.api.repository.Code.CountryRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncounterService {

@Autowired
private  EncounterRepository encounterRepository;

@Autowired
private CountryRepository countryRepository;

  @PersistenceContext
  @Autowired  
  private  EntityManager em;


  
  @Transactional
  public Encounter registerEncounter(Encounter encounter) {

    //updateCountry();

   encounterRepository.save(encounter);

    return encounter;
  }

  void updateCountry()
  {
    Country country=  countryRepository.getById(1);

    country.setShortDescription("Country changed");
    
  }

  public Encounter getEncounterById(Integer id) {
   
    return fetchUsingEM(id);
  }

  public List<ShortsDto> GetMatchesById(Integer id) {
    return encounterRepository.findMatches(id);
    
  }

  //this method uses entity manger to fetch 3 levels in one query avoid n+1 query.
  public Encounter fetchUsingEM(Integer id) {

    EntityGraph<Encounter> entityGraph = em.createEntityGraph(Encounter.class);
    // entityGraph.addAttributeNodes("matches");
    entityGraph.addSubgraph("matches").addAttributeNodes("encounterTypes");

    
    return em.find(Encounter.class, id, emProps(entityGraph));

  }

Map<String, Object> emProps(Object entityGraph){
  Map<String, Object> properties = new HashMap<>();
    properties.put("javax.persistence.fetchgraph", entityGraph);

    return properties;

}

 
}
