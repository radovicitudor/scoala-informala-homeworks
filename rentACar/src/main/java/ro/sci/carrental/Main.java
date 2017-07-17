package ro.sci.carrental;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.readerCar.CarConvertor;
import ro.sci.carrental.readerCar.EntityReader;
import ro.sci.carrental.readerCar.InvalidEntityException;
import ro.sci.carrental.readerCar.CustomerConvertor;

import java.io.File;
import java.util.List;


/**
 * Created by Radovici Tudor on 5/20/2017.
 */
public class Main {
    public static void main(String[] args) {


        File file = new File ("cars.txt");
        EntityReader ent = new EntityReader ();
        List<String> lines = ent.readLines (file);
        CarConvertor carConvertor = new CarConvertor ();
        int i = 0;
        for (String line : lines) {
            i++;
            Car car = null;
            try {
                car = carConvertor.convert(line);
                System.out.println(car);
            } catch (InvalidEntityException e) {
                System.out.println ("invalid car for: [" + line + "] at line: " + i);
            }
        }

        File customerFile = new File ("customers.txt");
        EntityReader customerEnt = new EntityReader ();
        lines = customerEnt.readLines (customerFile);
        CustomerConvertor customerConvertor = new CustomerConvertor ();
        i = 0;
        for (String line : lines) {
            i++;
            Customer customer = null;
            try {
                customer = customerConvertor.convert(line);
                System.out.println(customer);
            } catch (InvalidEntityException e) {
                System.out.println ("invalid customer for: [" + line + "] at line: " + i);
            }
        }
    }
}
