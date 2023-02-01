package com.ojas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.ProductEntity;
import com.ojas.model.Product;
import com.ojas.repository.ProductRepository;
@Service
public class ProductService implements ProductServiceDAO {
	@Autowired
	private ProductRepository prorepo;

	@Override
	public String insertRecord(Product product) {
		
		ProductEntity prdent=new ProductEntity();
		BeanUtils.copyProperties(product, prdent);
//		prdent.setPname(product.getPname());
//		prdent.setPrice(product.getPrice());
//		prdent.setQty(product.getQty());
		ProductEntity prd=prorepo.save(prdent);
		if(prd!=null)
		return "Successfully inserted records...";
		else
			return "not Inserted records...";
		
	}

	public List<Product> allProducts(){
		List<Product> prdct=new ArrayList<>();
		List<ProductEntity> prd=prorepo.findAll();
		for(ProductEntity prden:prd) {
			
			Product prdt=new Product();
			BeanUtils.copyProperties(prden, prdt);
			/*
			 * prdt.setPname(prden.getPname()); prdt.setPrice(prden.getPrice());
			 * prdt.setQty(prden.getQty());
			 */
			prdct.add(prdt);
			
		}
	return prdct;	
	
	}
	
	
	
	
}
