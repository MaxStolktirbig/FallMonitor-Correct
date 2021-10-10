package com.example.fallmonitor.monitor.domain;

import lombok.Data;

import java.util.List;

public class RecordedPatientData {
    private PatientId patientId;
    private List<RecordedDataInstanceId> recordedDataInstancesId;
}
