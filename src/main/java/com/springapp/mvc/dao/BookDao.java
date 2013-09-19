package com.springapp.mvc.dao;

import com.springapp.mvc.model.Book;

import java.util.List;

public interface BookDao {

    public void addBook(Book book);
    public List listUserBooks();
    public void removeBook(long id);

}
