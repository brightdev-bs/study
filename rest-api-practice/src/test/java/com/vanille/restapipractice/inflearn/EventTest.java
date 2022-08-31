package com.vanille.restapipractice.inflearn;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Size;

import static org.assertj.core.api.Assertions.*;

public class EventTest {

    EventRepository eventRepository;

    @Test
    public void builder() {
        System.out.println("EventTest.builder");
        Event event = Event.builder()
                .name("Example 1")
                .description("Example Test")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {
        System.out.println("EventTest.javaBean");
        Event event = new Event();
        String name = "Java Bean";
        String description = "Java Bean Test";

        event.setName(name);
        event.setDescription(description);

        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }

    @Test
    public void created() {
        Event event = Event.builder()
                .name("KIM")
                .description("birthday")
                .build();

        Event save = eventRepository.save(event);

    }
}