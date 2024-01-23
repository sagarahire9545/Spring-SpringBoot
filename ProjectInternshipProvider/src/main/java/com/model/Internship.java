package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Internship {
	
	@Id
	private int id;
	private String company_name;
	private String domain;
	private String duration;
	private String location;
	
	
	@ManyToOne
    @JoinColumn(name = "recruiter_id")
    private Recruiter recruiter;
	
	public Internship() {
		super();
		
	}

	
	public Internship(int id, String company_name, String domain, String duration, String location,
			Recruiter recruiter) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.domain = domain;
		this.duration = duration;
		this.location = location;
		this.recruiter = recruiter;
	}


	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public Recruiter getRecruiter() {
		return recruiter;
	}


	public void setRecruiter(Recruiter recruiter) {
		this.recruiter = recruiter;
	}



}
