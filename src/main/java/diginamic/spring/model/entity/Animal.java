package diginamic.spring.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import diginamic.spring.enums.Sex;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String color;
    String name;
    @Enumerated(EnumType.STRING)
    Sex sex;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id")
    Species species;
    @ManyToMany(mappedBy = "animals")
    Set<Person> persons;
    
    public Animal() {
	
    }
    
    public Animal(String color, String name, Sex sex, Species species, Set<Person> persons) {
	super();
	this.color = color;
	this.name = name;
	this.sex = sex;
	this.species = species;
	this.persons = persons;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
    public Set<Person> getPersons() {
        return persons;
    }
    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
    public int getId() {
        return id;
    }
}
