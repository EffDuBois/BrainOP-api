package com.survey.survey.form;

import com.survey.survey.form.people.People;
import com.survey.survey.form.repository.PeopleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {
    private final PeopleRepo repository;

    @Autowired
    public SurveyService(PeopleRepo repository) {
        this.repository = repository;
    }

    public void addNewPerson(String request) {
    }

    public Iterable<People> getPerson() {
        return repository.findAll();
    }
}
