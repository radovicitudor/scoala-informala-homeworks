package ro.sci.carrental;

import java.sql.*;

public class EmployeeDAO {
    public void printAllEmployees() {



        try (
                Connection conn = newConnection("postgresql",
                        "localhost", "5432", "grp7",
                        "test", "test");
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery("select e.first_name, e.last_name, jb.name  from employee e\n" +
                        "inner join job_position jb on position_id = jb.id");

        ){




            while (rs.next()) {

                System.out.println(rs.getString("first_name") + " | "  +
                        rs.getString("last_name") + " | " +
                        rs.getString("name"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //return result;
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

    public static void main2 (String[] args) throws Exception {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.printAllEmployees();
    }
}

