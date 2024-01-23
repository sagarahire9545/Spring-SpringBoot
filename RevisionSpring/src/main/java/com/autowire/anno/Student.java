package com.autowire.anno;

import org.springframework.beans.factory.annotation.Autowired;

import com.autowire.Address;

public class Student {

	private int sId;
	private String name;

	@Autowired
	private Address address;

	@Autowired
	private Course course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String name, Address address, Course course) {
		super();
		this.sId = sId;
		this.name = name;
		this.address = address;
		this.course = course;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", address=" + address + ", course=" + course + "]";
	}

}
