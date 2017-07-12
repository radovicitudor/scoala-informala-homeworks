package ro.sci.carrental.repository;

import ro.sci.carrental.domain.customer.Customer;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by tudorradovici on 29/05/17.
 */
/**
 * Implementation of Customer Repository.
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    private List<Customer> customers = new ArrayList<Customer>();

    public List<Customer> getAll() {
        return customers;
    }

    public List<Customer> getCustomerByLastName(String lastName) {return null;}

    public List<Customer> getCustomerByFullName(String firstName, String lastName) {return null;}

    public List<Customer> getCustomerByTelephone(String telephone) {
        return null;
    }

    public void add(Customer customer) { customers.add (customer);}

    public void delete(Customer customer) { customers.remove (customer);}

    public void update(Customer customer) { customers.set (customers.indexOf (customer), customer);}
}