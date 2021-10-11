package com.example.fallmonitor.monitor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class RecordedPatientData {

    @Id
    private PatientId patientId;
    private List<RecordedDataInstanceId> recordedDataInstancesIds;

    public RecordedPatientData(PatientId patientId, List<RecordedDataInstanceId> recordedDataInstancesIds) {
        this.patientId = patientId;
        this.recordedDataInstancesIds = recordedDataInstancesIds;
    }

    public void register(RecordedDataInstance recordedDataInstance){
        recordedDataInstancesIds.add(recordedDataInstance.getRecordedDataInstanceId());
    }
}
