package diginamic.spring.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import diginamic.spring.model.entity.Animal;
import diginamic.spring.service.AnimalService;

@Controller
public class AnimalController {
    @Autowired AnimalService animalService;
    
    @GetMapping("/animal/{id}")
    public String find(@PathVariable("id") Integer id, Model model) {
	Optional<Animal> animal = animalService.find(id);
	if(animal.isEmpty()) {
	    return "animal_not_found";
	}
	model.addAttribute(animal.get());
	return "animalItem";	
    }
    
    @GetMapping("/animal/all")
    public String findAll(Model model) {
	List<Animal> animals = animalService.findAll();
	if(animals.isEmpty()) {
	    return "animal_not_found";
	}
	model.addAttribute("animalList",animals);
	return "animalList";
    }

}
