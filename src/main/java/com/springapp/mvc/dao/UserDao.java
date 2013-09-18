package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;

import java.util.List;

/**
 *  These are the supported operations for users
 */
public interface UserDao {

    public void addUser(User user);
    public List listUsers();

}
