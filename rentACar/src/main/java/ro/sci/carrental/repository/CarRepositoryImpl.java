package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.Gearbox;
import ro.sci.carrental.domain.car.VehicleCategory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl extends BaseRepository implements Repository<Car>  {
    private List<Car> dbCars=new ArrayList<>();



    @Override
    public void add(Car car) {
        try (Connection writeCarsConnection  = newConnection();
             PreparedStatement writeCarsStm = writeCarsConnection.prepareStatement("INSERT INTO cars(" +
                     "make," +
                     "model," +
                     "size," +
                     "color," +
                     "seats," +
                     "doors," +
                     "power," +
                     "minagerequired," +
                     "air_condioning," +
                     "gps," +
                     "gearbox," +
                     "fueltype," +
                     "vehiclecategory" +
                     ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)")) {


            writeCarsConnection.setAutoCommit(false);


            writeCarsStm.setString(1,car.getMake());
            writeCarsStm.setString(2,car.getModel());
            writeCarsStm.setDouble(3,car.getSize());
            writeCarsStm.setString(4,car.getColor());
            writeCarsStm.setInt(5,car.getSeats());
            writeCarsStm.setInt(6,car.getDoors());
            writeCarsStm.setInt(7,car.getPower());
            writeCarsStm.setInt(8,car.getMinAgeRequired());
            writeCarsStm.setBoolean(9,car.hasAc());
            writeCarsStm.setBoolean(10,car.hasGps());
            writeCarsStm.setString(11,car.getGearbox().toString());
            writeCarsStm.setString(12,car.getFuelType().toString());
            writeCarsStm.setString(13,car.getVehicleCategory().toString());



            writeCarsConnection.commit();
            writeCarsConnection.setAutoCommit(true);
            writeCarsStm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void delete(Car car) {
        try(Connection carDeleteConnection  = newConnection();
            PreparedStatement carDeleteSTM= carDeleteConnection.prepareStatement("DELETE FROM cars where make=?"))
        {
            carDeleteSTM.setString(1,car.getMake());
            carDeleteSTM.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void update(Car car) {
        try(Connection carUpdateConnection  = newConnection();
            PreparedStatement carUpdateSTM =carUpdateConnection.prepareStatement("UPDATE cars SET make=?, model=?, color=? WHERE model=?")){

            carUpdateSTM.setString(1,car.getMake());
            carUpdateSTM.setString(2,car.getModel());
            carUpdateSTM.setString(3,car.getColor());

            carUpdateSTM.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Car> getAll() {
        return null;
    }


}
