package ro.sci.carrental.Calendar;

import ro.sci.carrental.domain.Customer;

/**
 * Created by tudorradovici on 29/05/17.
 */
public interface RentalCalendar {

    /**
     *Method simulates a pickup time  for a rented car
     * @param customer
     * @param date
     */
    void pickupTime(Customer customer, String date);

    /**
     *Method return a pickup time  for a rented car
     * @param customer
     * @param date
     */
    void retunrTime(Customer customer, String date);

}
