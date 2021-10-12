package com.example.fallmonitor.common.exception;

public class PatientNotFoundException extends Exception{
    public PatientNotFoundException() {
        super("Patient not found.");
    }
}
