package ro.sci.carrental.readerCar;

import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.readerCar.Convertor;
import ro.sci.carrental.readerCar.InvalidEntityException;

/**
 * Created by tudor.radovici on 14.07.2017.
 */
public class CustomerConvertor implements Convertor<Customer> {
    @Override
    public Customer convert(String convertedString) throws InvalidEntityException {
        String[] tokens= convertedString.split (",");
        if(tokens.length!=2){
            throw new InvalidEntityException ("invalid Customer Description");
        }
        Customer customer =new Customer ();
        customer.setFirstName (tokens[0]);
        customer.setLastName (tokens[1]);
        return customer;
    }
}
