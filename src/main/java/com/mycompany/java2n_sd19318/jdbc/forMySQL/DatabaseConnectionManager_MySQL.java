package com.mycompany.java2n_sd19318.jdbc.forMySQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnectionManager_MySQL {

    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager_MySQL(String host, String databaseName, String username, String password) {

        this.url = "jdbc:mysql://" + host + "/" + databaseName;

        this.properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
    }

    public Connection getConnection() throws SQLException {

        return DriverManager.getConnection(this.url, this.properties);
    }



}
