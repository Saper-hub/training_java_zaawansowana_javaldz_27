package com.sda.vehicles;

public class Car extends Vehicle {

    int passengers;

    public Car(){
        super(4);
        System.out.println("Car constructor");
        super.run(10);
    }

    void addPassengers(){
        ++passengers;
        System.out.println("Adding new passenger. Current number: " + passengers);
    }

    void removePassengers(){
        --passengers;
        System.out.println("Removing new passenger. Current number: " + passengers);
    }
}
