package dev.breno5g.spring_clean.core.gateway;

import dev.breno5g.spring_clean.core.entities.Event;

import java.util.List;

public interface EventGateway {
    Event create(Event event);
    List<Event> getAll();
    Event findByIdentifier(String identifier);
    Integer countByIdentifier(String identifier);
}
