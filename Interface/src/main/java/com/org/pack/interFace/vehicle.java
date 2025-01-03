package com.org.pack.interFace;



abstract interface vehicle {
	public  abstract void payment(double  amount);
	
	default  void printReceipt(double amount) {
		System.out.println("Price with 50% discount : "+ amount*50/100);
		System.out.println("----------------------------");
	}

}

class Car implements vehicle{
	
	private String name;
	private String type;
	
	public Car() {}

	public Car(String name, String type ) {
		this.name=name;
		this.type=type;
	}
	
	@Override
	public void payment(double amount) {
		System.out.println("Car Price: "+amount);
		System.out.println("car Name :"+name+"\nCar Type: "+type);
	}
}

class Bike implements vehicle{
	
	private String name;
	private String type;
	
	public Bike() {}

	public Bike(String name,String type ) {
		this.name=name;
		this.type=type;
	}
	
	@Override
	public void payment(double amount) {
		System.out.println("Bike Price: "+amount);
		System.out.println("Bike Name :"+name+"\nBike Type: "+type);
	}
}
	

class Plane implements vehicle{
	private String name;
	private String type;

	public Plane() {}
	
	
	public Plane(String name, String type ) {
		this.name=name;
		this.type=type;
	}
	
	@Override
	public void payment(double amount) {
     System.out.println("Plane Price: "+amount);
     System.out.println("Plane Name :"+name+"\nPlane Type: "+type);
	}
}