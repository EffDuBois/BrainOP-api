package com.survey.survey.form.repository;

import com.survey.survey.form.people.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepo extends CrudRepository<People, Long> {

}
