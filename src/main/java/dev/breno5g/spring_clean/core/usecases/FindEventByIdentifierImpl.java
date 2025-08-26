package dev.breno5g.spring_clean.core.usecases;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.gateway.EventGateway;
import dev.breno5g.spring_clean.core.usecases.interfaces.FindEventByIdentifier;

public class FindEventByIdentifierImpl implements FindEventByIdentifier {

    private final EventGateway eventGateway;

    public FindEventByIdentifierImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(String identifier) {
        return this.eventGateway.findByIdentifier(identifier);
    }
}
