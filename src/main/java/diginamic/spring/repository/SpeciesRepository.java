package diginamic.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import diginamic.spring.model.entity.Species;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {

}
