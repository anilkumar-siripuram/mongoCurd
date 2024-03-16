package com.example.mongoExample.repository;

import com.example.mongoExample.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository < Product, Long >{

}
