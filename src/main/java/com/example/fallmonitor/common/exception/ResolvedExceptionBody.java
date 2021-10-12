package com.example.fallmonitor.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.net.http.HttpResponse;
import java.time.LocalDate;
@Getter
public class ResolvedExceptionBody {
    private final String timestamp;
    private final String message;
    private final HttpStatus status;

    public ResolvedExceptionBody(String timestamp, String message, HttpStatus status) {
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
    }
}
