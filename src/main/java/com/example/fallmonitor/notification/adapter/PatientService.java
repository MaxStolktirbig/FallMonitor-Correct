package com.example.fallmonitor.notification.adapter;

import com.example.fallmonitor.common.StringToEnumFactory;
import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.monitor.adapter.PatientController;
import com.example.fallmonitor.notification.domain.ContactInfo;
import com.example.fallmonitor.notification.domain.NotificationSeverity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientController patientController;

    public NotificationSeverity getPatientSeverityById(int patientId) throws PatientNotFoundException {
        return NotificationSeverity.valueOf(NotificationSeverity.class, patientController.getPatientSeverity(patientId));
    }
    public ContactInfo getContactInfo(int patientId){
        return new ContactInfo(patientController.getPatientEmail(patientId), patientController.getPatientPhoneNumber(patientId));
    }
}
