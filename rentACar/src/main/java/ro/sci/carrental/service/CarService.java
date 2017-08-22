package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.Repository;

import java.util.List;

/**
 * Service Interface for car.
 */
public interface CarService<T> {

    List<T> getAll();

    /**
     * Add to repository
     *
     * @param t generic type
     */
    void add(T t);

    /**
     * Delete from repository
     *
     * @param t generic type
     */
    void delete(T t);


    /**
     * Find same make cars in system.
     *
     * @param v Car make
     * @return List<Car>
     */
    List<T> findCarsByMake(String v);

    void update(T t);

    void setCarRepository(Repository<Car> carRepository);
}

