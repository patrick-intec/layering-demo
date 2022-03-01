package ba.sepackage.data;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ConnectionManager {
    // Singleton-design: make sure 1 object is always available,
    // maximum of 1 objects can be made...
    private static ConnectionManager instance = new ConnectionManager();
    public static ConnectionManager getInstance() {
        return instance;
    }

    private Connection connection;
    private ConnectionManager() {}

    public void init() throws SQLException {
        List<String> configLines = Files.readAllLines(Paths.get("/home/moktok/config.file"));


        connection = DriverManager.getConnection("", "", "");
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void close() throws SQLException {
        connection.close();
    }

}
