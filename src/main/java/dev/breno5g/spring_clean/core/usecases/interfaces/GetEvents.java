package dev.breno5g.spring_clean.core.usecases.interfaces;

import dev.breno5g.spring_clean.core.entities.Event;

import java.util.List;

public interface GetEvents {
    List<Event> execute();
}
