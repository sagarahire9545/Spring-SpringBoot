package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public String delEmployee(int id) {
		// TODO Auto-generated method stub

		employeeRepository.deleteById(id);
		return "Employe deleted.." + id;
	}

}
