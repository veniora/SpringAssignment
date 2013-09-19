package com.springapp.mvc.dao;

import com.springapp.mvc.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBook(Book book) {
        this.sessionFactory.getCurrentSession().save(book);
    }

    @Override
    public List listUserBooks() {
        //noinspection JpaQlInspection
        return this.sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    @Override
    public void removeBook(long id) {
        Book book = (Book) sessionFactory.getCurrentSession().load(Book.class, id);
        if (null != book) {
            sessionFactory.getCurrentSession().delete(book);
        }
    }
}