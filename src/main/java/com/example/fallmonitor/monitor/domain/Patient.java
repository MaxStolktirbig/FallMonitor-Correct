package com.example.fallmonitor.monitor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

@Data
public class Patient {
    @Id
    @Embedded.Nullable
    private PatientId patientId;
    private PatientSeverity severity;
    private String name;
    private int roomNumber;
    private int phoneNumber;
    private int age;
    private float length;


   public Patient(PatientSeverity severity, String name, int roomNumber, int phoneNumber, int age, float length) {
        this.severity = severity;
        this.name = name;
        this.roomNumber = roomNumber;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.length = length;
    }

    public static Patient create(PatientSeverity severity, String name, int roomNumber, int phoneNumber, int age, float length) {
        return new Patient(severity, name, roomNumber, phoneNumber, age, length);
    }

}
