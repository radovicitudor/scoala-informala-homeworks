package ro.sci.carrental.simulations;

import ro.sci.carrental.domain.customer.Customer;
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
            System.out.println (customer.getFirstName () +" "+  customer.getLastName ());
        }

        System.out.println ("End of Customer Repository");


        CustomerServiceImpl search1 = new CustomerServiceImpl (customerRepository);
        List<Customer> foundCustomersByFirstName = search1.findCustomersByFirstName ("Radovici");

        for (Customer customer : foundCustomersByFirstName) {
            System.out.println (customer.getFirstName () +" "+ customer.getLastName () +" "+ customer.getEmail () +" "+ customer.getTelephone ());
        }

        System.out.println ("end of customers with name Tudor");
    }
}
