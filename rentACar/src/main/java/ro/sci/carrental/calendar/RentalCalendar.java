package ro.sci.carrental.Calendar;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;

/**
 * Created by tudorradovici on 29/05/17.
 */
public interface RentalCalendar {

    /**
     *Method pcikupTime simulates a car pickup by a client
     * @param car
     * @param customer
     * @param date
     */
    void pickupTime(Car car, Customer customer, String date);

    /**
     * Method returnTime() simulates a return of a car previously rented.
     * @param car
     * @param customer
     * @param date
     */
    void returnTime(Car car,Customer customer, String date);

    /**
     * Method  calculateRentalPrice() calculates the price of a rental period for a certain car.
     * @param t
     * @param v
     * @param <T>
     * @param <V>
     * @return
     */
    <T extends Car, V extends Number> double calculateRentalPrice (T t,V v);

}
