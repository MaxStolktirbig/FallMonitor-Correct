package com.example.fallmonitor.monitor.adapter;

import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.monitor.application.PatientService;
import com.example.fallmonitor.monitor.domain.PatientSeverity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monitor/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @GetMapping("patientseverity")
    public String getPatientSeverity(@RequestParam("patientId") int patientId)  {
        return patientService.getPatientSeverityByPatientId(patientId).name();
    }
    public int getPatientPhoneNumber(int patientId) {
        return patientService.getPhoneNumberByPatientId(patientId);
    }
}
