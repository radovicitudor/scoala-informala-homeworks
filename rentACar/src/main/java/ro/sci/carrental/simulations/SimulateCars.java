package ro.sci.carrental.simulations;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.service.CarServiceImpl;

import java.util.List;
/**
 * Created by tudorradovici on 29/05/17.
 */

public class SimulateCars {
    public void searches(CarRepositoryImpl carRepository){
        System.out.println("List of cars in Repository is :");

        for (Car car: carRepository.getAll())
        {
            System.out.println(car.getMake());
        }

        System.out.println("End of cars in Repository");


        //search by make

        CarServiceImpl search1= new CarServiceImpl(carRepository);
        List<Car> foundCarsByMake= search1.findCarsByMake("BMW");

        System.out.println("Search by make returns:");
        for (Car car :foundCarsByMake){
            System.out.println(car.getMake()+" "+car.getModel());
        }

        System.out.println("End of cars by make");

        //search by make and model

        CarServiceImpl search2 = new CarServiceImpl(carRepository);
        List<Car> foundCarsByMakeAndModel = search2.findCarsByMakeAndModel("Ferrari", "458");

        System.out.println("Search by make and model returns:");
        for(Car car : foundCarsByMakeAndModel){
            System.out.println(car.getMake()+" "+car.getModel());
        }

        System.out.println("End of cars by make and model:");


    }
}
