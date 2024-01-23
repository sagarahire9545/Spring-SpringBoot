package com.springcore.refobj;

public class Project {

	private int pId;
	private String p_name;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pId, String p_name) {
		super();
		this.pId = pId;
		this.p_name = p_name;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", p_name=" + p_name + "]";
	}

}
