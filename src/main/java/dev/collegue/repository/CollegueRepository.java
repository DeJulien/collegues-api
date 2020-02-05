package dev.collegue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.collegue.entite.Collegue;

public interface CollegueRepository extends JpaRepository<Collegue, Integer> {

	List<Collegue> findByMatricule(String matriculeRequete);

}
