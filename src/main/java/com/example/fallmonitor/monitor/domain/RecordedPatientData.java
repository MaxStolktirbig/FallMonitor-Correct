package com.example.fallmonitor.monitor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class RecordedPatientData {

    @Id
    private PatientId patientId;
    private List<RecordedDataInstance> recordedDataInstances;

    public RecordedPatientData(PatientId patientId, List<RecordedDataInstance> recordedDataInstances) {
        this.patientId = patientId;
        this.recordedDataInstances = recordedDataInstances;
    }
    public static RecordedPatientData create(PatientId patientId, List<RecordedDataInstance> recordedDataInstances){
        return new RecordedPatientData(patientId, recordedDataInstances);
    }
}
