package com.springapp.mvc.service;

import com.springapp.mvc.dao.BasicUserDao;
import com.springapp.mvc.model.BasicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BasicUserServiceImpl implements BasicUserService {

    @Autowired
    BasicUserDao basicUserDao;

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
