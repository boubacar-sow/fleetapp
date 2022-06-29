package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.Client;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ClientRepository extends JpaRepositoryImplementation<Client, Long> {
}
