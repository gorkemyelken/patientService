package com.example.patientservice.repository;

import com.example.patientservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByGender(String gender);
    List<Patient> findByFirstName(String firstName);
    List<Patient> findByLastName(String lastName);
    List<Patient> findByBirthDateBetween(Date startDate, Date endDate);
}

