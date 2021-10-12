package com.example.fallmonitor.notification.domain;


import com.fasterxml.jackson.annotation.JsonValue;

import java.util.UUID;

public record NotificationId(String notificationId) {
    public static NotificationId generate(){
        return new NotificationId(UUID.randomUUID().toString());
    }

    @JsonValue
    public String getNotificationId() {
        return notificationId;
    }
}
