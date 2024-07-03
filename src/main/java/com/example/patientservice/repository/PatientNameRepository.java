package com.example.patientservice.repository;

import com.example.patientservice.model.PatientName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientNameRepository extends JpaRepository<PatientName, Long> {
}
