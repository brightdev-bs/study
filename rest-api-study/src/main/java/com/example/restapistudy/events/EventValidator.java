package com.example.restapistudy.events;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDateTime;

@Component
public class EventValidator {

    public void validate(EventDto eventDTO, Errors errors) {
        if(eventDTO.getBasePrice() > eventDTO.getMaxPrice() && eventDTO.getMaxPrice() != 0) {
            errors.rejectValue("basePrice", "wrongValue", "basePrice is wrong");
            errors.rejectValue("maxPrice", "wrongValue", "maxPrice is wrong");
        }

        LocalDateTime endEventDateTime = eventDTO.getEndEventDateTime();
        if(endEventDateTime.isBefore(eventDTO.getBeginEventDateTime()) ||
                endEventDateTime.isBefore(eventDTO.getBeginEventDateTime()) ||
                endEventDateTime.isBefore(eventDTO.getBeginEnrollmentDateTime())) {
            errors.rejectValue("endEventDateTime", "wrongValue", "endDateTime value is wrong");
        }

    }
}
