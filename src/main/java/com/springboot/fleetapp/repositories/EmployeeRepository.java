package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.Employee;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepositoryImplementation<Employee, Long> {
}
