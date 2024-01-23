package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.CustomerRepository;
import com.model.Customer;

public interface CustomerService {

	Customer addCustomer(Customer c);
	
	Customer getCustomerById(int id);
	List<Customer>getAllCustomers();
	
	String deleteCustomer(int id);
	
	

}
