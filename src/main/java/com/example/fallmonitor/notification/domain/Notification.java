package com.example.fallmonitor.notification.domain;

import lombok.Data;
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
    CaretakerId caretakerId;
    ContactInfo contactInfo;
}
