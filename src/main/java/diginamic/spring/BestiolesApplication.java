package diginamic.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import diginamic.spring.model.entity.Animal;
import diginamic.spring.model.entity.Person;
import diginamic.spring.model.entity.Species;
import diginamic.spring.repository.AnimalRepository;
import diginamic.spring.repository.PersonRepository;
import diginamic.spring.repository.SpeciesRepository;

@SpringBootApplication
public class BestiolesApplication {

    	@Autowired private AnimalRepository animalRepository;
    	@Autowired private PersonRepository personRepository;
    	@Autowired private SpeciesRepository speciesRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(BestiolesApplication.class, args);

	}



}
