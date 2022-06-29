package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.Vehicule;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;


@Repository
public interface VehiculeRepository extends JpaRepositoryImplementation<Vehicule, Long> {
}
