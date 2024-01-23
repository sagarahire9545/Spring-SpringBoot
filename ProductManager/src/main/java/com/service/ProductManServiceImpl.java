package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductRepository;
import com.model.ProductManager;

@Service
public class ProductManServiceImpl implements ProductManService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public ProductManager addManager(ProductManager pm) {
		return productRepository.save(pm);
	}

}
