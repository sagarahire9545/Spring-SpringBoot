package com.factorymethod;

public class A {
	
  private static final A obj =new A();
  
  private A() {
	  System.out.println("private constructor");
  }
  
  public static A getA() {
	  return obj;
  }
  
  public void msg() {
	  System.out.println("Hello J21");
  }

}
