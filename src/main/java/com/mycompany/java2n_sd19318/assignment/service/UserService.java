package com.mycompany.java2n_sd19318.assignment.service;

import com.mycompany.java2n_sd19318.assignment.dao.UserDao;
import com.mycompany.java2n_sd19318.assignment.model.User;
import java.util.List;

public class UserService {

    private UserDao userDao = new UserDao();



    public List<User> getAllUsers() {

        return userDao.getAllUsers();
    }
}
