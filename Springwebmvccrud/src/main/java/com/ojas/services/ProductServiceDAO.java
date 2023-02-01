package com.ojas.services;

import java.util.List;

import com.ojas.entity.ProductEntity;
import com.ojas.model.Product;

public interface ProductServiceDAO {
	
	public String insertRecord(Product product) ;
	public List<Product> allProducts();

}
