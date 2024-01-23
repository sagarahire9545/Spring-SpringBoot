package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("using setter method");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		System.out.println("using para-constructor");
		this.price = price;
	}
	
	public void init() {
		System.out.println("Inside init method..");

		if(price==10) {
			System.out.println("Ok");
		}else {
			
			System.out.println("Sorry");
		}

	}
	
	public void destroy() {
		System.out.println("Inside destroy method..");
	}

	public String toString() {
		return "The Samosa price:" + this.price;
	}
}
