package com.example.patientservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patient_notification_preferences")
public class PatientNotificationPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preferenceId;

    private String notificationMethod;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}