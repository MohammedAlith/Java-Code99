package downCating;

public class downcasting {
    String brand;
    String colour;

    public  downcasting(){}

    public downcasting(String brand, String colour){
        this.brand=brand;
        this.colour=colour;
    }

    public void vehicleDetails(){
        System.out.println("Brand: "+brand);
        System.out.println(("Colour: "+colour));
    }

}
class Bike extends  downcasting {
    String name;
    String colour;
    long price;


    public Bike(){}

    public Bike(String brand,String name, String colour, long price){
        super(brand,colour);
        this.name=name;
        this.colour=colour;
        this.price=price;
    }

    public void bikeDetails(){
        System.out.println("Bike name: "+name);
        System.out.println("Bike colour: "+colour);
        System.out.println("Bike price: "+price);
    }


}

