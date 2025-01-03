package com.org.pack.interFace;



public class Main {
	public static void main(String[] args) {
		 vehicle car = new Car("Honda","BMW");
		 car.payment(20000);
		 car.printReceipt(20000);
		 
	  
		 vehicle bike = new Bike("Activa","Scooty");
		 bike.payment(30000);
		 bike.printReceipt(30000);
		
		 
		 vehicle plane = new Plane("Reliance","Passenger");
		 plane.payment(5000000);
		 plane.printReceipt(5000000);
}
}
