package com.bootcamp.juan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserNotFoundHandler {

    @ExceptionHandler(value = UserNotFound.class)
    public ResponseEntity<Object> handlerException(UserNotFound e){
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        CustomException customException=new CustomException(e.getMessage(), badRequest);
        return new ResponseEntity<>(customException, badRequest);

    }
}
