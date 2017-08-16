package ro.sci.carrental.dbWriters;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.CarRepository;

import java.sql.*;

public class CarDbWriter {
    private final String url = "jdbc:postgresql://localhost:5432/grupa7";
    private final String user = "postgres";
    private final String password = "1234";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    public void insertCars(CarRepository<Car> carRepository){
        String SQL="Insert INTO cars (make,model)"+"VALUES(?,?)";
        try (
                Connection writeCarsConnection  = connect();
                PreparedStatement writeCarsStm = writeCarsConnection.prepareStatement(SQL)) {
            int count = 0;

            for (Car car : carRepository.getAll()) {


                writeCarsConnection.setAutoCommit(false);

                    writeCarsConnection.setAutoCommit(false);

                    writeCarsStm.setString(1,car.getMake());
                    writeCarsStm.setString(2,car.getModel());

                    writeCarsConnection.commit();
                    writeCarsConnection.setAutoCommit(true);

                    writeCarsConnection.commit();
                    writeCarsConnection.setAutoCommit(true);
                    writeCarsStm.execute();
                }
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
