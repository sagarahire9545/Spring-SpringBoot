package com.spring.collecton;

import java.util.List;

public class Employee {
	
	private String empId;
	private String empName;
	private List<String> empAdd;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(List<String> empAdd) {
		this.empAdd = empAdd;
	}
	public Employee(String empId, String empName, List<String> empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}
	
	

}
