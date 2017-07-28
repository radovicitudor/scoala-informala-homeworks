import ro.sci.carrental.carAndCustomerReader.CarReaderThread;
import ro.sci.carrental.carAndCustomerReader.CustomerReaderThread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmployeeDAO {

    public void printAllEmployees() {



        try (
                Connection conn = newConnection("postgresql",
                        "localhost", "5432", "grupa7",
                        "postgres", "1234");
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(
                        "SELECT id,make,model,size,color,seats,color,power, minagerequired FROM cars");
        ){

            while (rs.next()) {

                System.out.println(rs.getString("id") + " | "  +
                        rs.getString("make") + " | " +
                        rs.getString("model")+" | "+
                        rs.getString("size") + " | " +
                        rs.getString("color") + " | " +
                        rs.getString("seats") + " | " +
                        rs.getString("color") + " | " +
                        rs.getString("power") + " | " +
                        rs.getString("minagerequired")
                );

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
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }

        return null;
    }

    public static void main(String[] args) throws Exception {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.printAllEmployees();
    /*
        Logger mainLogger =	Logger.getLogger("my.class.fqn");
        CarReaderThread carReaderThread = new CarReaderThread ();
        carReaderThread.start ();
        mainLogger.log (Level.INFO, "carReaderThread started");

        CustomerReaderThread customerReaderThread = new CustomerReaderThread ();
        customerReaderThread.start ();
        mainLogger.log (Level.INFO, "customerReaderThread started");
    */
    }


    }
