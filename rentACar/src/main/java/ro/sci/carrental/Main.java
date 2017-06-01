package ro.sci.carrental;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.domain.Customer;
import ro.sci.carrental.domain.CustomerAddress;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.repository.CustomerRepositoryImpl;
import ro.sci.carrental.simulations.SimulateCars;
import ro.sci.carrental.simulations.SimulateCustomer;
import ro.sci.carrental.util.FuelType;
import ro.sci.carrental.util.PaymentMethod;
import ro.sci.carrental.util.VehicleCategory;

import java.text.SimpleDateFormat;


/**
 * Created by Radovici Tudor on 5/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        //crearea masinilor

        Car bmw = new Car ("BMW","335",5.0f,"white",4,2,313,21,0,false,true,true,true,FuelType.PETROL,VehicleCategory.coupe);
        Car mercedes = new Car ("MERCEDES","S65",5.0f,"BLACK",4,4,600,30,1000,true,true,true,true,FuelType.PETROL,VehicleCategory.sedan);
        Car ferrrari = new Car ("FERRARI","458",5.0f,"YELLOW",2,4,550,30,30,true,true,true,true,FuelType.PETROL,VehicleCategory.cabrio);


        CarRepositoryImpl carRepository = new CarRepositoryImpl();

        //introducerea masinilor in DB
        carRepository.add(mercedes);
        carRepository.add(bmw);
        carRepository.add(ferrrari);

        //creare clienti
        CustomerAddress customer1Address = new CustomerAddress("Tudor Vladimirescu 170C/40", "Targu-Mures", "Mures", "Romania", 536436);
        CustomerAddress customer2Address = new CustomerAddress("Tudor Vladimirescu 170C/40", "Targu-Mures", "Mures", "Romania", 536436);
        CustomerAddress customer3Address = new CustomerAddress("Soporului 8", "Cluj-Napoca", "Cluj", "Romania", 400400);

        Customer customer1 = new Customer(1,"Radovici","Tudor","0740300364", new SimpleDateFormat ("1994-02-22"), new SimpleDateFormat ("1994-02-22"),"radovicitudor@gmail.com",customer1Address, PaymentMethod.CASH);
        Customer customer2 = new Customer(2,"Radovici","Cristian","0744567015", new SimpleDateFormat ("2000-01-01"), new SimpleDateFormat ("1967-08-01"), "radovicicristian@gmail.com",customer2Address, PaymentMethod.CREDITCARD);
        Customer customer3 = new Customer(3,"Radovici","Crenguta","0744567018", new SimpleDateFormat ("2000-01-01"), new SimpleDateFormat ("1967-08-01"),"radovicicrenguta@gmail.com",customer3Address, PaymentMethod.BONUS);

        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

        //introducem clienti in BD

        customerRepository.add(customer1);
        customerRepository.add(customer2);
        customerRepository.add(customer3);

        //Cautare in DB masini
        SimulateCars simulateCars = new SimulateCars();

        simulateCars.searches(carRepository);

        //Cautare in DB clienti

        SimulateCustomer simulateCustomer = new SimulateCustomer();
        simulateCustomer.searches(customerRepository);
    }
}
