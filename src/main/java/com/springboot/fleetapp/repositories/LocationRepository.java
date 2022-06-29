package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.Location;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepositoryImplementation<Location, Long> {
}
