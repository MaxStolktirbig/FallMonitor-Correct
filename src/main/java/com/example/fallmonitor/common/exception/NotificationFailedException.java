package com.example.fallmonitor.common.exception;

public class NotificationFailedException extends RuntimeException {
    public NotificationFailedException() {
        super("Notification Failed");
    }
}
