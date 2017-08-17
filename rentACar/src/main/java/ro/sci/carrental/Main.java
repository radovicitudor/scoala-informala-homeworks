package ro.sci.carrental;

import ro.sci.carrental.carAndCustomerReader.InvalidEntityException;
import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.Gearbox;
import ro.sci.carrental.domain.car.VehicleCategory;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.*;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CarServiceImpl;
import ro.sci.carrental.service.CustomerService;
import ro.sci.carrental.service.CustomerServiceImpl;

public class Main {

    public static void main(String[] args)throws InvalidEntityException, InterruptedException  {


        CarService<Car> carService = new CarServiceImpl(new CarDataBaseRepositoryImpl());
        CustomerService<Customer> customerService = new CustomerDataBaseRepositoryImpl();


//        Car mercedes = new Car();
//        mercedes.setMake("mercedes");
//        mercedes.setModel("S65");
//        mercedes.setSize(10);
//        mercedes.setColor("blue");
//        mercedes.setSeats(4);
//        mercedes.setDoors(2);
//        mercedes.setPower(600);
//        mercedes.setMinAgeRequired(23);
//        mercedes.setAc(true);
//        mercedes.setGps(true);
//        mercedes.setGearbox(Gearbox.automatic);
//        mercedes.setFuelType(FuelType.petrol);
//        mercedes.setVehicleCategory(VehicleCategory.coupe);
//        carService.add(mercedes);
//        Car bmw = new Car();
//        bmw.setModel("335");
//         bmw.setMake("bmw");
//
//        carService.add(bmw);
//        carService.delete(bmw);
//
//        Car bmw2 = new Car();
//        bmw2.setMake("bmw");
//        bmw2.setModel("335");
//        bmw2.setColor("black");
//
//        carService.add(bmw2);
//
//      carService.update(bmw2,bmw);

        customerService.addAll();

    }
}
