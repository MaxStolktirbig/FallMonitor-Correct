package com.example.fallmonitor.notification.application;

import com.example.fallmonitor.common.exception.NoContactInfoException;
import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.notification.domain.Notification;
import com.example.fallmonitor.notification.repository.CaretakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    CaretakerRepository caretakerRepository;
    @Autowired
    CaretakerService caretakerService;

    public Notification notify(Integer patientId) throws PatientNotFoundException, NoContactInfoException {
        Notification notification = Notification.create(patientId);
        publish(notification);
        notification.setContactInfo(caretakerService.getContactInfoByPatientId(patientId));
        notification.setType(notification.getContactInfo());
        publish(notification);
        return notification;
    }

    public void publish(Notification notification){
        //logic to send shit, we aint go not smtp service nor sms service so fuck off
    }
}