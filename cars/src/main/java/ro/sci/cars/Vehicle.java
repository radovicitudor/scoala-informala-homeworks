package ro.sci.cars;

/**
 * Created by alex on 5/11/17.
 */
public interface Vehicle {

    /**
     * Starts a vehicle.
     */
    void start();

    /**
     * Stops a vehicle.
     */
    void stop();

    /**
     * Drive a vehicle for a specified number of km.
     * @param km the number of km to drive.
     */
    void drive(double km);

    /**
     * Shift the car gear with the specified number.
     * @param gear the gear to shift in.
     */
    void shitGear(int gear);

    /**
     * Finds the available fuel level in the car tank.
     * @return double value representing the remaining fuel in the car tank.
     */
    double getAvailableFuel();

    /**
     * Get the avg consumption per 100 km.
     * @return double value representing the avg consumption per 100 km.
     */
    double getAvgFuel();

    /**
     * Gets the fuel consumptions per 100km.
     * @return Fuel used
     */
    double fuelUsed(int gear, double km);
    /**
     * Calculates the amount of fuel used.
     * @return Amount of fuel used.
     */
}
