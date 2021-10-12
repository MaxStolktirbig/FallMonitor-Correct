package com.example.fallmonitor.common.exception;

public class CaretakerNotFoundException extends RuntimeException {
    public CaretakerNotFoundException() {
        super("Caretaker not found");
    }
}
