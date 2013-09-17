package com.springapp.mvc.dao;

import com.springapp.mvc.model.BasicUser;

import java.util.List;

/**
 *  These are the supported operations for users
 */
public interface BasicUserDao {

    public void addUser(BasicUser user);
    public List listUsers();

}
