package com.example.fallmonitor.monitor.application;

import com.example.fallmonitor.common.exception.NotValidException;
import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.monitor.domain.Patient;
import com.example.fallmonitor.monitor.domain.PatientId;
import com.example.fallmonitor.monitor.domain.RecordedDataInstance;
import com.example.fallmonitor.monitor.domain.RecordedPatientData;
import com.example.fallmonitor.monitor.repository.PatientRepository;
import com.example.fallmonitor.monitor.repository.RecordedDataInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordedDataInstanceService {
    @Autowired
    RecordedDataInstanceRepository recordedDataInstanceRepsitory;
    @Autowired
    PatientRepository patientRepository;

    public RecordedDataInstance recordData(int walkingSpeed, Integer patientId) throws PatientNotFoundException, NotValidException {
        //check if patient exists, create validates data
        patientRepository.findById(patientId).orElseThrow(PatientNotFoundException::new);
        RecordedDataInstance recordedDataInstance = RecordedDataInstance.create(patientId, walkingSpeed);
        recordedDataInstance = recordedDataInstanceRepsitory.save(recordedDataInstance);
        return recordedDataInstance;

    }

    public RecordedPatientData findRecordedDataByPatientId(Integer patientId) throws PatientNotFoundException{
        patientRepository.findById(patientId).orElseThrow(PatientNotFoundException::new);
        List<RecordedDataInstance> recordedDataInstances = recordedDataInstanceRepsitory.findAllByPatientId(patientId);
        return RecordedPatientData.create(new PatientId(patientId), recordedDataInstances);
    }
}
