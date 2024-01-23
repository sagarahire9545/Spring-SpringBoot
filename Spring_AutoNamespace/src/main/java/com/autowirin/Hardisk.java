package com.autowirin;

public class Hardisk {
	
	private String hName;

	public Hardisk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hardisk(String hName) {
		super();
		this.hName = hName;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	@Override
	public String toString() {
		return "Hardisk [hName=" + hName + "]";
	}
	
	
	

}
