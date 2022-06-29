package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.VehiculeHire;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeHireRepository extends JpaRepositoryImplementation<VehiculeHire, Long> {
}
