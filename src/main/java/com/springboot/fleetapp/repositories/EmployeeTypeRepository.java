package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.EmployeeType;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepository extends JpaRepositoryImplementation<EmployeeType, Long> {
}
