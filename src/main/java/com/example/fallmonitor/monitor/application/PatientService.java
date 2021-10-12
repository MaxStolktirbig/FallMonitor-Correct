package com.example.fallmonitor.monitor.application;

import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.monitor.domain.Patient;
import com.example.fallmonitor.monitor.domain.PatientSeverity;
import com.example.fallmonitor.monitor.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public PatientSeverity getPatientSeverityByPatientId(int patientId) throws PatientNotFoundException {
      Patient patient = patientRepository.findById(patientId).orElseThrow(PatientNotFoundException::new);
      return patient.getSeverity();
    }
    public int getPhoneNumberByPatientId(int patientId) throws PatientNotFoundException {
        return patientRepository.findPhoneNumberByPatientId(patientId).orElseThrow(PatientNotFoundException::new);
    }
}
