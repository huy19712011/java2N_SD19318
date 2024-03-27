package com.mycompany.java2n_sd19318.jdbc.forMySQL;

import java.sql.Connection;

public class NewClass {

    public static void main(String[] args) {

        DatabaseConnectionManager_MySQL dcm
                = new DatabaseConnectionManager_MySQL(
                        "localhost:3306",
                        "testdb",
                        "root",
                        "123456");

        try {

            Connection connection = dcm.getConnection();

            System.out.println("Connected...");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
