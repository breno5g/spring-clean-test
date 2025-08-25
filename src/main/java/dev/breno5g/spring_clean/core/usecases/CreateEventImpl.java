package dev.breno5g.spring_clean.core.usecases;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.gateway.EventGateway;
import dev.breno5g.spring_clean.core.usecases.interfaces.CreateEvent;

public class CreateEventImpl implements CreateEvent {

    private final EventGateway eventGateway;

    public CreateEventImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        return this.eventGateway.create(event);
    }
}
