package com.example.fallmonitor.monitor.adapter;

import com.example.fallmonitor.common.exception.NotValidException;
import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.monitor.application.RecordedDataInstanceService;
import com.example.fallmonitor.monitor.domain.RecordedDataInstance;
import com.example.fallmonitor.monitor.domain.RecordedPatientData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/monitor")
public class RecordedInstanceController {
    @Autowired
    RecordedDataInstanceService recordedDataInstanceService;
    @PostMapping("/recordData")
    public RecordedDataInstance recordData(@RequestParam("walkingSpeed") int walkingSpeed, @RequestParam("patientId") int patientId) throws NotValidException, PatientNotFoundException {
        return recordedDataInstanceService.recordData(walkingSpeed, patientId);
    }
    @GetMapping("/patientData")
    public RecordedPatientData findByPatientId(@RequestParam("patientId") Integer patientId) throws PatientNotFoundException{
        return recordedDataInstanceService.findRecordedDataByPatientId(patientId);
    }
}
