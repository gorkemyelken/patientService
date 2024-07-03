package com.example.patientservice.repository;

import com.example.patientservice.model.PatientIdentifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientIdentifierRepository extends JpaRepository<PatientIdentifier, Long> {
}
