package ro.sci.carrental;

import ro.sci.carrental.domain.car.*;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.domain.customer.CustomerAddress;
import ro.sci.carrental.domain.customer.PaymentMethod;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.repository.CustomerRepositoryImpl;
import ro.sci.carrental.simulations.SimulateCars;
import ro.sci.carrental.simulations.SimulateCustomer;


/**
 * Created by Radovici Tudor on 5/20/2017.
 */
public class Main {
    public static void main(String[] args) {

        Car bmw =new Car ();
        bmw.setMake ("BMW");
        bmw.setModel ("335i");
        bmw.hasAc(true);
        bmw.hasGps(true);
        bmw.setGearbox(Gearbox.MANUAL);
        bmw.setFuelType (FuelType.PETROL);
        bmw.setDoors (2);
        bmw.setSize (5f);
        bmw.setColor ("Black");
        bmw.setMaxMilagePerRent (200);
        bmw.setMinAgeRequired (18);
        bmw.setPower (313);
        bmw.setVehicleCategory (VehicleCategory.coupe);

        CarRepositoryImpl carRepository = new CarRepositoryImpl ();
        carRepository.add (bmw);

        Customer customer1 = new Customer ();
        customer1.setFirstName ("Tudor");
        customer1.setLastName ("Radoivici");
        customer1.setEmail ("radovicitudor@gmail.com");
        customer1.setPaymentMethod (PaymentMethod.CASH);
        customer1.setTelephone ("0740300364");
        customer1.setId (1);

        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl ();
        customerRepository.add (customer1);

        SimulateCars simulateCars = new SimulateCars ();
        simulateCars.searches (carRepository);
        SimulateCustomer simulateCustomer = new SimulateCustomer ();
        simulateCustomer.searches (customerRepository);
    }
}
