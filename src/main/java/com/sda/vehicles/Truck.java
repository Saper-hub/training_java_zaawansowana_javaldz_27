package com.sda.vehicles;

public class Truck extends Vehicle {

    public Truck(){

        System.out.println("Truck constructor");
    }

    @Override
    public void run(double velocity) {
        super.run(velocity);
        if (velocity > 80){
            System.out.println("Truck running too fast. Max speed = 80 km/h");
            velocity = 80;

            //Operator ternarny
            //Math.min
        }
        System.out.println("truck running at " + velocity + " km/h");
    }

}
