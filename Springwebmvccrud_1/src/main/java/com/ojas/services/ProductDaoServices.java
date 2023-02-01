package com.ojas.services;

import java.util.List;

import com.ojas.model.Product;

public interface ProductDaoServices {
    String addProduct(Product pro);
	
	List<Product>viewProducts();

}
