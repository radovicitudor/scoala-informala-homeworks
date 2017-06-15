package ro.sci.carrental.repository;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.util.FuelType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Implementation of CarRepository.
 *
 * @author Flaviu Lupoian
 * @version 1.0
 * @since 1.8
 */
public class CarRepositoryImpl implements CarRepository {

    private List<Car> cars = new ArrayList<Car>();


    public List<Car> getAll() {
        return cars;
    }

    public List<Car> getCarsByMake(String make) {
        return null;
    }

    public List<Car> getCarsByFuelType(FuelType fuelType) {
        return null;
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void delete(Car car) {
        //this.cars.removeIf(aCar -> aCar.equals(car));

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(car)) {
                iterator.remove();
            }
        }
    }

    public void update(Car car) {
        System.out.println("am facut update la:" + car);
    }

    @Override
    public void addAll(Car cars) {

    }

    @Override
    public List<Car> findCarsByMake(String Make) {
        return null;
    }

    @Override
    public void update() {

    }
}