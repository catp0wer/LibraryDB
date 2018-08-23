import java.sql.*;


public class Query {
    public void selectAll(){
        PreparedStatement updateFirst_Name = null;
        PreparedStatement updateYear_of_Birth = null;
        String updateQueryFirst_Name =
                "update Author set First_Name = ? where Author_id = ?";
        try (Connection conn = SQLconnection.connect()){
             {
                 try {
                     conn.setAutoCommit(false);
                     updateFirst_Name = conn.prepareStatement(updateQueryFirst_Name);
                     updateFirst_Name.setString(1, "Test");
                     updateFirst_Name.setInt(2, 1);
                     updateFirst_Name.executeUpdate();
                     conn.commit();
                 } catch (SQLException e1) {
                     e1.printStackTrace();
                 }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

