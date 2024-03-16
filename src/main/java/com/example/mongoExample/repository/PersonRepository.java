package com.example.mongoExample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongoExample.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>{

}
