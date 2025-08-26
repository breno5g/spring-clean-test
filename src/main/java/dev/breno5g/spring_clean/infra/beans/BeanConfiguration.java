package dev.breno5g.spring_clean.infra.beans;

import dev.breno5g.spring_clean.core.gateway.EventGateway;
import dev.breno5g.spring_clean.core.usecases.CreateEventImpl;
import dev.breno5g.spring_clean.core.usecases.GetEventsImpl;
import dev.breno5g.spring_clean.core.usecases.interfaces.CreateEvent;
import dev.breno5g.spring_clean.core.usecases.interfaces.GetEvents;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEvent createEvent(EventGateway eventGateway) {
        return new CreateEventImpl(eventGateway);
    }

    @Bean
    public GetEvents getEvents(EventGateway eventGateway) {
        return new GetEventsImpl(eventGateway);
    }
}
