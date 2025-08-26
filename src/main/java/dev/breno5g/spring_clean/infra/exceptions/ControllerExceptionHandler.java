package dev.breno5g.spring_clean.infra.exceptions;

import dev.breno5g.spring_clean.core.exceptions.EventIdentifierAlreadyExistsException;
import dev.breno5g.spring_clean.core.exceptions.EventNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(EventIdentifierAlreadyExistsException.class)
    public ResponseEntity<Map<String, String>> handleEventIdentifierAlreadyExistsException(EventIdentifierAlreadyExistsException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("message", exception.getMessage());
        return new ResponseEntity<>( response, HttpStatus.CONFLICT );
    }

    @ExceptionHandler(EventNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleEventNotFoundException(EventNotFoundException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("message", exception.getMessage());
        return new ResponseEntity<>( response, HttpStatus.NOT_FOUND );
    }
}
