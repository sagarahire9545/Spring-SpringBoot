package com.ref.inject;

import java.util.Date;

public class Report {

	private String disease;
	private Date reportDate;

	public Report(String disease, Date reportDate) {
		super();
		this.disease = disease;
		this.reportDate = reportDate;
	}

	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	@Override
	public String toString() {
		return "Report [disease=" + disease + ", reportDate=" + reportDate + "]";
	}

}
