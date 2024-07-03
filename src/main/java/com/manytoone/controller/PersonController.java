package com.manytoone.controller;

import com.manytoone.entity.Person;
import com.manytoone.entity.ProfessionalExperience;
import com.manytoone.repository.PersonRepository;
import com.manytoone.repository.ProfessionalExperienceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.List.of;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonRepository personRepository;
    private ProfessionalExperienceRepository experienceRepository;

    public PersonController(PersonRepository personRepository, ProfessionalExperienceRepository experienceRepository) {
        this.personRepository = personRepository;
        this.experienceRepository = experienceRepository;
    }

    @PostMapping("/new")
    public ResponseEntity<String> newPerson() {
        try {

            var person = new Person();
            person.setName("Conrado");
            person = personRepository.save(person);
            person.setExperiences(of(newExperience("First Employer", person), newExperience("Next Employer", person)));
            return ResponseEntity.ok("Ok!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private ProfessionalExperience newExperience(String name, Person person) {
        var experience = new ProfessionalExperience();
        experience.setEmployer(name);
        experience.setPerson(person);
        return experienceRepository.save(experience);
    }

}
