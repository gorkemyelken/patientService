package com.example.patientservice.repository;
import com.example.patientservice.model.PatientHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientHistoryRepository extends JpaRepository<PatientHistory, Long>{
}
