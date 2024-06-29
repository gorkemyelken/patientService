package com.example.patientservice.controller;

import com.example.patientservice.model.Patient;
import com.example.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/search")
    public List<Patient> searchPatients(
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) Date startDate,
            @RequestParam(required = false) Date endDate) {
        return patientService.searchPatients(gender, firstName, lastName, startDate, endDate);
    }
}
