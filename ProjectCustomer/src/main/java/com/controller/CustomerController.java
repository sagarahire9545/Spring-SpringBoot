package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer c) {
		return customerService.addCustomer(c);
	}

	@GetMapping("/getOne/{id}")
	public Customer getOneCustomer(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);

	}

	@DeleteMapping("/deleteOneCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		return customerService.deleteCustomer(id);
	}

	@GetMapping("/getAll")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

}
