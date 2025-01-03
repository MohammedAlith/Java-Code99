package downCating;

import upCasting.Vehicle;

public class Child {
    public static void main(String[] args){
        downcasting f=new Bike("Jupiter","Activa","Blue",50000);

        Bike b = (Bike)(f);
        b.bikeDetails();
    }

}
