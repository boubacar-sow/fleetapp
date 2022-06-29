package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.InvoiceStatus;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends JpaRepositoryImplementation<InvoiceStatus, Long> {
}
