package com.mycompany.java2n_sd19318.assignment.dao;

import com.mycompany.java2n_sd19318.assignment.model.User;
import com.mycompany.java2n_sd19318.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UserDao {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            SELECT * FROM users;
                         """;

            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User();

                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));

                users.add(user);

            }

            System.out.println("done...");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;

    }

}
