package com.taskmanager.taskmanager.handler;

import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class RestExceptionHandler {
    //BadRequestExceptionDetails

    @ExceptionHandler (BadRequestException.class)
    public ResponseEntity<BadRequestException> BadRequestException(BadRequestException bre){
        return new ResponseEntity<>(
                RestExceptionHandler.
        )
    }
}
