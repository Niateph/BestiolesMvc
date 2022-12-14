package diginamic.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diginamic.spring.model.entity.Species;
import diginamic.spring.repository.SpeciesRepository;

@Service
public class SpeciesService {    
    @Autowired SpeciesRepository speciesRepository;
    
    int indexEdited;
    
    public void editClickedWithIndex(int indexClicked){
	System.out.println("indexClicked : "+indexClicked);
	this.indexEdited = indexClicked;
    }
    
    public Optional<Species> find(Integer id) {
	return speciesRepository.findById(id);
    }
    
    public List<Species> findAll(){
	return speciesRepository.findAll();
    }

}
