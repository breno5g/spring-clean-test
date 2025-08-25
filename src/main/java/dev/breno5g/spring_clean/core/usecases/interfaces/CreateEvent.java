package dev.breno5g.spring_clean.core.usecases.interfaces;

import dev.breno5g.spring_clean.core.entities.Event;

public interface CreateEvent {
    public Event execute(Event event);
}
