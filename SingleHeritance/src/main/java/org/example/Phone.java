package org.example;

public class Phone {
    String model;
    long price;

    public Phone(){

    }
    public Phone(String model, long price){
        this.model=model;
        this.price=price;
    }
    public void phoneDetails(){
        System.out.println("model: "+model);
    }
}
class Redmi extends Phone {
    String color;

    public Redmi() {

    }

    public Redmi(String model, long price, String color) {
        super(model, price);
        this.color=color;

    }

    public void redmiPhoneDetails(){
        System.out.println("Redmi Model: "+model);
        System.out.println("Redmi Price: "+price);
        System.out.println("Redmi color: "+color);
    }
}
