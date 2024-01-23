package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.ProductManager;
import com.service.ProductManService;

@RestController
public class ProductController {

	@Autowired
	ProductManService manService;
	
	@PostMapping("/save")
	public ProductManager saveProductManager(@RequestBody ProductManager pm) {
		return manService.addManager(pm);
	}
	
}
