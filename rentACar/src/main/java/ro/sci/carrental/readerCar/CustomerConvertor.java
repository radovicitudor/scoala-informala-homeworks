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
        if (tokens.length != 2) {
            throw new InvalidEntityException ("Invalid Customer Description");
        }

        Customer customer = new Customer ();
        customer.setFirstName (tokens[0]);
        customer.setLastName (tokens[1]);
       // customer.setCustomerAddress (Object.tokens[2]);
        customer.setId (Integer.valueOf (tokens[2]));
        customer.setTelephone (String.valueOf (tokens[3]));
        customer.setDateOfBirth (String.valueOf (tokens[4]));
        customer.setDateOfDriversLicense (String.valueOf (5));
        customer.setEmail (String.valueOf (tokens[6]));
        customer.setPaymentMethod (PaymentMethod.valueOf (tokens[7].toUpperCase ()));

        return customer;
    }
}

