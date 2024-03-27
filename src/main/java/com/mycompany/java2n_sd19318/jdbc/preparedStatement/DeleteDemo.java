package com.mycompany.java2n_sd19318.jdbc.preparedStatement;

import com.mycompany.java2n_sd19318.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeleteDemo {
    public static void main(String[] args) {

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("test1", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            DELETE employee20 WHERE Id=?;
                         """;

            preparedStatement = connection.prepareStatement(sql);

            // gan gia tri
            preparedStatement.setInt(1, 1003);

            preparedStatement.executeUpdate();

            System.out.println("done...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
