package ro.sci.carrental.simulations;

import ro.sci.carrental.domain.Customer;
import ro.sci.carrental.repository.CustomerRepository;
import ro.sci.carrental.repository.CustomerRepositoryImpl;

/**
 * Created by tudorradovici on 29/05/17.
 */
public class SimulateCustomer {
    public void searches(CustomerRepositoryImpl customerRepository){

        System.out.println("List of Customers in Repository");

        for (Customer customer : customerRepository.getAll ()){
            System.out.println (customer.getFirstName ());
            System.out.println (customer.getLastName ());
        }
    }
}
