package com.springapp.mvc.dao;

import com.springapp.mvc.model.BasicUser;

import java.util.List;

/**
 *
 */
public interface BasicUserDao {

    public void addUser(BasicUser user);
    public List listUsers();

}
