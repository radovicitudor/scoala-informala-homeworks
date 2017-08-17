package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.Gearbox;
import ro.sci.carrental.domain.car.VehicleCategory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDataBaseRepositoryImpl extends CarDataBase implements Repository<Car>  {
    private List<Car> dbCars=new ArrayList<>();


    void loadDriver(){
        super.loadDriver();
    }

    @Override
    public void add(Car car) {
            try (Connection writeCarsConnection  = newConnection(
                    "postgresql",
                    "localhost",
                    "5432",
                    "grupa7",
                    "postgres",
                    "1234");
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
        try(Connection carDeleteConnection  = newConnection(
                "postgresql",
                "localhost",
                "5432",
                "grupa7",
                "postgres",
                "1234");
        PreparedStatement carDeleteSTM= carDeleteConnection.prepareStatement("DELETE FROM cars where make=?"))
        {
            carDeleteSTM.setString(1,car.getMake());
            carDeleteSTM.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void update(Car newCar,Car oldCar) {
        try(Connection carUpdateConnection  = newConnection(
            "postgresql",
            "localhost",
            "5432",
            "grupa7",
            "postgres",
            "1234");
    PreparedStatement carUpdateSTM =carUpdateConnection.prepareStatement("UPDATE cars SET make=?, model=?, color=? WHERE model=?")){
            carUpdateSTM.setString(1, newCar.getMake());
            carUpdateSTM.setString(2,newCar.getModel());
            carUpdateSTM.setString(3,newCar.getColor());

            carUpdateSTM.setString(4,oldCar.getModel());

            carUpdateSTM.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Car> getAll() {
        return null;
    }

    @Override
    public void addAll() {
        try (Connection addAllCarsConnection  = newConnection(
                "postgresql",
                "localhost",
                "5432",
                "grupa7",
                "postgres",
                "1234");
             Statement addAllCarSTM=addAllCarsConnection.createStatement();
             ResultSet rs= addAllCarSTM.executeQuery("SELECT id,make,model,size,color,seats,doors,power,minagerequired,air_condioning,gps,gearbox,fueltype,vehiclecategory " +
                     "from cars")) {
            while (rs.next()){
                Car car = new Car();
                car.setId(rs.getInt("id"));
                car.setMake(rs.getString("make"));
                car.setModel(rs.getString("model"));
                car.setSize(rs.getFloat("size"));
                car.setColor(rs.getString("color"));
                car.setSeats(rs.getInt("seats"));
                car.setDoors(rs.getInt("doors"));
                car.setPower(rs.getInt("power"));
                car.setMinAgeRequired(rs.getInt("minagerequired"));
                car.setAc(rs.getBoolean("air_condioning"));
                car.setGps(rs.getBoolean("gps"));
                car.setGearbox(Gearbox.valueOf(rs.getString("gearbox")));
                car.setFuelType(FuelType.valueOf(rs.getString("fueltype")));
                car.setVehicleCategory(VehicleCategory.valueOf(rs.getString("vehiclecategory")));

                dbCars.add(car);
                System.out.println(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
