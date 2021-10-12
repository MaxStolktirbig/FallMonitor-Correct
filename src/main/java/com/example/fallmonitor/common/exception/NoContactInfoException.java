package com.example.fallmonitor.common.exception;

public class NoContactInfoException extends RuntimeException{
    public NoContactInfoException() {
        super("Missing contactinfo!");
    }
}
