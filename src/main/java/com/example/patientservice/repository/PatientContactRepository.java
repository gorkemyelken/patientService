package com.example.patientservice.repository;

import com.example.patientservice.model.PatientContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientContactRepository extends JpaRepository<PatientContact, Long> {
}
