package ro.sci.carrental.carAndCustomerReader;

import ro.sci.carrental.domain.car.Car;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by tudor.radovici on 20.07.2017.
 */
public class CarReaderThread extends Thread {
    private	static	Logger	carLogger =	Logger.getLogger("my.class.fqn");

    public void run(){
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
                carLogger.log (Level.SEVERE,"invalid car for: [" + line + "] at line: " + i);
            }
        }
        carLogger.info ("end of car input");
    }
}
