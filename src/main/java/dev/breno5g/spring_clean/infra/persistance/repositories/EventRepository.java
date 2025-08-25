package dev.breno5g.spring_clean.infra.persistance.repositories;

import dev.breno5g.spring_clean.infra.persistance.entities.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<EventEntity, UUID> {
}
