package diginamic.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import diginamic.spring.model.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
