package com.example.demo.person.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class PersonEntityManager {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void addAPerson(String name, String lastName, Integer age) {

		em.persist(new Person("em hatim", "em lechgar", 33));
	}

}
