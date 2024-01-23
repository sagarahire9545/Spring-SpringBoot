package com.without_xml;

import org.springframework.stereotype.Component;

//@Component(value="actor")
public class Actor {

	private int aId;
	private String name;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(int aId, String name) {
		super();
		this.aId = aId;
		this.name = name;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Actor [aId=" + aId + ", name=" + name + "]";
	}

}
