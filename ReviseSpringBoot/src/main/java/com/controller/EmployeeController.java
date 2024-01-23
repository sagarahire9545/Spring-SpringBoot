package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.EmployeeNotFoundException;
import com.model.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return employeeService.addEmployee(emp);

	}
	
	@GetMapping("/getById/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployee();
	}

	@DeleteMapping("/delById/{id}")
	public String deleteEmployeeById(@PathVariable("id") int id) {
		return employeeService.delEmployeeById(id);
	}
	
	@PutMapping("/update")
	public Employee updatEmployee(@RequestBody Employee e) throws EmployeeNotFoundException {
		return employeeService.updateEmployee(e);
	}

}
