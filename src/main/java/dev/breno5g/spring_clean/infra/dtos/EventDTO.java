package dev.breno5g.spring_clean.infra.dtos;

import dev.breno5g.spring_clean.core.enums.EventType;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;


public record EventDTO(
    @NotEmpty(message = "Identifier is mandatory")
    String identifier,
    @NotEmpty(message = "Name is mandatory")
    String name,
    @NotEmpty(message = "Description is mandatory")
    String description,
    @NotEmpty(message = "Initial date is mandatory")
    LocalDateTime initialDate,
    @NotEmpty(message = "Final date is mandatory")
    LocalDateTime finalDate,
    @NotEmpty(message = "Location is mandatory")
    String location,
    @NotEmpty(message = "Capacity is mandatory")
    Integer capacity,
    @NotEmpty(message = "Organizer is mandatory")
    String organizer,
    @NotEmpty(message = "Type is mandatory")
    EventType type
) {
}
