package com.example.fallmonitor.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
public class ResolvedExceptionBody {
    private final String timestamp;
    private final String message;
    private final HttpStatus status;

    public ResolvedExceptionBody(String message, HttpStatus status) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.timestamp = simpleDateFormat.format(new Date());
        this.message = message;
        this.status = status;
    }
}
