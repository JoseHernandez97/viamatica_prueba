package com.viamatica_prueba.Service;

import com.viamatica_prueba.Entity.PersonEntity;
import com.viamatica_prueba.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {


    private final PersonRepository personRepository;
    @Autowired
    public PersonService (PersonRepository personRepository){
        this.personRepository=personRepository;

    }

    public List<PersonEntity> getAllPersons() {
        return personRepository.findAll();
    }

    public PersonEntity getPersonById(Integer id) {
        return personRepository.findById(id).orElse(null);
    }

    public PersonEntity createPerson(PersonEntity person) {
        return personRepository.save(person);
    }

    public PersonEntity updatePerson(Integer id, PersonEntity person) {
        PersonEntity existingPerson = personRepository.findById(id).orElse(null);
        if (existingPerson != null) {
            person.setIdPersona(id);
            return personRepository.save(person);
        }
        return null;
    }

    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }
}

