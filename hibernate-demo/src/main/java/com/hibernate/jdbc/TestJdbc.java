package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String dbConnectionString = "jdbc:mysql://localhost:3306/hb_student_tracker";
        String user = "hbstudent";
        String pass = "hbstudent";
        try {

            System.out.println("Connecting to database: " + dbConnectionString);

            Connection connection = DriverManager.getConnection(dbConnectionString, user, pass);

            System.out.println("Connected Successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
