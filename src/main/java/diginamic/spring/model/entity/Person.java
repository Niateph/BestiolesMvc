package diginamic.spring.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int age;
    String firstname;
    String lastname;
    @ManyToMany
    @JoinTable(
	    name = "person_animals",
	    joinColumns = @JoinColumn(name="person_id"),
	    inverseJoinColumns = @JoinColumn(name="animals_id"))
    Set<Animal> animals;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Set<Animal> getAnimals() {
        return animals;
    }
    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
    public int getId() {
        return id;
    }
    public Person() {
	
    }
    public Person(int age, String firstname, String lastname, Set<Animal> animals) {
	super();
	this.age = age;
	this.firstname = firstname;
	this.lastname = lastname;
	this.animals = animals;
    }
    
    
}
