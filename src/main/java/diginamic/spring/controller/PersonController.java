package diginamic.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import diginamic.spring.model.entity.Person;
import diginamic.spring.service.PersonService;

@Controller
public class PersonController {
    @Autowired PersonService personService;
    
    @GetMapping("/person/{id}")
    public String find(@PathVariable("id") Integer id, Model model) {
	Optional<Person> personItem = personService.find(id);
	if(personItem.isEmpty()) {
	    return "person_not_found";
	}
	model.addAttribute("personItem",personItem.get());
	return "personItem";	
    }
    
    @GetMapping("/person/all")
    public String findAll(Model model) {
	List<Person> personList = personService.findAll();
	if(personList.isEmpty()) {
	    return "person_not_found";
	}
	model.addAttribute("personList",personList);
	return "personList";
    }
}
