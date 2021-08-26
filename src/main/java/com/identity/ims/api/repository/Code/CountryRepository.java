package com.identity.ims.api.repository.Code;

import com.identity.ims.api.Entity.Code.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Integer> {
    Country findByCode (String Code);
}

