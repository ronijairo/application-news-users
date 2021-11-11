package com.nisum.application.users.web.controller;

import com.nisum.application.users.domian.DetailResponse;
import com.nisum.application.users.util.exception.ErrorMessage;
import com.nisum.application.users.util.exception.IncompleteParametersException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String DETAIL = "detailFail";
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IncompleteParametersException.class)
    public ResponseEntity<ErrorMessage> resourceNotFoundException(IncompleteParametersException ex, WebRequest request){
        ErrorMessage message = new ErrorMessage(
        HttpStatus.NOT_FOUND.value(),
        new Date(),
        ex.getMessage(),
        request.getDescription(false));

        return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
    }

}
