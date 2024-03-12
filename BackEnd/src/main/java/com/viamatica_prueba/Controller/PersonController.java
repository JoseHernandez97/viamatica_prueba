package com.viamatica_prueba.Controller;

import com.viamatica_prueba.Entity.PersonEntity;
import com.viamatica_prueba.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonController {


    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService){
        this.personService=personService;
    }

    @GetMapping
    public List<PersonEntity> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public PersonEntity getPersonById(@PathVariable Integer id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public PersonEntity createPerson(@RequestBody PersonEntity person) {
        return personService.createPerson(person);
    }

    @PutMapping("/{id}")
    public PersonEntity updatePerson(@PathVariable Integer id, @RequestBody PersonEntity person) {
        return personService.updatePerson(id, person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Integer id) {
        personService.deletePerson(id);
    }
}

