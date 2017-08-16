package ro.sci.carrental.repository;


import java.util.List;
import ro.sci.carrental.domain.car.Car;

/**
 * Created by tudorradovici on 29/05/17.
 */
/**
 * Repository interface for car, this will help managing all persistence operations related to car.
 *
 */
public interface CarRepository<T extends Car> extends Repository<T>{
    /**
     * Get all cars in the system
     *
     * @return List<Car>
     */
    List<T> getAll();

    /**
     * * Return all the cars of a certain maker
     * @param v
     * @return List<Car>
     */
     List<T>getCarsByMake(String v);

    /**
     * Return all cars by fuel type
     * @param v
     * @param <T>
     * @param <V>
     * @return List<car>
     */
     List<T> getCarsByFuelType(String v);

    /**
     * Add a car in the system.
     *
     * @param t
     */
    void add(T t);

    /**
     * Delete a car from the system.
     *
     * @param t
     */
    void delete(T t);

    /**
     * Updates car information in the system.
     *
     * @param t
     */
    void update(T t);

    /**
     *
     * @param t
     */
    void reserve (T t);

    /**
     *
     * @param t
     */
    void freeUp (T t);

}