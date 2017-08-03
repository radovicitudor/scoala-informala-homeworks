package ro.sci.carrental.util;


import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.domain.customer.PaymentMethod;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerDAO {
    private final String url = "jdbc:postgresql://localhost:5432/grupa7";
    private final String user = "postgres";
    private final String password = "1234";
    private static Logger customerDAOLoger = Logger.getLogger("CustomerDAO.fqn");

    public Connection connect()throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
    public CustomerDAO(){
        try(Connection conn= connect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * from customers"))
        {
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setFirstName(rs.getString("first_name"));
                customer.setLastName(rs.getString("last_name"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setTelephone(rs.getString("email"));
                customer.setDateOfBirth(rs.getString("date_of_birth"));
                customer.setDateOfDriversLicense(rs.getString("date_of_drivers_license"));
                customer.setPaymentMethod(PaymentMethod.valueOf(rs.getString("payment_method").toUpperCase ()));
                customerDAOLoger.log (Level.INFO, String. valueOf(customer));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
