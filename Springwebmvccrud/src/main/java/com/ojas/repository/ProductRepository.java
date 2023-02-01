package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	
	

}
