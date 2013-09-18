package com.springapp.mvc.service;

import com.springapp.mvc.model.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);
    public List<User> listUsers();
    public void removeUser (long id);
}
