package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Customer;
import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Customer save(Customer c);
	
	Customer findByEmail(String s);

}
