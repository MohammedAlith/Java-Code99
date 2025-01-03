package com.org.pack.abstraction;

public abstract class Abstraction {
	
	public abstract void initialPay(double amount);
	public void printRecipt(double amount) {
		System.out.println("Initial Balance : ");
		System.out.println("-------------------------");
	}

}

class Credit extends Abstraction{
	@Override
	public void initialPay(double amount) {
		System.out.println("Credit Pay :"+amount);
		
	}
}

class Debit extends Abstraction{
	@Override
	public void initialPay(double amount) {
		System.out.println("Debit Pay :"+amount);
	}
}


class Upi extends Abstraction{
	@Override
	public void initialPay(double amount) {
		System.out.println("UPI Pay :"+amount);
	}
}
