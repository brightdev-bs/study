package com.example.restapistudy.events;

import com.example.restapistudy.common.ErrorResource;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.*;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Controller
@Slf4j
@RequestMapping(value = "/api/events", produces = MediaTypes.HAL_JSON_VALUE)
public class EventController {

    private final EventRepository eventRepository;
    private final ModelMapper modelMapper;
    private final EventValidator eventValidator;

    public EventController(EventRepository eventRepository, ModelMapper modelMapper, EventValidator eventValidator) {
        this.eventRepository = eventRepository;
        this.modelMapper = modelMapper;
        this.eventValidator = eventValidator;
    }

    @PostMapping
    public ResponseEntity createEvent(@RequestBody @Valid EventDTO eventDTO, Errors errors) {
        if (errors.hasErrors()) {
            return badRequeest(errors);
        }

        eventValidator.validate(eventDTO, errors);
        if (errors.hasErrors()) {
            return badRequeest(errors);
        }

        Event event = modelMapper.map(eventDTO, Event.class);
        event.update();

        Event newEvent = this.eventRepository.save(event);

        WebMvcLinkBuilder selfLinkBuilder = linkTo(EventController.class).slash(newEvent.getId());

        URI createdUri = selfLinkBuilder.toUri();

        EventResource eventResource = new EventResource(newEvent);
        eventResource.add(linkTo(EventController.class).withRel("query-events"));
        eventResource.add(selfLinkBuilder.withRel("update-event"));
        eventResource.add(Link.of("/docs/index.html#resources-events-created").withRel("profile"));
        return ResponseEntity.created(createdUri).body(eventResource);

    }

    @GetMapping
    public ResponseEntity queryEvents(Pageable pageable, PagedResourcesAssembler assembler) {
        Page<Event> page = this.eventRepository.findAll(pageable);
        PagedModel pagedResources = assembler.toModel(page, entity -> new EventResource((Event) entity));
        pagedResources.add(Link.of("/docs/index.html#resources-events-list").withRel("profile"));

        return ResponseEntity.ok(pagedResources);
    }

    private ResponseEntity<ErrorResource> badRequeest(Errors errors) {
        return ResponseEntity.badRequest().body(new ErrorResource(errors));
    }
}
