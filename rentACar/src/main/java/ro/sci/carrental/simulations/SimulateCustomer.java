package ro.sci.carrental.simulations;

import ro.sci.carrental.domain.Customer;
import ro.sci.carrental.repository.CustomerRepositoryImpl;
import ro.sci.carrental.service.CustomerServiceImpl;

import java.util.List;

/**
 * Created by tudorradovici on 29/05/17.
 */
public class SimulateCustomer {
    public void searches(CustomerRepositoryImpl customerRepository) {

        System.out.println ("List of Customers in Repository");

        for (Customer customer : customerRepository.getAll ()) {
            System.out.println (customer.getFirstName () + customer.getLastName ());
        }

        System.out.println ("End of Customer Repository");
    }

    CustomerServiceImpl search1 =new CustomerServiceImpl (customerRepository);
    List<Customer> foundCustomersByFirstName = search1.findCustomersByFirstName ("Tudor");

    for(Customer customer: foundCustomersByFirstName){

    }
}

/**
 CarServiceImpl search2 = new CarServiceImpl(carRepository);
 List<Car> foundCarsByMakeAndModel = search2.findCarsByMakeAndModel("Ferrari", "458");

 System.out.println("Search by make and model returns:");
 for(Car car : foundCarsByMakeAndModel){
 System.out.println(car.getMake()+" "+car.getModel());
 }

 System.out.println("End of cars by make and model:");*/