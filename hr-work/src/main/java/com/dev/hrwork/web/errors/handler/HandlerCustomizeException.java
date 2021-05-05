package com.dev.hrwork.web.errors.handler;

import com.dev.hrwork.web.errors.ExceptionResponse;
import com.dev.hrwork.web.errors.WorkerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HandlerCustomizeException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(WorkerNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handlerBookNotFound(Exception ex) {
        String exceptionResponse = (ex.getMessage());
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }

}
