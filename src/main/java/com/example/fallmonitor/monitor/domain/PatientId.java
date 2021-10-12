package com.example.fallmonitor.monitor.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public record PatientId (Integer patientId) {

    @JsonValue
    public Integer getPatientId(){
        return patientId;
    }
}
