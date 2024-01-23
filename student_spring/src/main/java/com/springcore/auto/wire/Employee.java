package com.springcore.auto.wire;

public class Employee {

	private int empId;
	private String name;

	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int empId, String name, Address address) {
		super();
		System.out.println("constructor autowiring...");
		this.address = address;
		this.empId = empId;
		this.name = name;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}

	
}
