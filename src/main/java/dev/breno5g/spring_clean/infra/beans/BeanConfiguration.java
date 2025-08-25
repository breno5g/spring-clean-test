package dev.breno5g.spring_clean.infra.beans;

import dev.breno5g.spring_clean.core.gateway.EventGateway;
import dev.breno5g.spring_clean.core.usecases.CreateEventImpl;
import dev.breno5g.spring_clean.core.usecases.interfaces.CreateEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEvent createEvent(EventGateway eventGateway) {
        return new CreateEventImpl(eventGateway);
    }
}
