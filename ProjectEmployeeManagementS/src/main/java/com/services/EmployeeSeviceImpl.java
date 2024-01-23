package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.model.Employee;

@Service
public class EmployeeSeviceImpl implements EmployeeInterface {

	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		return empRepository.save(e);
	}
	

}
