package ro.sci.carrental.service;

import ro.sci.carrental.domain.Customer;
import ro.sci.carrental.repository.CustomerRepositoryImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudor.radovici on 31.05.2017.
 */
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepositoryImpl customerRepository;

    public CustomerServiceImpl(CustomerRepositoryImpl customerRepository){

        this.customerRepository=customerRepository;
    }

    public List<Customer> findCustomersByFirstName(String firstName) {
        List<Customer> foundCustomers = new ArrayList<Customer> ();

        for(Customer customer: customerRepository.getAll()){
            if (customer.getFirstName ().equalsIgnoreCase (firstName)) {
                foundCustomers.add (customer);
            }
        }

        return foundCustomers;
    }

    public List<Customer> findCustomersByDateOfBirthAndDriverLIcense(SimpleDateFormat dateOfBirth, SimpleDateFormat dateOfDriverLicense) {
        return null;
    }

}

