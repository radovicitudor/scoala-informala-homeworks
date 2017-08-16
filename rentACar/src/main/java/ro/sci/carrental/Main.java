package ro.sci.carrental;

import ro.sci.carrental.carAndCustomerReader.CarReaderThread;
import ro.sci.carrental.carAndCustomerReader.InvalidEntityException;
import ro.sci.carrental.dbWriters.CarDbWriter;
import ro.sci.carrental.dbWriters.CustomerDbWriter;
import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.repository.CustomerRepository;
import ro.sci.carrental.repository.CustomerRepositoryImpl;

public class Main {

    public static void main(String[] args)throws InvalidEntityException, InterruptedException  {


        Customer tudor= new Customer();
        tudor.setFirstName("tudor");
        tudor.setLastName("Radovici");

        Customer cristian = new Customer();
        cristian.setFirstName("cristian");
        cristian.setLastName("radovici");

        CustomerRepository<Customer> customerRepository = new CustomerRepositoryImpl();

        customerRepository.add(tudor);
        customerRepository.add(cristian);
        CustomerDbWriter customerDbWriter = new CustomerDbWriter();
        customerDbWriter.insertCustomers(customerRepository);

        Car bmw = new Car();
        bmw.setModel("335");
        bmw.setMake("bmw");

        Car mercedes = new Car();

        mercedes.setModel("S63");
        mercedes.setMake("bmw");

        CarRepository<Car> carRepository =  new CarRepositoryImpl();
        carRepository.add(bmw);
        carRepository.add(mercedes);

        CarDbWriter  carDbWriter = new CarDbWriter();
        carDbWriter.insertCars(carRepository);


        CarReaderThread carReaderThread = new CarReaderThread();
        carReaderThread.start();
    }
}
