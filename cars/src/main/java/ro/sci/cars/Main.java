package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public class Main {

    public static void main(String[] args) {


        Vehicle car = new Car(10, FuelType.DIESEL, 60, 6, 4.5);
        System.out.println("Simulating a car drive:");
        simulateDriving(car);


        Vehicle horse = new Horse();
        System.out.println("\n###############  Simulating a horse ride:");
        //simulateDriving(horse);

    }

    private static void simulateDriving(Vehicle vehicle) {
        vehicle.start();
        vehicle.shitGear(1);
        vehicle.drive(100);
        vehicle.shitGear(2);
        vehicle.drive(100);
        vehicle.shitGear(3);
        vehicle.drive(100);
        vehicle.getAvgFuel ();
        vehicle.stop();



       // double availableFuel = vehicle.getAvailableFuel();
        //System.out.println("available fuel: " + availableFuel);

        //double avgFuelPer100km = vehicle.getAvgFuelPer100km();
        //System.out.println("avg fuel per 100 km: " + avgFuelPer100km);
    }
}
