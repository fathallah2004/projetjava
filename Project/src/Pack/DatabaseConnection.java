
package Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    private DatabaseConnection() {}

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
                connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/amine/IdeaProjects/projetjava/Project/src/sqliteDataBaseDependencies/carRental.db");
=======
                connection = DriverManager.getConnection("jdbc:sqlite:src/sqliteDataBaseDependencies/carRental.db");
>>>>>>> b41d1af6b645c41c8090c6c881768ad4800462c2
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException("Failed to connect to the database", e);
            }
        }
        return connection;
    }
}