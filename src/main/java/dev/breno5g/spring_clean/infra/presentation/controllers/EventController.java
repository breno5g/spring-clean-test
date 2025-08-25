package dev.breno5g.spring_clean.infra.presentation.controllers;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.usecases.interfaces.CreateEvent;
import dev.breno5g.spring_clean.infra.dtos.EventDTO;
import dev.breno5g.spring_clean.infra.mappers.EventMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/events")
@RequiredArgsConstructor
public class EventController {

    private final CreateEvent createEvent;

    @PostMapping("/")
    public ResponseEntity<Event> create(@RequestBody EventDTO eventDTO) {
        Event event = this.createEvent.execute(EventMapper.map(eventDTO));
        return new ResponseEntity<>(
                event,
                HttpStatus.CREATED
        );
    }
}
