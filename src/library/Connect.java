package library;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Connect {
    private final String url = "jdbc:mysql://localhost/library?serverTimezone=Europe/Minsk&useSSL=false";
    private final String username = "root";
    private final String password = "SCN932hdu";
    private Connection connection;

    public Connect() {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Connection failed...");
        }

    }

    public Connection getConnection() {
        return this.connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}