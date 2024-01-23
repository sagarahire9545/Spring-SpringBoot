package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Recruiter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Recruiter_Name")
	private String recName;
	private String email;
	private String company;
	
	@OneToMany(mappedBy = "recruiter", cascade = CascadeType.ALL)
    private List<Interns> interns;

    @OneToMany(mappedBy = "recruiter", cascade = CascadeType.ALL)
    private List<Internship> internships;

	public Recruiter() {
	}

	public Recruiter(Long id, String firstName, String lastName, String email, String company) {
		this.id = id;
		this.recName = lastName;
		this.email = email;
		this.company = company;
	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
