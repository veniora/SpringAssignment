package com.springapp.mvc.dao;

import com.springapp.mvc.model.BasicUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Logic to display and add users
 */
@Repository("userDao")
public class BasicUserDaoImpl implements BasicUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(BasicUser user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public List listUsers() {
        return sessionFactory.getCurrentSession().
                createCriteria(BasicUser.class).list();
    }
}
