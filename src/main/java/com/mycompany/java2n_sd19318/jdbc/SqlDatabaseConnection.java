package com.mycompany.java2n_sd19318.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class SqlDatabaseConnection {

    public static void main(String[] args) {

        String connectionUrl
                = "jdbc:sqlserver://localhost:1433;"
                + "database=test1;"
                + "user=sa;"
                + "password=123456;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";

        try {
            Connection connection =
                    DriverManager.getConnection(connectionUrl);

            System.out.println("Connected...");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
