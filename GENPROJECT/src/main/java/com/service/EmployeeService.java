package com.service;

import org.springframework.stereotype.Service;

import com.model.Employee;


public interface EmployeeService {
	
	//add employee
	Employee addEmployee(Employee e);
	
	Employee getEmployee(int id);
	
	String delEmployee(int id);
	

}
