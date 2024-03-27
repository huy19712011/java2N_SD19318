package com.mycompany.java2n_sd19318.jdbc.statement;

import com.mycompany.java2n_sd19318.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertDemo {

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

            String sql = """
                            INSERT INTO employees2(Id, Name, Salary)
                            values (2, 'Mary', 60000);
                         """;

            statement.executeUpdate(sql);

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
