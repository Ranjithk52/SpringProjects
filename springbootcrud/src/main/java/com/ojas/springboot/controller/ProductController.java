package com.ojas.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.springboot.model.Product;
import com.ojas.springboot.model.User;
import com.ojas.springboot.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService service;
	
@PostMapping("/create")
public String createProduct(@RequestBody Product product) {
	return service.createProduct(product);
		
	}
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
		
		
	}
	@GetMapping("/viewbyid/{id}")
	public Optional<Product> getProductbyId(@PathVariable int id) {
		return service.getProductbyId(id);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		System.out.println(product);
		return service.updateProduct(product);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		service.deleteProduct(id);
	}
	
	
	

}
