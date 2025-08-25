package dev.breno5g.spring_clean.infra.mappers;

import dev.breno5g.spring_clean.infra.dtos.EventDTO;
import dev.breno5g.spring_clean.infra.persistance.entities.Event;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class EventMapper {
    public static Event map(EventDTO eventDTO) {
        return Event.builder()
                .identifier(eventDTO.identifier())
                .name(eventDTO.name())
                .description(eventDTO.description())
                .type(eventDTO.type())
                .capacity(eventDTO.capacity())
                .location(eventDTO.location())
                .initialDate(eventDTO.initialDate())
                .finalDate(eventDTO.finalDate())
                .organizer(eventDTO.organizer())
                .build();
    }
}
