package com.dev.hrwork.web.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WorkerNotFoundException extends RuntimeException{

    public WorkerNotFoundException(String mensagem){
        super(mensagem);
    }

}
