package dev.breno5g.spring_clean.infra.mappers;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.infra.dtos.EventDTO;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
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
}
