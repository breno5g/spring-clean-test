package dev.breno5g.spring_clean.core.exceptions;

public class EventIdentifierAlreadyExistsException extends RuntimeException {
    public EventIdentifierAlreadyExistsException(String message) {
        super(message);
    }
}
