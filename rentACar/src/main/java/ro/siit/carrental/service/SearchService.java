package ro.siit.carrental.service;

import ro.siit.carrental.domain.Car;
import ro.siit.carrental.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ovidiu Petridean
 */
public class SearchService {

    private CarRepository carRepository;

    public SearchService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.getCars()) {
            if (car.getMake().equals(make)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    //todo: add a new method to allow search by both make and model
    //todo: add a new method to allow search by multiple categories

}
