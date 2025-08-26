package dev.breno5g.spring_clean.infra.gateway;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.gateway.EventGateway;
import dev.breno5g.spring_clean.infra.mappers.EventMapper;
import dev.breno5g.spring_clean.infra.persistance.entities.EventEntity;
import dev.breno5g.spring_clean.infra.persistance.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;

    @Override
    public Event create(Event event) {
        EventEntity eventEntity = this.eventRepository.save(EventMapper.map(event));
        return EventMapper.map(eventEntity);
    }

    @Override
    public List<Event> getAll() {
        List<EventEntity> eventEntities = this.eventRepository.findAll();
        return eventEntities.stream().map(EventMapper::map).toList();
    }

    @Override
    public Event findByIdentifier(String identifier) {
        EventEntity event = this.eventRepository.findByIdentifier(identifier);
        return EventMapper.map(event);
    }

    @Override
    public Integer countByIdentifier(String identifier) {
        return this.eventRepository.countByIdentifier(identifier);
    }
}
