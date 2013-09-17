package com.springapp.mvc.service;

import com.springapp.mvc.dao.BasicUserDao;
import com.springapp.mvc.model.BasicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BasicUserServiceImpl implements BasicUserService {

    @Autowired
    private BasicUserDao basicUserDao;

    @Override
    @Transactional
    public void addUser(BasicUser user) {
        basicUserDao.addUser(user);
    }

    @Override
    @Transactional
    public List listUsers() {
        return basicUserDao.listUsers();
    }
}
