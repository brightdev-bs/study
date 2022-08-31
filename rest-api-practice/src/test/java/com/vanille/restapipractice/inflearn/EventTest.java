package com.vanille.restapipractice.inflearn;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {

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
}