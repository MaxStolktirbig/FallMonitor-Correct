package com.example.fallmonitor.monitor.adapter;

import com.example.fallmonitor.monitor.application.RecordedDataInstanceService;
import com.example.fallmonitor.monitor.domain.RecordedDataInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor")
public class RecordedInstanceController {
    @Autowired
    RecordedDataInstanceService recordedDataInstanceService;
    @PostMapping("/recordData")
    public RecordedDataInstance recordData(@RequestParam("walkingSpeed") int walkingSpeed, @RequestParam("patientId") Integer patientId){
        return recordedDataInstanceService.recordData(walkingSpeed, patientId);
    }
}
