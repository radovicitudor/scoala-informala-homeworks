package ro.sci.carrental.dbWriters;

import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.CustomerRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDbWriter {
    private final String url = "jdbc:postgresql://localhost:5432/grupa7";
    private final String user = "postgres";
    private final String password = "1234";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    public void insertCustomers(CustomerRepository<Customer> carRepository){
        String SQL="Insert INTO customers (first_name, last_name)"+"VALUES(?,?)";
        try (
                Connection writeCustomerConnection  = connect();
                PreparedStatement writeCustomerStm = writeCustomerConnection.prepareStatement(SQL)) {

            for (Customer customer : carRepository.getAll()) {


                writeCustomerConnection.setAutoCommit(false);

                writeCustomerStm.setString(1,customer.getFirstName());
                writeCustomerStm.setString(2,customer.getLastName());

                writeCustomerConnection.commit();
                writeCustomerConnection.setAutoCommit(true);
                writeCustomerStm.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
