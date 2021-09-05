package com.identity.ims.api.repository;

import com.identity.ims.api.entity.idh.EncounterSolr;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;

//https://www.baeldung.com/spring-data-solr


import org.springframework.data.solr.repository.SolrCrudRepository;


public interface SolrEncounterRepository extends SolrCrudRepository<EncounterSolr, Integer>{

	EncounterSolr findByName(String name);

	@Query("id:*?0* OR name:*?0*")
    public Page<EncounterSolr> findByCustomQuery(String searchTerm, Pageable pageable);


}