package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.VehiculeMake;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeMakeRepository extends JpaRepositoryImplementation<VehiculeMake, Long> {
}
