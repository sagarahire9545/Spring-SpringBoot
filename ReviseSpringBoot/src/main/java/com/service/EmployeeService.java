package com.service;

import java.util.List;

import com.exception.EmployeeNotFoundException;
import com.model.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee emp);
	Employee getEmployeeById(int id);
	
	//get all records from database
	List<Employee> getAllEmployee();
	
	String delEmployeeById(int id);
	
	Employee updateEmployee(Employee e) throws EmployeeNotFoundException;

}
