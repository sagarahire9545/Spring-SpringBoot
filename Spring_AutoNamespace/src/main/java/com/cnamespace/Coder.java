package com.cnamespace;

public class Coder {
	
	private int id;
	private String name;
	public Coder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coder(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Coder [id=" + id + ", name=" + name + "]";
	}
	

}
