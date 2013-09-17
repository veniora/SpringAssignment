package com.springapp.mvc.dao;

import com.springapp.mvc.model.BasicUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Logic to display and add users
 */
@Repository
public class BasicUserDaoImpl implements BasicUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(BasicUser user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public List<BasicUser> listUsers() {
        return this.sessionFactory.getCurrentSession().createQuery("from BasicUser").list();
    }
}
