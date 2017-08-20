package ro.sci.carrental.carAndCustomerReader;

import ro.sci.carrental.domain.customer.Customer;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by tudor.radovici on 20.07.2017.
 */
public class CustomerReaderThread extends Thread {
    private	static Logger customerLogger =	Logger.getLogger("my.class.fqn");
    public void run(){
        customerLogger.info ("start of customer input");
        //Customer
        File customerFile = new File ("customers.txt");
        EntityReader customerEnt = new EntityReader ();
       List<String> lines = customerEnt.readLines (customerFile);
        CustomerConvertor customerConvertor = new CustomerConvertor ();
        int i = 0;
        for (String line : lines) {
            i++;
            Customer customer = null;
            try {
                customer = customerConvertor.convert(line);
                System.out.println(customer);
            } catch (InvalidEntityException e) {
                customerLogger.log (Level.SEVERE,"invalid customer for: [" + line + "] at line: " + i );
            }
        }
    }
}
