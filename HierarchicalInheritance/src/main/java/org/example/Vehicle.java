package org.example;

public class Vehicle {
    String brand;
    String color;

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void vehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("color: " + color);
    }

}
    class Car extends Vehicle {
        String name;
        long price;
        String color;


        public Car() {

        }

        public Car(String brand, String color, String name, long price ) {
super(brand,color);
    this.name=name;
    this.price=price;
    this.color=color;
        }
        public void carDetails(){
            System.out.println("Car Name : "+name);
            System.out.println("Car color: "+color);
            System.out.println("Car price: "+price);
            System.out.println("Car brand: "+brand);
            System.out.println("-------------------------------------");
        }
    }
class Bike extends Vehicle {
    String name;
    long price;
    String color;


    public Bike() {

    }

    public Bike(String brand, String color, String name, long price ) {
        super(brand,color);
        this.name=name;
        this.price=price;
        this.color=color;
    }
    public void bikeDetails(){
        System.out.println("Bike Name : "+name);
        System.out.println("Bike color: "+color);
        System.out.println("Bike price: "+price);
        System.out.println("Bike brand: "+brand);
        System.out.println("-------------------------------------");
    }
}


