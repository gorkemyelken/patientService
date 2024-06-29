package com.example.patientservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String gender;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Identifier> identifiers; // TCKN, Passport number, etc.

    @ElementCollection
    private List<Contact> contacts;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<NotificationPreference> notificationPreferences;

    private Integer version;

    @PrePersist
    @PreUpdate
    public void incrementVersion() {
        if (this.version == null) {
            this.version = 1;
        } else {
            this.version++;
        }
    }
}
