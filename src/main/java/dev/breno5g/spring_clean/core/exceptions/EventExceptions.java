package dev.breno5g.spring_clean.core.exceptions;

public interface EventExceptions {
    String EVENT_IDENTIFIER_ALREADY_EXISTS = "Event identifier already exists";
    EventIdentifierAlreadyExistsException EVENT_IDENTIFIER_ALREADY_EXISTS_EXCEPTION = new EventIdentifierAlreadyExistsException(EVENT_IDENTIFIER_ALREADY_EXISTS);
}
