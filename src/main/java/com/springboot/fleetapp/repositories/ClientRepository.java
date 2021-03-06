package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.Client;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepositoryImplementation<Client, Long> {
}
