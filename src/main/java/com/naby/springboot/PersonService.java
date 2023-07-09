package com.naby.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void save(Person person) {
        personRepository.insert(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}