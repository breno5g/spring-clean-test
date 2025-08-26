package dev.breno5g.spring_clean.core.usecases;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.gateway.EventGateway;
import dev.breno5g.spring_clean.core.usecases.interfaces.GetEvents;

import java.util.List;

public class GetEventsImpl implements GetEvents {

    private final EventGateway eventGateway;

    public GetEventsImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute() {
        return eventGateway.getAll();
    }
}
