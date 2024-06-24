/*
 * Point of Sale System Project - Academic Assignment
 * Author/s: Mariano Luiz B. King, et al.
 *
 * This program was created as part of an academic assignment in Computer Science at Pamantasan ng Lungsod ng Maynila.
 * It is intended for educational purposes only and should not be used for commercial purposes.
 * 
 */

package pos_app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class db {
    final static String URL = "jdbc:mysql://localhost:3306/pos_db";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    // database connection objects
    public static Connection con;
    public static PreparedStatement prep;
    public static Statement stmt;
    public static ResultSet result;

    // establish the database connection
    public static void connect() throws SQLException {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Failed to Connect to Database");
            throw new SQLException("Unable to connect to database", e);
        }
    }
    
    // method to execute a query
    public static ResultSet executeQuery(String query) throws SQLException {
        if (con == null || con.isClosed()) {
            connect();
        }
        prep = con.prepareStatement(query);
        result = prep.executeQuery();
        return result;
    }
    
    // execute an update (insert, update, delete)
    public static void executeUpdate(String query) throws SQLException {
        if (con == null || con.isClosed()) {
            connect();
        }
        prep = con.prepareStatement(query);
        prep.executeUpdate();
    }
    
        public static ResultSet executeQuery(String query, int threshold) throws SQLException {
        if (con == null || con.isClosed()) {
            connect();
        }
        prep = con.prepareStatement(query);
        prep.setInt(1, threshold); // Set the threshold parameter
        result = prep.executeQuery();
        return result;
    }
    
    //close the database resources
    public static void close() {
        try {
            if (result != null) result.close();
            if (prep != null) prep.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}