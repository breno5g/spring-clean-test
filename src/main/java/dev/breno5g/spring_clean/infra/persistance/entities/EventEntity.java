package dev.breno5g.spring_clean.infra.persistance.entities;

import dev.breno5g.spring_clean.core.enums.EventType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "events")
public class EventEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id;

    private String identifier;
    private String name;
    private String description;
    private LocalDateTime initialDate;
    private LocalDateTime finalDate;
    private String location;
    private Integer capacity;
    private EventType type;
    private String organizer;
}
