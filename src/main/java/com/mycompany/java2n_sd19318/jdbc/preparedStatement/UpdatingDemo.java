package com.mycompany.java2n_sd19318.jdbc.preparedStatement;

import com.mycompany.java2n_sd19318.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdatingDemo {

        public static void main(String[] args) {

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("test1", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            UPDATE employee20 SET Salary=?, Name=? WHERE Id=?;
                         """;

            preparedStatement = connection.prepareStatement(sql);

            // gan gia tri
            preparedStatement.setDouble(1, 55_000);
            preparedStatement.setString(2, "New Name");
            preparedStatement.setInt(3, 1003);

            preparedStatement.executeUpdate();

            System.out.println("done...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
