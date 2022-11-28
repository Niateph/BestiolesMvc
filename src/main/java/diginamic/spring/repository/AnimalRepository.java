package diginamic.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import diginamic.spring.model.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
