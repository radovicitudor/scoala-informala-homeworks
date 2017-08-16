package ro.sci.carrental.util;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.Gearbox;
import ro.sci.carrental.domain.car.VehicleCategory;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CarServiceImpl;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarDAO {
//    private static Logger carDAOLogger = Logger.getLogger("CarDAO");
//    Car car = new Car();
//    Car bmw = new Car();
//   // CarRepository<Car> carRepository = new CarRepositoryImpl();
//   // CarService<Car> carService = new CarServiceImpl(carRepository);
//
//    private static void loadDriver() {
//        try {
//            Class.forName("org.postgresql.Driver").newInstance();
//        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//            System.err.println("Can’t load driver. Verify CLASSPATH");
//            System.err.println(e.getMessage());
//        }
//    }
//
//
//    private static Connection newConnection(String type, String host, String port, String dbName, String user,
//                                            String pw) {
//
//        loadDriver();
//        DriverManager.setLoginTimeout(60); // wait 1 min; optional: DB may be
//        // busy, good to set a higher
//        // timeout
//        try {
//            String url = new StringBuilder().append("jdbc:").append(type) // “mysql”
//                    // /
//                    // “db2”
//                    // /
//                    // “mssql”
//                    // /
//                    // “oracle”
//                    // /
//                    // ...
//                    .append("://").append(host).append(":").append(port).append("/").append(dbName).append("?user=")
//                    .append(user).append("&password=").append(pw).toString();
//            System.out.println(url);
//            return DriverManager.getConnection(url);
//
//        } catch (SQLException e) {
//            System.err.println("Cannot connect to the database: " + e.getMessage());
//        }
//
//        return null;
//
//
//    }
//
//    public void readCars() {
//        try (
//                Connection readCarsConnection = newConnection("postgresql", "localhost", "5432", "grupa7", "postgres", "1234");
//                Statement stm = readCarsConnection.createStatement();
//                ResultSet rs = stm.executeQuery(
//                        "SELECT * FROM cars");
//        ) {
//            while (rs.next()) {
//
//                car.setMake(rs.getString("make"));
//                car.setModel(rs.getString("model"));
//               /* car.setSize(rs.getFloat("size"));
//                car.setColor(rs.getString("color"));
//                car.setSeats(rs.getInt("seats"));
//                car.setDoors(rs.getInt("doors"));
//                car.setColor(rs.getString("color"));
//                car.setPower(rs.getInt("power"));
//                car.setFuelType(FuelType.valueOf(rs.getString("fueltype").toUpperCase()));
//                car.setGearbox(Gearbox.valueOf(rs.getString("gearbox").toUpperCase()));
//                car.setVehicleCategory(VehicleCategory.valueOf(rs.getString("vehiclecategory").toUpperCase()));
//                car.setMinAgeRequired(rs.getInt("minagerequired"));
//                car.setGps(rs.getBoolean("gps"));
//                car.setAc(rs.getBoolean("air_condioning"));*/
//                carRepository.add(car);
//                carDAOLogger.log(Level.INFO, String.valueOf(car));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        }
//
//    public void writeCars(){
//
//        try (Connection writeCarsConnection = newConnection("postgresql", "localhost", "5432",
//                "grupa7", "postgres", "1234");
//             PreparedStatement writeCarsStm =
//                     writeCarsConnection.prepareStatement("INSERT INTO cars(make,model)"+"values(?,?)")) {
//             for(Car car : carRepository.getAll()) {
//
//                    writeCarsConnection.setAutoCommit(false);
//
//                    writeCarsStm.setString(1,car.getMake());
//                    writeCarsStm.setString(2,car.getModel());
//
//                    writeCarsConnection.commit();
//                    writeCarsConnection.setAutoCommit(true);
//                    writeCarsStm.execute();
//                   // carDAOLogger.log(Level.INFO, "SCRIEREA IN TABELUL OUTCARS S-A INCHEIAT.");
//                }
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//        }
    }



