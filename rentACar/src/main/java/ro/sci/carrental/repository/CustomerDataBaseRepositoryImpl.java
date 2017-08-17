package ro.sci.carrental.repository;

import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.domain.customer.CustomerAddress;
import ro.sci.carrental.domain.customer.PaymentMethod;
import ro.sci.carrental.service.CustomerService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDataBaseRepositoryImpl extends DataBase implements Repository<Customer>,CustomerService<Customer> {

    private List<Customer> dbCustomers= new ArrayList<>();

    void loadDriver(){super.loadDriver();}
    @Override
    public void add(Customer customer) {
        try (Connection writeCustomersConnection  = newConnection(
                "postgresql",
                "localhost",
                "5432",
                "grupa7",
                "postgres",
                "1234");
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
        try(Connection customerDeleteConnection  = newConnection(
                "postgresql",
                "localhost",
                "5432",
                "grupa7",
                "postgres",
                "1234");
            PreparedStatement customerDeleteStm= customerDeleteConnection.prepareStatement("DELETE FROM Customers where " +
                    "firs_name=? && last_name=?")) {

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
    public void update(Customer newCustomer, Customer oldCustomer) {
        try(Connection customerUpdateConnection  = newConnection(
                "postgresql",
                "localhost",
                "5432",
                "grupa7",
                "postgres",
                "1234");
            PreparedStatement customerUpdateStm= customerUpdateConnection.prepareStatement("UPDATE customers SET" +
                    "first_name=?" +
                    "last_name=?" +
                    "telephone=?" +
                    "email=?" +
                    "date_of_birth=?" +
                    "customeraddress=?" +
                    "payment_method=?" +
                    "where first_name=? && last_name=?")){

            customerUpdateConnection.setAutoCommit(false);

            customerUpdateStm.setString(1,newCustomer.getFirstName());
            customerUpdateStm.setString(2,newCustomer.getLastName());
            customerUpdateStm.setString(3,newCustomer.getTelephone());
            customerUpdateStm.setString(4,newCustomer.getEmail());
            customerUpdateStm.setString(5,newCustomer.getDateOfBirth());
            customerUpdateStm.setString(6,newCustomer.getCustomerAddress().toString());
            customerUpdateStm.setString(7,newCustomer.getPaymentMethod().toString());

            customerUpdateStm.setString(8,oldCustomer.getFirstName());
            customerUpdateStm.setString(9,oldCustomer.getLastName());

            customerUpdateConnection.commit();
            customerUpdateConnection.setAutoCommit(true);
            customerUpdateStm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void addAll() {
        try (Connection addAllCustomersConnection  = newConnection(
                "postgresql",
                "localhost",
                "5432",
                "grupa7",
                "postgres",
                "1234");
             Statement addAllCustomersStm= addAllCustomersConnection.createStatement();
             ResultSet rs= addAllCustomersStm.executeQuery("SELECT " +
                     "first_name, " +
                     "last_name, " +
                     "telephone, " +
                     "email, " +
                     "date_of_birth, " +
                     "date_of_drivers_license," +
                     "payment_method "+
                     "FROM customers")){

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

    }
}
