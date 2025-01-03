package com.org.pack.abstraction;

import java.security.cert.X509Certificate;

public class Main {

	public static void main(String[] args) {
		Abstraction c = new Credit();
		c.initialPay(1000);
		c.printRecipt(1000);
		
		Abstraction d = new Debit();
		d.initialPay(3000);
		d.printRecipt(3000);
		
		
		Abstraction u = new Upi();
		u.initialPay(5000);
		u.printRecipt(5000);
		
		
		

	}

}