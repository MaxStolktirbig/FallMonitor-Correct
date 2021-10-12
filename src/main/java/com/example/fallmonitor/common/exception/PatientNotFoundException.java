package com.example.fallmonitor.common.exception;

public class PatientNotFoundException extends RuntimeException{
    public PatientNotFoundException() {
        super("Patient not found.");
    }
}
