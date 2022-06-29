package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.VehiculeStatus;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeStatusRepository extends JpaRepositoryImplementation<VehiculeStatus, Long> {
}
