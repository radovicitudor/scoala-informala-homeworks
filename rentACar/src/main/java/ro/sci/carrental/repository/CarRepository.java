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
public interface CarRepository {
    /**
     * Get all cars in the system
     *
     * @return List<car>
     */
    <T> List<T> getAll();

    /**
     * * Return all the cars of a certain maker
     * @param v
     * @param <T>
     * @param <V>
     * @return List<car>
     */
     <T extends Car, V> List<T>getCarsByMake(V v);

    /**
     * Return all cars by fuel type
     * @param v
     * @param <T>
     * @param <V>
     * @return List<car>
     */
    <T, V> List<T> getCarsByFuelType(V v);

    /**
     * Add a car in the system.
     *
     * @param t
     */
    <T> void add(T t);

    /**
     * Delete a car from the system.
     *
     * @param t
     */
    <T> void delete(T t);

    /**
     * Updates car information in the system.
     *
     * @param t
     */
    <T> void update(T t);
}