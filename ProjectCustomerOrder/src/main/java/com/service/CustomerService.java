package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {

	Customer addCustomer(Customer c);
	List<Customer> addAllCustomer(List<Customer> c);
	
	Customer getCustomerByEmail(String s);

}
