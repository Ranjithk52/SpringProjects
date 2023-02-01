package com.ojas.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.entity.ProductEntity;
import com.ojas.model.Product;
import com.ojas.repository.ProductRepository;

public class ProductServices implements ProductDaoServices {
	@Autowired
	private ProductRepository productrepo;

	@Override
	public String addProduct(Product pro) {
		ProductEntity prodent=new ProductEntity();
		BeanUtils.copyProperties(pro, prodent);
		ProductEntity prod=productrepo.save(prodent);
		if(prod!=null) {
			return "Product Successfullyy Created....";
		}else	{	
		return "Try Again....";
		}
	}

	@Override
	public List<Product> viewProducts() {
		List<ProductEntity> prd=productrepo.findAll();
		
		return null;
	}

}
