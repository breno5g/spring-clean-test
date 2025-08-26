package dev.breno5g.spring_clean.infra.exceptions;

public class EventIdentifierAlreadyExistsException extends RuntimeException {
    public EventIdentifierAlreadyExistsException(String message) {
        super(message);
    }
}
