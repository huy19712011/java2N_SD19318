package com.mycompany.java2n_sd19318.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewClass {

    public static void main(String[] args) throws SQLException {

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager(
                        "test1",
                        "sa",
                        "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();
            statement = connection.createStatement();

            String sql = "SELECT * FROM sales.customers";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
