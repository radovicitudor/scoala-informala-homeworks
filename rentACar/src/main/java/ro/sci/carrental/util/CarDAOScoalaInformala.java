package ro.sci.carrental.util;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.Gearbox;
import ro.sci.carrental.domain.car.VehicleCategory;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarDAOScoalaInformala {
    public void printAllCars() {



        try (
                Connection conn = newConnection("postgresql", "localhost", "5432", "grupa7", "postgres", "1234");
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(
                        "SELECT id,make,model,size,color,gps,air_condioning,seats,doors,color,power,fueltype,gearbox, minagerequired,vehiclecategory FROM cars");
        )
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
                Logger carLogger =	Logger.getLogger("my.class.fqn");
                carLogger.log (Level.INFO, String.valueOf(car));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void loadDriver() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

    }

    private static Connection newConnection(String type, String host, String port, String dbName, String user,
                                            String pw) {

        loadDriver();
        DriverManager.setLoginTimeout(60); // wait 1 min; optional: DB may be
        // busy, good to set a higher
        // timeout
        try {
            String url = new StringBuilder().append("jdbc:").append(type) // “mysql”
                    // /
                    // “db2”
                    // /
                    // “mssql”
                    // /
                    // “oracle”
                    // /
                    // ...
                    .append("://").append(host).append(":").append(port).append("/").append(dbName).append("?user=")
                    .append(user).append("&password=").append(pw).toString();
            System.out.println(url);
            return DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }

        return null;
    }


}
