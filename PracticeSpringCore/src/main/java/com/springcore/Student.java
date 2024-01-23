package com.springcore;

public class Student {

	private int s_rno;
	private String name;
	private String college_name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int s_rno, String name, String college_name) {
		super();
		this.s_rno = s_rno;
		this.name = name;
		this.college_name = college_name;
	}

	public int getS_rno() {
		return s_rno;
	}

	public void setS_rno(int s_rno) {
		this.s_rno = s_rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	@Override
	public String toString() {
		return "Student [s_rno=" + s_rno + ", name=" + name + ", college_name=" + college_name + "]";
	}

}
