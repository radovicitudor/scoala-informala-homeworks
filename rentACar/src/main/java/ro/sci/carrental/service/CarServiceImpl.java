package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.CarRepository;

import java.util.List;

/**
 * Implementation of CarService.
 *
 */
public class CarServiceImpl implements CarService<Car> {

    public CarRepository<Car> carRepository;

    public CarServiceImpl(CarRepository<Car> carRepository){
        this.carRepository=carRepository;
    }

    @Override
    public void add(Car car) {
        this.carRepository.add(car);
    }

    @Override
    public void delete(Car car) {
        this.carRepository.delete(car);

    }

    @Override
    public void update(Car t) {
        this.carRepository.update(t);
    }

    @Override
    public List<Car> findCarsByMake(String make) {
        return null;
    }

    @Override
    public List<Car> findCarsByMakeAndModel(String make, String model) {
        return null;
    }

    @Override
    public List<Car> findCarsByMakeModelColorAndSeats(String make, String model, String color, int seats) {
        return null;
    }
}