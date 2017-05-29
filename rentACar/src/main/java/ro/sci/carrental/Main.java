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





/**
 * Created by Radovici Tudor on 5/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        //crearea masinilor
        Car bmw = new Car("BMW","335",5.0f,"white",4,2,true,true,true,313, FuelType.PETROL,VehicleCategory.coupe);
        Car mercedes = new Car("MERCEDES","S65",5.0f,"black",4,4,true,true, true, 600, FuelType.PETROL, VehicleCategory.sedan);
        Car ferrrari = new Car("FERRARI","458",5.0f,"yellow",2,2,true,true,true,700,FuelType.PETROL,VehicleCategory.cabrio);

        CarRepositoryImpl carRepository = new CarRepositoryImpl();

        //introducerea masinilor in DB
        carRepository.add(mercedes);


        carRepository.add(bmw);
        carRepository.add(ferrrari);

        //creare clienti
        CustomerAddress customer1Address = new CustomerAddress("Str. Carpati Nr.1", "Cluj-Napoca", "Cluj", "Romania", "400270");
        CustomerAddress customer2Address = new CustomerAddress("Str. Bicegi Nr.1", "Oradea", "Bihor", "Romania", "400170");
        CustomerAddress customer3Address = new CustomerAddress("Str. Cucului Nr.1", "Zalau", "Salaj", "Romania", "400370");

        Customer customer1 = new Customer(1, "Dorel", "Cretu", "0727889900", "dorel@cretu.ro", customer1Address, PaymentMethod.CREDITCARD);
        Customer customer2 = new Customer(2, "Ionel", "Balanel", "0727770000", "ionel@balanel.ro", customer2Address, PaymentMethod.CASH);
        Customer customer3 = new Customer(3, "Vasile", "Blaga", "0727123456", "vasile@blaga.ro", customer3Address, PaymentMethod.PAYPAL);

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
