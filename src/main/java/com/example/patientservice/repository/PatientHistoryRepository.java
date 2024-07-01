package com.example.patientservice.repository;

import com.example.patientservice.model.Patient;
import com.example.patientservice.model.PatientHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientHistoryRepository extends JpaRepository<PatientHistory, Long> {
}
