import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class SQLconnection {
        public static Connection connect() {
            // SQLite connection
            String url = "jdbc:sqlite:D:/Git projects/DB_library/Library.db";
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url);
                System.out.println("You have connected successfully to database");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
        }
    }
