package com.survey.survey.form;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.survey.survey.form.people.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/form")
public class SurveyController {

    private final SurveyService service;
    private final ObjectMapper objectMapper;

    @Autowired
    public SurveyController(SurveyService service, ObjectMapper objectMapper) {
        this.service = service;
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public Iterable<People> getPerson(){
        return service.getPerson();
    }

    @PostMapping
    public void addNewPerson(@RequestBody String json) throws JsonProcessingException {
        People people = objectMapper.readValue(json,People.class);

        System.out.println(people);

    }


}
