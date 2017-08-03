package ro.sci.carrental;

import javax.sound.sampled.Line;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseLoader {
    private final String url = "jdbc:postgresql://localhost:5432/grupa7";
    private final String user = "postgres";
    private final String password = "1234";
    private static Logger DataBaseLoaderLogger = Logger.getLogger("DataBaseLoader.fqn");

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            DataBaseLoaderLogger.log(Level.INFO, "connect successful");
        } catch (SQLException e) {
            DataBaseLoaderLogger.log(Level.SEVERE, "SQLException", e);
        }
        return conn;
    }
}
