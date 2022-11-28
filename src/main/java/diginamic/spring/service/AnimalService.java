package diginamic.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diginamic.spring.model.entity.Animal;
import diginamic.spring.repository.AnimalRepository;

@Service
public class AnimalService {
    @Autowired AnimalRepository animalRepository;
    
    public Optional<Animal> find(Integer id) {
	return animalRepository.findById(id);
    }
    
    public List<Animal> findAll(){
	return animalRepository.findAll();
    }
}
