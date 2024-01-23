package com.springcore.auto.wire.annotation;


public class Address {

	private String city;
	private String stree;
	private int pin_code;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String stree, int pin_code) {
		super();
		this.city = city;
		this.stree = stree;
		this.pin_code = pin_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStree() {
		return stree;
	}

	public void setStree(String stree) {
		this.stree = stree;
	}

	public int getPin_code() {
		return pin_code;
	}

	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", stree=" + stree + ", pin_code=" + pin_code + "]";
	}

}
