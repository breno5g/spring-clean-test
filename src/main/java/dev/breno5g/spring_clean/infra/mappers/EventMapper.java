package dev.breno5g.spring_clean.infra.mappers;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.infra.dtos.EventDTO;
import dev.breno5g.spring_clean.infra.persistance.entities.EventEntity;
import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class EventMapper {
    public static Event map(EventDTO eventDTO) {
        return new Event(
                UUID.randomUUID(),
                eventDTO.identifier(),
                eventDTO.name(),
                eventDTO.description(),
                eventDTO.initialDate(),
                eventDTO.finalDate(),
                eventDTO.location(),
                eventDTO.capacity(),
                eventDTO.type(),
                eventDTO.organizer()
        );
    }

    public static EventEntity map(Event event) {
        return EventEntity.builder()
                .description(event.description())
                .capacity(event.capacity())
                .finalDate(event.finalDate())
                .initialDate(event.initialDate())
                .location(event.location())
                .name(event.name())
                .organizer(event.organizer())
                .type(event.type())
                .identifier(event.identifier())
                .build();
    }

    public static Event map(EventEntity eventEntity) {
        return new Event(
            eventEntity.getId(),
            eventEntity.getIdentifier(),
            eventEntity.getName(),
            eventEntity.getDescription(),
            eventEntity.getInitialDate(),
            eventEntity.getFinalDate(),
            eventEntity.getLocation(),
            eventEntity.getCapacity(),
            eventEntity.getType(),
            eventEntity.getOrganizer()
        );
    }
}
