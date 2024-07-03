package com.example.patientservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patient_names")
public class PatientName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nameId;

    private String name;

    private String type;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}