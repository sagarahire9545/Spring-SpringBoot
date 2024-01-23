package com.constrcor_injection;

public class Codder {

	private int cId;
	private String name;
	private String add;

	public Codder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Codder(int cId, String name, String add) {
		super();
		this.cId = cId;
		this.name = name;
		this.add = add;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Codder [cId=" + cId + ", name=" + name + ", add=" + add + "]";
	}

}
