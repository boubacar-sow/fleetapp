package com.springboot.fleetapp.repositories;

import com.springboot.fleetapp.models.JobTitle;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepositoryImplementation<JobTitle, Long> {
}
