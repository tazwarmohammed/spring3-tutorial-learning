package com.tazwar.cruddemo.exception;

public class StudentNotFoundException extends RuntimeException {
    private final int errorCode;
    public StudentNotFoundException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }
}
