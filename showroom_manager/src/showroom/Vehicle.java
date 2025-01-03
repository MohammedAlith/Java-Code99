package showroom;

abstract interface Vehicle {

	public abstract void Specs();

}

class Car implements Vehicle{
	private String a;
	private int price;
	private String model ;
	private String type;
	private int cc;
	public Car() {};
	public Car(String brand,int price ,String model,String type,int cc) {
		this.a=brand;
		this.price=price;
		this.model=model;
		this.type=type;
		this.cc=cc;
	}

	@Override
	public void Specs() {
		System.out.println("Car Brand : "+a);
		System.out.println("Car Price : "+price);
		System.out.println("Car Model : "+model);
		System.out.println("*********************************************************************************");
		System.out.println("Engine type : "+type);
		System.out.println("Engine cc : "+cc);
		System.out.println("*********************************************************************************");
		
		
	}
	
}
