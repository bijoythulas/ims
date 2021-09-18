package com.identity.ims.api.entity.mappers;

import com.identity.ims.api.entity.idh.Encounter;
import com.identity.ims.api.entity.idh.EncounterSolr;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-18T18:36:28+1000",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 16.0.2 (Eclipse Foundation)"
)
@Component
public class EncounterEncounterSolrMapperImpl implements EncounterEncounterSolrMapper {

    @Override
    public EncounterSolr sourceToDestination(Encounter source) {
        if ( source == null ) {
            return null;
        }

        EncounterSolr encounterSolr = new EncounterSolr();

        encounterSolr.setAge( source.getAge() );
        encounterSolr.setCountry( source.getCountry() );
        encounterSolr.setId( source.getId() );
        encounterSolr.setName( source.getName() );

        return encounterSolr;
    }
}
