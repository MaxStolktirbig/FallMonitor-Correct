package com.example.fallmonitor.common.exception;

public class NotValidException extends Exception{
    public NotValidException(String classname) {
        super("Invalid data!");
    }
}
