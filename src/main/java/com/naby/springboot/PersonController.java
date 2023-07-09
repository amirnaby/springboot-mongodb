package com.naby.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/save")
    public List<Person> savePerson(Person person) {
        Car pride = new Car(
                "Pride",
                "White"
        );
        Car samand = new Car(
                "Samand",
                "Black"
        );
        person = new Person(
                "Amir",
                "Naby",
                123456,
                List.of(pride, samand)
        );
        personService.save(person);
        return personService.getAllPersons();
    }

    @GetMapping("/find")
    public List<Person> findAllPersons() {
        return personService.getAllPersons();
    }
}