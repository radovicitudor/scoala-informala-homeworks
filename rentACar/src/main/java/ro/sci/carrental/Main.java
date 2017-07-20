package ro.sci.carrental;

import ro.sci.carrental.carAndCustomerReader.*;
import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.config.file=logging.properties;


/**
 * Created by Radovici Tudor on 5/20/2017.
 */
public class Main {
    private	static	Logger	mainLogger =	Logger.getLogger("my.class.fqn");
    public static void main(String[] args) {
        CarReaderThread carReaderThread = new CarReaderThread ();
        carReaderThread.start ();
        mainLogger.log (Level.INFO, "carReaderThread started");

        CustomerReaderThread customerReaderThread = new CustomerReaderThread ();
        customerReaderThread.start ();
        mainLogger.log (Level.INFO, "customerReaderThread started");

    }
}
