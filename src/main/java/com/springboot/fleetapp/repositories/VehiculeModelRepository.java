package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.VehiculeModel;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeModelRepository extends JpaRepositoryImplementation<VehiculeModel, Long> {
}

