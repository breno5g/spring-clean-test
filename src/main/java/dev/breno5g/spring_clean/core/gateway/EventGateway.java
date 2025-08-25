package dev.breno5g.spring_clean.core.gateway;

import dev.breno5g.spring_clean.core.entities.Event;

public interface EventGateway {
    Event create(Event event);
}
