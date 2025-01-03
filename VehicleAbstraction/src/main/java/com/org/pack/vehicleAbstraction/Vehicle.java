package com.org.pack.vehicleAbstraction;



public abstract class Vehicle {
	public abstract void initialPay(double amount);
	public void printReceipt(double amount) {
		double discount=amount*20/100;
		System.out.println("print receipt with 20% Discount of price =  "+discount);
		System.out.println("-----------------------");
	}
}
	class Car extends Vehicle{
		@Override
		public void initialPay(double amount) {
			System.out.println("Credit Pay :"+amount);
			
		}
	}

	class Bike extends Vehicle{
		@Override
		public void initialPay(double amount) {
			System.out.println("Debit Pay :"+amount);
		}
	}


	class Lorry extends Vehicle{
		@Override
		public void initialPay(double amount) {
			System.out.println("UPI Pay :"+amount);
		}
	}