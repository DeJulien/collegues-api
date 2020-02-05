package dev.collegue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.collegue.entite.Collegue;
import dev.collegue.repository.CollegueRepository;

@Service
public class CollegueService {

	private CollegueRepository collegueRepository;

	public CollegueService(CollegueRepository collegueRepository) {
		super();
		this.collegueRepository = collegueRepository;
	}

	public List<Collegue> findByMatricule(String matriculeRequete) {
		return this.collegueRepository.findByMatricule(matriculeRequete);
	}

}
