package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Employee;

//creating interface
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
