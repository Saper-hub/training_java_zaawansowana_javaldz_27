package com.sda.vehicles;

public class VehicleApp {

    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//       // vehicle.run(100);
//
//        Car car  = new Car();
//        car.addPassengers();
//        car.removePassengers();
//        car.run(120);
//
//        Truck truck  = new Truck();
//        truck.run(120);
//        truck.run(70);

        Vehicle pojazd = new Vehicle();
        System.out.println("Vehicle");
        pojazd.run(100);
        System.out.println("----------");

        pojazd = new Car();
        System.out.println("Car");
        pojazd.run(66);
        System.out.println("----------");

        pojazd = new Truck();
        System.out.println("Truck");
        pojazd.run(80);
        System.out.println("----------");

        runThisVehicle(new Truck());
        System.out.println("----------");
        runThisVehicle(new Car());
        System.out.println("----------");
        runThisVehicle(new Vehicle());
        System.out.println("----------");

    }

    public static void  runThisVehicle(Vehicle vehicle){
        System.out.println("running Vehicle");
        vehicle.run(150);
    }
}
