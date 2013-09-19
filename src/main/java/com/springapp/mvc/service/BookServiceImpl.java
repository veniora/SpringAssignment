package com.springapp.mvc.service;

import com.springapp.mvc.dao.BookDao;
import com.springapp.mvc.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    @Transactional
    public List listUserBooks(int userid) {
        return bookDao.listUserBooks(userid);
    }

    @Override
    @Transactional
    public void removeBook(long id) {
        bookDao.removeBook(id);
    }
}
