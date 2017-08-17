package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of CarRepository.
 *
 */
public class CarRepositoryImpl implements CarRepository<Car> {

    public List<Car> cars = new ArrayList<>();
    public int capacity = 5;


    public List<Car> getAll() {
        return cars;
    }

    @Override
    public void addAll() {

    }

    @Override
    public List<Car> getCarsByFuelType(String fuelType) {
        List<Car> seachedCars = new ArrayList<>();

        for (Car car : cars) {
            if (cars.contains(fuelType)) {
                seachedCars.add(car);
            }

        }

        return seachedCars;
    }

    public List<Car> getCarsByMake(String make) {
        List<Car> seachedCars = new ArrayList<>();

        for (Car car : cars) {
            if (cars.contains(car.getMake())) {
                seachedCars.add(car);
            }

        }

        return seachedCars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    public void addAll(List<Car> cars) {
        this.cars.addAll(cars);
    }

    public void delete(Car car) {
        cars.removeIf(anotherCar -> anotherCar.equals(car));
    }

    @Override
    public void update(Car newCar, Car oldCar) {
        cars.set(cars.indexOf(oldCar), newCar);
    }


    public void reserve(Car car) {
        car.isReserved(true);
    }

    public void freeUp(Car car) {
        car.isReserved(false);
    }


    public int getCapacity() {
        return capacity;
    }
}
