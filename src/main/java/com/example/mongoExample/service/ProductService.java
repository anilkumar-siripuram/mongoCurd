package com.example.mongoExample.service;

import java.util.List;

import com.example.mongoExample.model.Product;

public interface ProductService {

	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
	
	public List<Product> saveProducts(List<Product> products);

}
