package com.springapp.mvc.service;

import com.springapp.mvc.model.Book;

import java.util.List;

public interface BookService {

    public void addBook(Book book);
    public List listUserBooks(int userid);
    public void removeBook(long id);

}
