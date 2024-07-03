package com.example.patientservice.repository;

import com.example.patientservice.model.PatientNotificationPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientNotificationPreferenceRepository extends JpaRepository<PatientNotificationPreference, Long> {
}
