package com.example.roomservicemangment.advice;

import com.example.roomservicemangment.dto.Api;
import com.example.roomservicemangment.dto.ApiException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAdvice {

    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity apiException(ApiException apiException){
        return ResponseEntity.status(400).body(new Api(apiException.getMessage(),400));
    }
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity exception(Exception exception){
        exception.printStackTrace();
        return ResponseEntity.status(500).body(new Api("Server Error",500));
    }
    @ExceptionHandler(value = DataIntegrityViolationException.class)
    public ResponseEntity dataIntegrityViolation(DataIntegrityViolationException dataIntegrityViolationException){
        String message="This username is already used !";
        return ResponseEntity.status(400).body(new Api(message,400));
    }
}
