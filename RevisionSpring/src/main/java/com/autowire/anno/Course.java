package com.autowire.anno;

public class Course {

	private int cId;
	private String cName;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + "]";
	}

}
