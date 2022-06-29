package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.State;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepositoryImplementation<State, Long> {
}
