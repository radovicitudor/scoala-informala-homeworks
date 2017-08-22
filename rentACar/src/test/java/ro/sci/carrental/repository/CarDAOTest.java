package ro.sci.carrental.repository;
import org.junit.Before;
import org.junit.Test;
import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CarServiceImpl;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;

public class CarDAOTest {/*
    private CarService carService = new CarServiceImpl();
    private CarDao carDaoMock;
    @Before
    public void init() {
        carDaoMock = mock(CarDao.class);
        carService.setCarDao(carDaoMock);
        Car car = new Car();
        car.setNumber("ppp");
        when(carDaoMock.getCarByNumber(anyString())).thenReturn(car);
    }
    @Test
    public void testCarByNumber() {
        Car car = carService.getCarByNumber("akjskh");
        assertEquals("ppp", car.getNumber());
    }
    @Test
    public void testCarByNumberNotEqual() {
        Car car = carService.getCarByNumber("akjskh");
        assertNotEquals("sss", car.getNumber());
    }*/
}
