package com.springcore.constructor_injection;

public class Person {
	private int personId;
	private String personName;
	private Cert cert;
	
	public Person(int personId, String personName,Cert cert) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.cert=cert;
	}
	
	public String toString() {
		return this.personId+" : "+this.personName+"{"+this.cert.cer+"}"; 
		
	}
	
	

}
