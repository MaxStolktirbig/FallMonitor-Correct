package com.example.fallmonitor.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.Date;

@ControllerAdvice
public class RestExceptionResolver extends ResponseEntityExceptionHandler{
    @ExceptionHandler( PatientNotFoundException.class)
    protected ResponseEntity<ResolvedExceptionBody> handleConflict(
            PatientNotFoundException ex
    ){
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResolvedExceptionBody resolvedExceptionBody = new ResolvedExceptionBody(
                ex.getMessage(), status
        );
            return new ResponseEntity<>(resolvedExceptionBody, HttpStatus.CONFLICT);
    }
    @ExceptionHandler( CaretakerNotFoundException.class)
    protected ResponseEntity<ResolvedExceptionBody> handleConflict(
            CaretakerNotFoundException ex
    ){
        HttpStatus status = HttpStatus.NOT_FOUND;
        ResolvedExceptionBody resolvedExceptionBody = new ResolvedExceptionBody(
                 ex.getMessage(), status
        );
        return new ResponseEntity<>(resolvedExceptionBody, HttpStatus.CONFLICT);
    }
    @ExceptionHandler( NoContactInfoException.class)
    protected ResponseEntity<ResolvedExceptionBody> handleConflict(
            NoContactInfoException ex
    ){

        HttpStatus status = HttpStatus.NOT_FOUND;
        ResolvedExceptionBody resolvedExceptionBody = new ResolvedExceptionBody(
                ex.getMessage(), status
        );
        return new ResponseEntity<>(resolvedExceptionBody, HttpStatus.CONFLICT);
    }

    @ExceptionHandler( NotificationFailedException.class)
    protected ResponseEntity<ResolvedExceptionBody> handleConflict(
            NotificationFailedException ex
    ){
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        ResolvedExceptionBody resolvedExceptionBody = new ResolvedExceptionBody(
                ex.getMessage(), status
        );
        return new ResponseEntity<>(resolvedExceptionBody, HttpStatus.CONFLICT);
    }

    @ExceptionHandler( NotValidException.class)
    protected ResponseEntity<ResolvedExceptionBody> handleConflict(
            NotValidException ex
    ){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ResolvedExceptionBody resolvedExceptionBody = new ResolvedExceptionBody(
                ex.getMessage(), status
        );
        return new ResponseEntity<>(resolvedExceptionBody, HttpStatus.CONFLICT);
    }
}
