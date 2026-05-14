package com.taskmanager.taskmanager.handler;

import academy.devdojo.springboot.exception.BadRequestExeption;
import com.taskmanager.taskmanager.exception.BadRequestExceptionDetails;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

public class RestExceptionHandler {
    @ExceptionHandler(BadRequestExeption.class) //{1}
    public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestExeption(BadRequestExeption bre){ //{2}
        return new ResponseEntity<>(
                BadRequestExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception, Check the documentation")
                        .details(bre.getMessage())
                        .developerMessage(bre.getClass().getName())
                        .build(), HttpStatus.BAD_REQUEST
        );
    }
}
