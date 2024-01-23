package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.services.EmployeeInterface;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeInterface empService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee e) {
		// TODO Auto-generated method stub
		
		return empService.addEmployee(e);
	}
}
