package com.stayrascal.service.application.component;

public class ComponentAlreadyExistsException extends ComponentException {
    public ComponentAlreadyExistsException(String message) {
        super(message);
    }

    public ComponentAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
