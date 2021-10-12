package com.example.fallmonitor.common.exception;

public class NoContactInfoException extends Exception{
    public NoContactInfoException() {
        super("Missing contactinfo!");
    }
}
