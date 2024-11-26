package com.exercisenow.enterprise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataConnection {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/fitnesstracker";
        String username = "root";
        String password = "Database1!";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println("An error occurred. Could not connect to the database");
            e.printStackTrace();
        }
    }
}
    