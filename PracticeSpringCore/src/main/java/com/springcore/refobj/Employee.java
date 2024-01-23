package com.springcore.refobj;

import java.util.List;

public class Employee {

	private int empId;
	private String name;

	//injection object of project class
	private Project po;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, Project po) {
		super();
		this.empId = empId;
		this.name = name;
		this.po = po;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getPo() {
		return po;
	}

	public void setPo(Project po) {
		this.po = po;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", po=" + po + "]";
	}

}
