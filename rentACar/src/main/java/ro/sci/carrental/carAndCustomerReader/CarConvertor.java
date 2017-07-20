package ro.sci.carrental.carAndCustomerReader;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;

/**
 * Created by tudor.radovici on 14.07.2017.
 */
public class CarConvertor implements Convertor<Car> {
    @Override
    public Car convert(String convertedString) throws InvalidEntityException {
        String[] tokens = convertedString.split (",");
        if (tokens.length != 5) {
            throw new InvalidEntityException ("Invalid Car Description");
        }

        Car car = new Car ();
        car.setMake (tokens[0]);
        car.setModel (tokens[1]);
        car.setColor (tokens[2]);
        car.setDoors (Integer.valueOf (tokens[3]));
        car.setFuelType (FuelType.valueOf (tokens[4].toUpperCase ()));
        return car;
    }
}
