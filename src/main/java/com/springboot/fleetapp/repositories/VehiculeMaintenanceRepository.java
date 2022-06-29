package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.VehiculeMaintenance;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeMaintenanceRepository extends JpaRepositoryImplementation<VehiculeMaintenance, Long> {
}
