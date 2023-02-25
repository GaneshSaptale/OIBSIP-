package OnlineReservationSystem;

import java.sql.*;
public class Connect
{
    public Connection con;
    public Connect()
    {
        try
        {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set the database connection properties
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "admin";
            String password = "admin";

            // Create the database connection
            con = DriverManager.getConnection(url, user, password);

            // Do something with the database connection
            System.out.println("Connected to database!");
        }
        catch(Exception e1)
        {
            System.out.println("Connection failed:"+e1);
        }
    }
}