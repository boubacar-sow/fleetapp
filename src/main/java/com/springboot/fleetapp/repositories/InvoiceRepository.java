package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.Invoice;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepositoryImplementation<Invoice, Long> {
}
