package com.example.geka.spring.boot.service;



import com.example.geka.spring.boot.model.User;

import java.util.List;

public interface UserService {

    List<User> listUser();

    void addUser(User user);

    void deleteUser(int id);

    User getUserById(int id);

    User updateUser(User user);
}
