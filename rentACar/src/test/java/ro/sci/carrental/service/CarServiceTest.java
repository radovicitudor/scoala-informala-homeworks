package ro.sci.carrental.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;


public class CarServiceTest {
    CarService carService = new CarServiceImpl();
    CarRepository carRepositoryMock = null;

    @Before
    public void init(){
        carRepositoryMock=mock(CarRepository.class);
        carService.setCarRepository(carRepositoryMock);
        List list= new ArrayList();
        list.add(new Car());
        when(carRepositoryMock.getAll()).thenReturn(list);
    }
    @Test
    public void getAll() {
        List cars = carService.getAll();
        assertEquals(1,cars.size());
        verify(carRepositoryMock,times(1)).getAll();
    }

    @Test
    public void add() {
    }

    @Test
    public void delete() {
        Car car= new Car();
        car.setId(1);
        carService.delete(car);
        Car car1= new Car();
        verify(carRepositoryMock,times(1)).delete(car);
        verify(carRepositoryMock,times(0)).delete(car1);
    }

    @Test
    public void findCarsByMake() {
    }

    @Test
    public void update() {
    }

}