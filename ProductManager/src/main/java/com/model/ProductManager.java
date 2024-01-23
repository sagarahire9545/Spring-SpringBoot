package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductManager {

	@Id
	private int pmid;
	private String name;
	private double amount;

	public int getPmid() {
		return pmid;
	}

	public void setPmid(int pmid) {
		this.pmid = pmid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public ProductManager(int pmid, String name, double amount) {
		super();
		this.pmid = pmid;
		this.name = name;
		this.amount = amount;
	}

	public ProductManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductManager [pmid=" + pmid + ", name=" + name + ", amount=" + amount + "]";
	}

}
