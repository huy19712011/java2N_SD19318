package com.mycompany.java2n_sd19318.jdbc.preparedStatement;

import java.sql.*;

import com.mycompany.java2n_sd19318.jdbc.DatabaseConnectionManager;

public class CreateTableDemo {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("test1", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            CREATE TABLE employee20(
                                Id INT NOT NULL,
                                Name NVARCHAR(30) NOT NULL,
                                Salary DECIMAL NOT NULL,
                                PRIMARY KEY (Id)
                             );
                        """;

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();

            System.out.println("done...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
