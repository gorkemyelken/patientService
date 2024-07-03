package com.example.patientservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "patient_history")
public class PatientHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historyId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Temporal(TemporalType.TIMESTAMP)
    private Date changeDate;

    private String changeDetails;

    private Integer version;
}