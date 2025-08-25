package dev.breno5g.spring_clean.core.entities;

import dev.breno5g.spring_clean.core.enums.EventType;

import java.time.LocalDateTime;
import java.util.UUID;

public record Event(
        UUID id,
        String identifier,
        String name,
        String description,
        LocalDateTime initialDate,
        LocalDateTime finalDate,
        String location,
        Integer capacity,
        EventType type,
        String organizer
) {
}
