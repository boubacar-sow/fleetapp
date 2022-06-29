package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.Supplier;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepositoryImplementation<Supplier, Long> {
}
