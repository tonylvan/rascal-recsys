package com.stayrascal.service.application.dict;

public class DictException extends RuntimeException {

    public DictException(String message) {
        super(message);
    }

    public DictException(String message, Throwable cause) {
        super(message, cause);
    }
}
