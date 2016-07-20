
import java.sql.*;
/**
 * Created by jason on 20/7/16.
 */
public class JDBC {

    ///JDBC Driver name and table url
    static final String driver = "com.mysql.jdbc.Driver";
    static final String tableName = "jdbc:mysql://localhost/customer";


    ///Database Credentials
    static final String username = "root";
    static final String pass = " ";

    public int ConnectingJDBC(String query) {
        Connection conn = null;
        Statement stmt = null;


        try {
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //open a connection
            System.out.println("Connection to selected Database");
            conn = DriverManager.getConnection(tableName, username, pass);
            System.out.println("Connected to Database");

            //excute query
            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(query);
            return rs;
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        } //end try
        return Integer.parseInt(null);
    }
}
