package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of CarService.
 *
 */
public class CarServiceImpl implements CarService<Car> {

    private Repository<Car> carRepository;


    @Override
    public List<Car> getAll() {
        return this.carRepository.getAll();
    }

    @Override
    public void add(Car t) {
        this.carRepository.add(t);
    }

    @Override
    public void delete(Car t) {
        this.carRepository.delete(t);
    }
    public void update( Car car){
        this.carRepository.update(car);

    }


    /**
     * Public method findCarsByMake searches cars by make.
     *
     * @param make holds value of car make
     * @return list of found cars.
     */

    public List<Car> findCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<>();

        for (Car car : carRepository.getAll()) {
            if (car.getMake().equalsIgnoreCase(make)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    @Override
    public void setCarRepository(Repository<Car> carRepository) {
        this.carRepository = carRepository;
    }
}