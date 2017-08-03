package ro.sci.carrental.util;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.Gearbox;
import ro.sci.carrental.domain.car.VehicleCategory;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarDAO {
    private final String url = "jdbc:postgresql://localhost:5432/grupa7";
    private final String user = "postgres";
    private final String password = "1234";
    private static Logger carDAOLogger = Logger.getLogger("CarDAO.fqn");

        public Connection connect()throws SQLException{
            return DriverManager.getConnection(url,user,password);
    }
    public CarDAO(){
         try(Connection conn= connect();
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT * from cars"))
         {
             while (rs.next()) {

                 Car car = new Car();
                 car.setMake(rs.getString("make"));
                 car.setModel(rs.getString("model"));
                 car.setSize(rs.getFloat("size"));
                 car.setColor(rs.getString("color"));
                 car.setSeats(rs.getInt("seats"));
                 car.setDoors(rs.getInt("doors"));
                 car.setColor(rs.getString("color"));
                 car.setPower(rs.getInt("power"));
                 car.setFuelType (FuelType.valueOf (rs.getString("fueltype").toUpperCase ()));
                 car.setGearbox (Gearbox.valueOf (rs.getString("gearbox").toUpperCase ()));
                 car.setVehicleCategory (VehicleCategory.valueOf (rs.getString("vehiclecategory").toUpperCase ()));
                 car.setMinAgeRequired(rs.getInt("minagerequired"));
                 car.setGps(rs.getBoolean("gps"));
                 car.setAc(rs.getBoolean("air_condioning"));
                 carDAOLogger.log (Level.INFO, String.valueOf(car));
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }

    }
  /* id int,
    first_name varchar(20),
    last_name varchar(20),
    telephone varchar(15),
    email varchar(30),
    date_of_birth varchar(20),
    date_of_drivers_license varchar(20),
    customerAddress varchar(20),
    payment_method varchar(10)
*/
}
