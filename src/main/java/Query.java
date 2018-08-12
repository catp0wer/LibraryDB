import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Query {
    public void selectAll(){
        String sql ="SELECT * FROM Author";
        //"SELECT Author.First_Name,Title from Author left join Book ON Author.Author_id=Book.Author_id";
        //First_Name,Last_Name,author_id,Year_of_Birth

        // establishing connection
        try (Connection conn = SQLconnection.connect();
             //Statement defines the methods tht enable you to send SQL commands and receive data from db
             Statement stmt  = conn.createStatement();
             //executeQuery() returns the object of ResultSet that is used to get all the records of a table
             ResultSet rs = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("First_Name") +  "\t" +
                        rs.getString("Last_Name") + "\t" +
                        rs.getString("Year_of_Birth") + "\t" +
                        rs.getInt("author_id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

