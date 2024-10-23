package com.tazwar.cruddemo.controller;

import com.tazwar.cruddemo.exception.StudentErrorResponse;
import com.tazwar.cruddemo.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalRestExceptionController {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleStudentIdException(StudentNotFoundException e) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(e.getErrorCode());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatusCode.valueOf(e.getErrorCode()));
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleNumberFormatException(NumberFormatException e) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage("Can not parse input string value to Integer.Student ID should be an Integer ONLY!!!");
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception e) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
