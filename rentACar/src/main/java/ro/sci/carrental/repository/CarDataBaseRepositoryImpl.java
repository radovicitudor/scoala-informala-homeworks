package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CarDataBaseRepositoryImpl extends CarDataBase implements Repository<Car>  {


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
                    PreparedStatement writeCarsStm = writeCarsConnection.prepareStatement("INSERT INTO cars(make,model) VALUES (?,?)")) {


                    writeCarsConnection.setAutoCommit(false);



                    writeCarsStm.setString(1,car.getMake());
                    writeCarsStm.setString(2,car.getModel());


                    writeCarsConnection.commit();
                    writeCarsConnection.setAutoCommit(true);
                    writeCarsStm.execute();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    @Override
    public void delete(Car car) {

    }

    @Override
    public void update(Car car) {

    }

    @Override
    public List<Car> getAll() {
        return null;
    }

    @Override
    public void addAll() {

    }
}
