package com.org.pack.methodShadowing;

public class MethodShadowing {
     static int num=50;
     public MethodShadowing() {}
    	 
    	 public static void name() {
    		 System.out.println("Hello developers...");
    		 System.out.println(num);
    		 
    	 }
    	 
  }
class Child extends MethodShadowing{
	static int num=20;
	
	
	public static void name() {
		System.out.println("I am Mohammed Alith");
	}
}
