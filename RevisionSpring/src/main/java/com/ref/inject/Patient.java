package com.ref.inject;

public class Patient {

	private int pId;
	private String name;

	private Report report;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int pId, String name, Report report) {
		super();
		this.pId = pId;
		this.name = name;
		this.report = report;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", name=" + name + ",reprot="+report+"]";
	}

}
