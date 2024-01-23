package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.ProductManager;

public interface ProductRepository extends JpaRepository<ProductManager, Integer>{

	ProductManager save(ProductManager pm);
}
