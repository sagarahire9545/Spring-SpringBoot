package com.springcore;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAdd;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("using setter studentId");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("using setter studentname");
		this.studentName = studentName;
	}

	public String getStudentAdd() {
		return studentAdd;
	}

	public void setStudentAdd(String studentAdd) {
		System.out.println("using setter studentAddress");
		this.studentAdd = studentAdd;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentAdd) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdd = studentAdd;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdd=" + studentAdd + "]";
	}

}
