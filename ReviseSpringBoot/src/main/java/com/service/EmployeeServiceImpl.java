package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmpoyeeRepository;
import com.exception.EmployeeNotFoundException;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmpoyeeRepository empoyeeRepository;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empoyeeRepository.save(emp);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return empoyeeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empoyeeRepository.findAll();
	}

	@Override
	public String delEmployeeById(int id) {
		// TODO Auto-generated method stub
		empoyeeRepository.deleteById(id);
		return "Deleted one record...." + id;
	}

	@Override
	public Employee updateEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		// Find the existing employee by their ID
		Employee existEmployee = empoyeeRepository.findById(e.getEmpId()).orElse(null);

		// Check if the existing employee was found
		if (existEmployee != null) {
			// Update the employee's name and salary
			existEmployee.setName(e.getName());
			existEmployee.setSalary(e.getSalary());

			// Save the changes to the repository
			return empoyeeRepository.save(existEmployee);
		} else {
			// Handle the case where the employee with the given ID doesn't exist
			// You might throw an exception or return a specific response based on your
			// application's requirements
			throw new EmployeeNotFoundException("Employee with ID " + e.getEmpId() + " not found");
		}
	}

}
