package com.example.fallmonitor.notification.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

@Data
public class Patient {
    @Id
    @Embedded.Nullable
    private PatientId patientId;
    private String name;
    private int roomNumber;
    private int phoneNumber;

}
