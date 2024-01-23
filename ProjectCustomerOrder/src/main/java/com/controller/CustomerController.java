package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer  c) {
		
		return customerService.addCustomer(c);
		
	}
	
	@PostMapping("/addAll")
	public List<Customer> addCustomers(@RequestBody List<Customer> c){
		return customerService.addAllCustomer(c);
	}
	
	@GetMapping("/searchByEmail/{e}")
	public Customer getCustomerByEmail(@PathVariable("e") String e) {
		// TODO Auto-generated method stub
		return customerService.getCustomerByEmail(e);
	}
	
	
}
