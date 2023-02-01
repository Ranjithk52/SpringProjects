package com.ojas.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springboot.model.Product;
import com.ojas.springboot.model.User;
import com.ojas.springboot.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public String createProduct(Product product) {
		
		Product p=repo.save(product);
		if(p!=null) {
			return "Product created successfully....";
		}else {
		return "Product not Created...";
		}
	}
	
	public List<Product> getAllProducts(){
		return repo.findAll();
		
		
	}
	public Optional<Product> getProductbyId(int id) {
		return repo.findById(id);
	}
	
	public Product updateProduct(Product product) {
		return repo.saveAndFlush(product);
		
	}
	
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}
	
	
}
