package dev.breno5g.spring_clean.infra.gateway;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.gateway.EventGateway;
import dev.breno5g.spring_clean.infra.mappers.EventMapper;
import dev.breno5g.spring_clean.infra.persistance.entities.EventEntity;
import dev.breno5g.spring_clean.infra.persistance.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;

    @Override
    public Event create(Event event) {
        EventEntity eventEntity = this.eventRepository.save(EventMapper.map(event));
        return EventMapper.map(eventEntity);
    }
}
