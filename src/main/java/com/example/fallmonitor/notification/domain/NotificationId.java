package com.example.fallmonitor.notification.domain;


import java.util.UUID;

public record NotificationId(String notificationId) {
    public static NotificationId generate(){
        return new NotificationId(UUID.randomUUID().toString());
    }
}
