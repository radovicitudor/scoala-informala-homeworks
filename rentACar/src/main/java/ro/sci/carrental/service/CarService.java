package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;
import java.util.List;

/**
 * Service Interface for car.
 */
public interface CarService<T> {
    /**
     *
     * @param t
     */
    void add(T t);

    /**
     *
     * @param t
     */
    void delete(T t);

    /**
     *
     * @param t
     */
    void update(T t);
    /**
     * Find same make cars in system.
     * @param make car make
     * @return List<car>
     */
    List<Car> findCarsByMake(String make);

    /**
     * Find same make and model cars in system.
     * @param make
     * @param model
     * @return List<car>
     */
    List<Car> findCarsByMakeAndModel(String make, String model);

    /**
     * Find same make, model, color and seats cars in system.
     * @param make
     * @param model
     * @param color
     * @param seats
     * @return List<car>
     */
    List<Car> findCarsByMakeModelColorAndSeats(String make, String model, String color, int seats);
}

