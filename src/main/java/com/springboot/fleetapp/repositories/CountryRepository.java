package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.Country;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepositoryImplementation<Country, Long> {
}
