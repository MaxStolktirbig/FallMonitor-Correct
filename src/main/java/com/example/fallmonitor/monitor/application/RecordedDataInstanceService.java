package com.example.fallmonitor.monitor.application;

import com.example.fallmonitor.monitor.domain.PatientId;
import com.example.fallmonitor.monitor.domain.RecordedDataInstance;
import com.example.fallmonitor.monitor.domain.RecordedPatientData;
import com.example.fallmonitor.monitor.repository.RecordedDataInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordedDataInstanceService {
    @Autowired
    RecordedDataInstanceRepository recordedDataInstanceRepsitory;
    public RecordedDataInstance recordData(int walkingSpeed, Integer patientId) {
        RecordedDataInstance recordedDataInstance = RecordedDataInstance.create(patientId, walkingSpeed);
        if (recordedDataInstance != null) {
            recordedDataInstance = recordedDataInstanceRepsitory.save(recordedDataInstance);
            return recordedDataInstance;
        }
        return null;
    }

    public RecordedPatientData findRecordedDataByPatientId(Integer patientId){
        return new RecordedPatientData(new PatientId(patientId), recordedDataInstanceRepsitory.findIdsByPatientId(patientId));
    }
}
