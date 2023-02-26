/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseProject {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/library_db"; //replace with your database URL
    private static final String USER = "root"; //replace with your database username
    private static final String PASS = "root"; //replace with your database password

    public static void main(String[] args) {

        Connection conn = null;
        try {
            //connect to the database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database successfully");

            //create an instance of the Front class and display the GUI
            Front frnt = new Front();
            frnt.setVisible(true);

        } catch (SQLException ex) {
            System.out.println("Error connecting to the database: " + ex.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection to database closed successfully");
                }
            } catch (SQLException ex) {
                System.out.println("Error closing connection to the database: " + ex.getMessage());
            }
        }
    }
}

