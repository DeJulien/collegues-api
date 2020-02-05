package dev.collegue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.collegue.service.CollegueService;

@RestController
@RequestMapping("collegue")
public class CollegueCtrl {

	private CollegueService collegueService;

	public CollegueCtrl(CollegueService collegueService) {
		super();
		this.collegueService = collegueService;
	}

}
