package ro.sci.carrental.service;

import ro.sci.carrental.domain.customer.Customer;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by tudor.radovici on 31.05.2017.
 */
public interface CustomerService {

    /**
     * Finds customers by first Name
     * @param firstName
     * @return List<Customer>
     */
    List<Customer> findCustomersByFirstName(String firstName);

    /**
     * Finds user by date of Birth and date of driver License
     * @param dateOfBirth
     * @param dateOfDriverLicense
     * @return List<Customer>
     */
    List<Customer> findCustomersByDateOfBirthAndDriverLIcense (SimpleDateFormat dateOfBirth, SimpleDateFormat dateOfDriverLicense);
}
