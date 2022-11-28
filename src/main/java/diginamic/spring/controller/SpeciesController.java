package diginamic.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import diginamic.spring.model.entity.Species;
import diginamic.spring.service.SpeciesService;

@Controller
public class SpeciesController {
    
    @Autowired SpeciesService speciesService;
    
    @GetMapping("/species/{id}")
    public String find(@PathVariable("id") Integer id, Model model) {
	Optional<Species> speciesItem = speciesService.find(id);
	if(speciesItem.isEmpty()) {
	    return "species_not_found";
	}
	model.addAttribute("speciesItem",speciesItem.get());
	return "speciesItem";	
    }
    
    @GetMapping("/species/all")
    public String findAll(Model model) {
	List<Species> speciesList = speciesService.findAll();
	if(speciesList.isEmpty()) {
	    return "species_not_found";
	}
	model.addAttribute("speciesList",speciesList);
	return "speciesList";
    }
}
