import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class SQLconnection {
        public static Connection connect() {
            // SQLite connection

            GetProperties prop = new GetProperties();
            String url = null;
            //reading the path from env.properties
            try {
                url = prop.getProp("PATH");
                System.out.println(url);
            } catch (IOException e) {
               e.printStackTrace();
           }
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
