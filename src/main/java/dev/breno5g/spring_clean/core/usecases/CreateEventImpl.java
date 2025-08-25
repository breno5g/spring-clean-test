package dev.breno5g.spring_clean.core.usecases;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.usecases.interfaces.CreateEvent;
import org.springframework.stereotype.Service;

@Service
public class CreateEventImpl implements CreateEvent {

    @Override
    public Event execute(Event event) {
        return null;
    }
}
