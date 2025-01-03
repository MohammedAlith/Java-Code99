package com.org.pack.vehicleAbstraction;



public class Main {

	public static void main(String[] args) {
	 Vehicle car = new Car();
	 car.initialPay(2000);
	 car.printReceipt(2000);
	 
  
	 Vehicle bike = new Bike();
	 bike.initialPay(3000);
	 bike.printReceipt(3000);
	
	 
	 Vehicle lorry = new Lorry();
	 lorry.initialPay(3000);
	 lorry.printReceipt(3000);
	

	 
	}

}