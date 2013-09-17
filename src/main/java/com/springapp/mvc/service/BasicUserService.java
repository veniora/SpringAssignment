package com.springapp.mvc.service;

import com.springapp.mvc.model.BasicUser;

import java.util.List;

public interface BasicUserService {

    public void addUser(BasicUser user);
    public List<BasicUser> listUsers();
}
