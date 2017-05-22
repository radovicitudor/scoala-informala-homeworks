package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public class Car implements Vehicle {

    private int fuelTankSize;
    private int gears;
    private double availableFuel;
    private FuelType fuelType;
    private double factoryAvgConsumptionPer100km;
    private double driveAvgConsumptionPer100km;
    private int currentGear;
    public double fuelUsedPerGear1 = 100;
    public double fuelUsedPerGear2 = 50;
    public double fuelUsedPerGear3 = 10;
    public double fuelUsedPerGear4 = 7;
    public double fuelUsedPerGear5 = 6;
    public double fuelUsedPerGear6 = 5;
    public double fuelUsed;
    public double fuelUsedDrive;
    public double countKm;
    public double avgFuelConsumption;

    public Car(double fuel, FuelType fuelType, int fuelTankSize, int gears, double avgConsumption) {
        this.availableFuel = fuel;
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;




        this.factoryAvgConsumptionPer100km = avgConsumption;
    }

    public void start() {
        System.out.println ("start");
    }

    public void stop() {
        System.out.println ("stop");
    }

    public void drive(double km) {
        countKm = countKm + km;
        fuelUsed (currentGear, km);
    }

    public void shitGear(int gear) {
        System.out.println("Current gear= "+currentGear);
        currentGear=gear;

    }

    public double getAvailableFuel() {
        return 0;
    }

    public double getAvgFuel() {

        avgFuelConsumption = (fuelUsedDrive * 100) / countKm;
        System.out.println ("consumul mediu L/100km este: " + avgFuelConsumption+" total KM parcursi: "+countKm+" combustibil consumat: "+fuelUsedDrive);
        return avgFuelConsumption;
    }

    public double fuelUsed(int gear, double km) {
       fuelUsed = 0;
        switch (this.currentGear = gear) {
            case 1:
                fuelUsed = km * fuelUsedPerGear1 / 100;
                availableFuel = availableFuel - fuelUsed;
                fuelUsedDrive = fuelUsedDrive + fuelUsed;
                break;

            case 2:
                fuelUsed = km * fuelUsedPerGear2 / 100;
                availableFuel = availableFuel - fuelUsed;
                fuelUsedDrive = fuelUsedDrive + fuelUsed;
                break;

            case 3:
                fuelUsed = km * fuelUsedPerGear3 / 100;
                availableFuel = availableFuel - fuelUsed;
                fuelUsedDrive = fuelUsedDrive + fuelUsed;
                break;

            case 4:
                fuelUsed = km * fuelUsedPerGear4 / 100;
                availableFuel = availableFuel - fuelUsed;
                fuelUsedDrive = fuelUsedDrive + fuelUsed;
                break;

            case 5:
                fuelUsed = km * fuelUsedPerGear5 / 100;
                availableFuel = availableFuel - fuelUsed;
                fuelUsedDrive = fuelUsedDrive + fuelUsed;
                break;

            case 6:
                fuelUsed = km * fuelUsedPerGear6 / 100;
                availableFuel = availableFuel - fuelUsed;
                fuelUsedDrive = fuelUsedDrive + fuelUsed;
                break;

            default:
                fuelUsed = 0;


        }
        return fuelUsedDrive;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }
}
