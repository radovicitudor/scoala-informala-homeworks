package ro.sci.carrental.repository;

import ro.sci.carrental.domain.customer.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl extends BaseRepository implements CustomerRepository {

    public static final String SELECT_ALL_USERS = "SELECT " +
            "first_name, " +
            "last_name, " +
            "telephone, " +
            "email, " +
            "date_of_birth, " +
            "date_of_drivers_license," +
            "payment_method " +
            "FROM customers";

    @Override
    public void add(Customer customer) {
        try (Connection writeCustomersConnection  = newConnection();
             PreparedStatement writeCustomersStm= writeCustomersConnection.prepareStatement("INSERT INTO customers (" +
                     "first_name, " +
                     "last_name, " +
                     "telephone, " +
                     "email, " +
                     "date_of_birth, " +
                     "date_of_drivers_license" +
                     "customeraddress, " +
                     "payment_method)"+"VALUES(" +
                     "?,?,?,?,?,?,?,?)")){

            writeCustomersConnection.setAutoCommit(false);

            writeCustomersStm.setString(1,customer.getFirstName());
            writeCustomersStm.setString(2,customer.getLastName());
            writeCustomersStm.setString(3,customer.getTelephone());
            writeCustomersStm.setString(4,customer.getEmail());
            writeCustomersStm.setString(5,customer.getDateOfBirth());
            writeCustomersStm.setString(6,customer.getDateOfDriversLicense());
            writeCustomersStm.setString(7,customer.getCustomerAddress().toString());
            writeCustomersStm.setString(8,customer.getPaymentMethod().toString());

            writeCustomersConnection.commit();
            writeCustomersConnection.setAutoCommit(true);
            writeCustomersStm.execute();



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Customer customer) {
        try(Connection customerDeleteConnection  = newConnection();
            PreparedStatement customerDeleteStm= customerDeleteConnection.prepareStatement("DELETE FROM customers where " +
                    "first_name=? AND last_name=?")) {

            customerDeleteConnection.setAutoCommit(false);

            customerDeleteStm.setString(1,customer.getFirstName());
            customerDeleteStm.setString(2,customer.getLastName());

            customerDeleteConnection.commit();
            customerDeleteConnection.setAutoCommit(true);
            customerDeleteStm.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void update(Customer customer) {
        try(Connection customerUpdateConnection  = newConnection();
            PreparedStatement customerUpdateStm= customerUpdateConnection.prepareStatement("UPDATE customers SET" +
                    "first_name=?" +
                    "last_name=?" +
                    "telephone=?" +
                    "email=?" +
                    "date_of_birth=?" +
                    "customeraddress=?" +
                    "payment_method=?" +
                    "where first_name=? AND last_name=?")){



            customerUpdateStm.setString(1,customer.getFirstName());
            customerUpdateStm.setString(2,customer.getLastName());
            customerUpdateStm.setString(3,customer.getTelephone());
            customerUpdateStm.setString(4,customer.getEmail());
            customerUpdateStm.setString(5,customer.getDateOfBirth());
            customerUpdateStm.setString(6,customer.getCustomerAddress().toString());
            customerUpdateStm.setString(7,customer.getPaymentMethod().toString());

            customerUpdateStm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Customer> getCustomerByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Customer> getCustomerByFullName(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Customer> getCustomerByTelephone(String telephone) {
        return null;
    }

    @Override
    public List<Customer> getAll() {

        List<Customer> dbCustomers= new ArrayList<>();
        try (Connection addAllCustomersConnection  = newConnection();
             Statement addAllCustomersStm= addAllCustomersConnection.createStatement();
             ResultSet rs= addAllCustomersStm.executeQuery(SELECT_ALL_USERS)){

            while (rs.next()){
                Customer customer = new Customer();
                customer.setFirstName(rs.getString("first_name"));
                customer.setLastName(rs.getString("last_name"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setDateOfBirth(rs.getString("date_of_birth"));
                customer.setDateOfDriversLicense(rs.getString("date_of_drivers_license"));
               // customer.setPaymentMethod(PaymentMethod.valueOf(rs.getString("customeraddress")));

                dbCustomers.add(customer);
                System.out.println(customer);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbCustomers;
    }
}
