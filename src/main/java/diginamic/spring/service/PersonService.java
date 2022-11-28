package diginamic.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diginamic.spring.model.entity.Person;
import diginamic.spring.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired PersonRepository personRepository;
    
    public Optional<Person> find(Integer id) {
	return personRepository.findById(id);
    }
    
    public List<Person> findAll(){
	return personRepository.findAll();
    }
}
