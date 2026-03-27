package com.jdvc.PROJECT_ONE;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection implements IConnection {

    @Override
    public Connection getConnection() {
        Connection con = null;
        String URL = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, userName, password);
            System.out.println("Database Connected Successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
