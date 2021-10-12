package com.example.fallmonitor.notification.domain;

import com.example.fallmonitor.common.exception.NoContactInfoException;
import com.example.fallmonitor.common.exception.PatientNotFoundException;
import com.example.fallmonitor.notification.adapter.PatientServiceAdapter;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
public class Notification {
    @Id
    @Embedded.Nullable
    NotificationId notificationId;
    NotificationSeverity severity;
    NotificationType type;
    LocalDate date;
    ContactInfo contactInfo;


    public static Notification create(NotificationSeverity severity, ContactInfo contactInfo) throws PatientNotFoundException, NoContactInfoException {
        Notification notification = new Notification();
        notification.setNotificationId(NotificationId.generate());
        notification.setSeverity(severity);
        notification.setContactInfo(contactInfo);
        notification.setType(contactInfo);
        notification.setDate(LocalDate.now());
        return notification;
    }

    public void setType(ContactInfo contactInfo) throws NoContactInfoException {
        if(contactInfo.email() != null){
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