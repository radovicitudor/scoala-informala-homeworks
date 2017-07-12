package ro.sci.carrental.Calendar;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;

/**
 * Created by tudorradovici on 29/05/17.
 */
public class RentalCalendarImpl implements RentalCalendar{

    public void pickupTime(Car car, Customer customer, String date) {
        System.out.println ("Vehiculul " +car.getMake ()+ " va fi preluat de catre " +customer.getLastName ()+ "la data "+ date );
        car.setReserved(true);

    }

    public void returnTime(Car car, Customer customer, String date) {
        System.out.println ("Vehiculul " +car.getMake ()+ " va fi returnat de catre " +customer.getLastName ()+ "la data "+ date );
        car.setReserved(false);
    }

    public <T extends Car, V extends Number> double calculateRentalPrice(T car, V interval) {

        return car.getRentPrice().getValue() * interval.doubleValue();
    }
}
