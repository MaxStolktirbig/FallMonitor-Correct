package com.example.fallmonitor.notification.adapter;

import com.example.fallmonitor.common.exception.CaretakerNotFoundException;
import com.example.fallmonitor.common.exception.NoContactInfoException;
import com.example.fallmonitor.common.exception.NotificationFailedException;
import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.notification.application.NotificationService;
import com.example.fallmonitor.notification.domain.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    NotificationService notificationService;
    @PostMapping("/notify")
    public Notification notify(@RequestParam("patientId") Integer patientId) throws PatientNotFoundException, CaretakerNotFoundException,
                                                                                        NoContactInfoException, NotificationFailedException {
        return notificationService.notify(patientId);
    }
}