package diginamic.spring.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    String commonName;
    String latinName;
    @OneToMany(mappedBy = "species")
    List<Animal> animals;
    public String getCommonName() {
        return commonName;
    }
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }
    public String getLatinName() {
        return latinName;
    }
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    public int getId() {
        return Id;
    }
    public Species() {
	
    }
    
    public Species(String commonName, String latinName, List<Animal> animals) {
	super();
	this.commonName = commonName;
	this.latinName = latinName;
	this.animals = animals;
    }
    
    
}
