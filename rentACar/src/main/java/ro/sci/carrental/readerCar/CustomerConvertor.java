package ro.sci.carrental.readerCar;

import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.domain.customer.CustomerAddress;
import ro.sci.carrental.domain.customer.PaymentMethod;


/**
 * Created by tudor.radovici on 14.07.2017.
 */
public class CustomerConvertor implements Convertor<Customer> {
    @Override
    public Customer convert(String convertedString) throws InvalidEntityException {
        String[] tokens = convertedString.split (",");
        if (tokens.length != 5) {
            throw new InvalidEntityException ("Invalid Customer Description");
        }

        Customer customer = new Customer ();
        customer.setFirstName (tokens[0]);
        customer.setLastName (tokens[1]);
       // customer.setCustomerAddress (tokens[2]);
        customer.setId (Integer.valueOf (tokens[3]));
        customer.setTelephone (Double.valueOf (tokens[4]));
      //  customer.setDateOfBirth token 5
        // customer.setDateOfDriversLicense token 6
        customer.setEmail (tokens[7]);
        customer.setPaymentMethod (PaymentMethod.valueOf (tokens[8].toUpperCase ()));

        return customer;
    }
}

