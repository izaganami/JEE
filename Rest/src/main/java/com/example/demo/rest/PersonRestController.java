package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.person.service.PersonEntityManager;
import com.example.demo.person.service.PersonEntityManagerFromFactory;
import com.example.demo.person.service.PersonJdbcTemplate;

@RestController
@RequestMapping("/rest/person")
public class PersonRestController {

	@Autowired
	private PersonJdbcTemplate persondbcService;

	@Autowired
	private PersonEntityManagerFromFactory personEntityFromFactoryService;

	@Autowired
	private PersonEntityManager personEntityService;

	@RequestMapping(value = "/create/jdbc", method = RequestMethod.GET)
	public String oihsgfdjoisgfdjoi() {
		persondbcService.addAPerson("hatim", "lechgar", 33);
		return "Hatim Created with jdbc template";
	}

	@RequestMapping(value = "/create/em/verbose", method = RequestMethod.GET)
	public String createPerson3() throws Exception {
		personEntityFromFactoryService.addAPersonVerbose("hatim", "lechgar", 33);
		return "Hatim Created with EntityManager verbose";
	}

	@RequestMapping(value = "/create/em", method = RequestMethod.GET)
	public String createPerson2() {
		personEntityService.addAPerson("hatim", "lechgar", 33);
		return "Hatim Created with EntityManager";
	}

}