package com.example.patientservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patient_identifiers")
public class PatientIdentifier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifierId;

    private String identifierType;

    private String identifierValue;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
