package com.bean.autowire.configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	@Autowired
	Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	public void display() {
		
		System.out.println("This is employee class");
		address.show();
	}

}