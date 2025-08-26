package dev.breno5g.spring_clean.core.usecases;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.gateway.EventGateway;
import dev.breno5g.spring_clean.core.usecases.interfaces.CreateEvent;
import dev.breno5g.spring_clean.core.exceptions.EventExceptions;

public class CreateEventImpl implements CreateEvent {

    private final EventGateway eventGateway;

    public CreateEventImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        if (this.eventGateway.countByIdentifier(event.identifier()) > 0) throw EventExceptions.EVENT_IDENTIFIER_ALREADY_EXISTS_EXCEPTION;
        return this.eventGateway.create(event);
    }
}
