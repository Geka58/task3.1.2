package com.example.geka.spring.boot.dao;



import com.example.geka.spring.boot.model.User;

import java.util.List;

public interface UserDao {

    List<User> listUser();

    void addUser(User user);

    void deleteUser(int id);

    User getUserById(int id);

    User updateUser(User user);
}
