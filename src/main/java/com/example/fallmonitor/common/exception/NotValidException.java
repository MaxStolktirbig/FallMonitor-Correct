package com.example.fallmonitor.common.exception;

public class NotValidException extends RuntimeException{
    public NotValidException(String classname) {
        super("Invalid data!");
    }
}
