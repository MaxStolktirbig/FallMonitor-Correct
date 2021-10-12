package com.example.fallmonitor.notification.application;

import com.example.fallmonitor.common.exception.CaretakerNotFoundException;
import com.example.fallmonitor.common.exception.NoContactInfoException;
import com.example.fallmonitor.common.exception.NotificationFailedException;
import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.notification.adapter.PatientServiceAdapter;
import com.example.fallmonitor.notification.domain.ContactInfo;
import com.example.fallmonitor.notification.domain.Notification;
import com.example.fallmonitor.notification.domain.NotificationSeverity;
import com.example.fallmonitor.notification.repository.CaretakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    CaretakerRepository caretakerRepository;
    @Autowired
    CaretakerService caretakerService;
    @Autowired
    PatientServiceAdapter patientServiceAdapter;

    public Notification notify(Integer patientId) throws PatientNotFoundException, CaretakerNotFoundException,
                                                            NoContactInfoException, NotificationFailedException {
        notifyPatient(patientId);
        return notifyCaretaker(patientId);
    }

    public Notification notifyPatient(Integer patientId) throws PatientNotFoundException, NoContactInfoException, NotificationFailedException{

            ContactInfo patientContactInfo = patientServiceAdapter.getContactInfo(patientId);
            NotificationSeverity notificationSeverity = patientServiceAdapter.getPatientSeverityById(patientId);
            Notification notification = Notification.create(notificationSeverity, patientContactInfo);
        try {
            publish(notification);
            return notification;
        } catch (NotificationFailedException nfe){
            //do shit with it, maybe put in on a queue or something
            throw nfe;
        }
    }
    public Notification notifyCaretaker(Integer patientId) throws PatientNotFoundException, CaretakerNotFoundException,
                                                                    NoContactInfoException, NotificationFailedException{

            ContactInfo caretakerContactInfo = caretakerService.getContactInfoByPatientId(patientId);
            NotificationSeverity notificationSeverity = patientServiceAdapter.getPatientSeverityById(patientId);
            Notification notification = Notification.create(notificationSeverity, caretakerContactInfo);
        try {
            publish(notification);
            return notification;
        }catch (NotificationFailedException nfe){
            //do shit with it, maybe put in on a queue or something
            throw nfe;
        }
    }
    public void publish(Notification notification) throws NotificationFailedException {
        //logic to send shit, we aint go no smtp service nor sms service so fuck off
    }
}