package com.identity.ims.api.repository;
import java.util.List;



import com.identity.ims.api.Entity.Encounter;
import com.identity.ims.api.dto.ShortsDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EncounterRepository extends JpaRepository<Encounter,Integer> {
  
@Query(nativeQuery = true,value="select m.name as name  from encounter e join match m on e.id =m.encounter_id  where e.id =?1")
//List<ShortsDto> findMatches(Integer id);
List<ShortsDto> findMatches(Integer id);

@Query(nativeQuery = true,value="select m.name as name  from encounter e join match m on e.id =m.encounter_id  where e.id =?1")
//List<ShortsDto> findMatches(Integer id);
List<ShortsDto> findEncounterByBpId(Integer BpiId);;


}
