package dev.breno5g.spring_clean.infra.presentation.controllers;

import dev.breno5g.spring_clean.core.entities.Event;
import dev.breno5g.spring_clean.core.usecases.interfaces.CreateEvent;
import dev.breno5g.spring_clean.core.usecases.interfaces.GetEvents;
import dev.breno5g.spring_clean.infra.dtos.EventDTO;
import dev.breno5g.spring_clean.infra.mappers.EventMapper;
import lombok.RequiredArgsConstructor;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
@RequiredArgsConstructor
public class EventController {

    private final CreateEvent createEvent;
    private final GetEvents getEvents;

    @PostMapping("/")
    public ResponseEntity<Event> create(@RequestBody EventDTO eventDTO) {
        Event event = this.createEvent.execute(EventMapper.map(eventDTO));
        return new ResponseEntity<>(
                event,
                HttpStatus.CREATED
        );
    }

    @GetMapping("/")
    public ResponseEntity<List<Event>> getAll() {
        List<Event> events = this.getEvents.execute();
        return new ResponseEntity<>(
                events,
                HttpStatus.OK
        );
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolation(ConstraintViolationException ex) {
        return new ResponseEntity<>("Database constraint violation: " + ex.getSQLException().getMessage(), HttpStatus.BAD_REQUEST);
    }
}
