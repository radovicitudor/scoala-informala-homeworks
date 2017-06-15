package ro.sci.carrental;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CarServiceImpl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * <h1>RentACar Model</h1>
 * RentACar simulates a car rental business.
 * <p>
 * <h>
 * This is the main method which makes use of static void method searches() to run multiple queries
 *
 * @author Flaviu Lupoian
 * @version 1.0
 * @since 1.8
 */
public class Mainv2 {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();

        Car toyota1 = getCar(1);
        Car toyota2 = getCar(2);
        Car toyota3 = getCar(3);

        carService.add(toyota1);
        carService.add(toyota1);
        carService.add(toyota2);
        carService.add(toyota3);
        carService.add(toyota3);
        carService.add(toyota3);
        carService.add(toyota3);

        List<Car> cars = carService.getAll();

        Set<Car> carsSet = new LinkedHashSet<>(cars);

        System.out.println("\n\n LIST:");
        cars.forEach(car -> System.out.println(car.hashCode()));

        System.out.println("\n\n SET:");

        carsSet.forEach(car -> System.out.println(car.hashCode()));

        System.out.println("\n\n DELETE FROM SERV");
        carService.delete(toyota3);

        System.out.println("\n\n LIST");
        cars.forEach(car -> System.out.println(car.hashCode()));

        System.out.println("\n\n SET");
        carsSet.forEach(car -> System.out.println(car.hashCode()));

//
//        System.out.println("\n\n");
//        toyota3.setColor("red");
//        carService.update(toyota3);
//
//        cars.forEach(car -> System.out.println(car));
//
//        System.out.println("\n\n");
//
//        cars.forEach(car -> System.out.println(car));
    }

    private static Car getCar(int i) {
        Car toyota = new Car();
        toyota.setAc(true);
        toyota.setColor("blue" + i);
        toyota.setDoors(5);
        toyota.setMake("toyota" + i);
        toyota.setModel("prius" + i);
        return toyota;
    }

}