package com.example.fallmonitor.notification.domain;

import com.example.fallmonitor.common.exception.NoContactInfoException;
import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.notification.adapter.PatientService;
import com.example.fallmonitor.notification.application.CaretakerService;
import com.example.fallmonitor.notification.repository.CaretakerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

import java.util.Date;

@Data
public class Notification {
    @Id
    @Embedded.Nullable
    NotificationId notificationId;
    NotificationSeverity severity;
    NotificationType type;
    Date date;
    ContactInfo contactInfo;


    public static Notification create(int patientId) throws PatientNotFoundException, NoContactInfoException {
        Notification notification = new Notification();
        PatientService patientService = new PatientService();
        ContactInfo patientContactInfo = patientService.getContactInfo(patientId);

        notification.setSeverity(patientService.getPatientSeverityById(patientId));
        notification.setType(patientContactInfo);

        return notification;
    }

    public void setType(ContactInfo contactInfo) throws NoContactInfoException {
        if(!contactInfo.email().isEmpty()){
            this.setType(NotificationType.EMAIL);
        } else if(!(contactInfo.phoneNumber() == 0)){
            this.setType(NotificationType.SMS);
        } else {
            throw new NoContactInfoException();
        }
    }
    public void setType(NotificationType notificationType){
        this.type = notificationType;
    }
}