package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepository;
import com.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer c) {
		
		return customerRepository.save(c);
	}

	@Override
	public List<Customer> addAllCustomer(List<Customer> c) {
		
		return customerRepository.saveAll(c);
	}

	@Override
	public Customer getCustomerByEmail(String e) {
		// TODO Auto-generated method stub
		return customerRepository.findByEmail(e);
	}
	
	

}
