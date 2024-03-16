package com.example.mongoExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoExample.model.Person;
import com.example.mongoExample.repository.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepository personRepository;
	
	//https://examplefile.com/code/json/20-mb-json download 20mb json file here
	
	@PostMapping("/persons")
	public List<Person> addPersons(@RequestBody List<Person> person) {		
		return personRepository.saveAll(person);		
	}

}
