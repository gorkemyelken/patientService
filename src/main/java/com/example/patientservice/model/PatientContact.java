package com.example.patientservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patient_contacts")
public class PatientContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    private String contactType;

    private String contactValue;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
