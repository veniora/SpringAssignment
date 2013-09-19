package com.springapp.mvc.controller;

import com.springapp.mvc.model.Book;
import com.springapp.mvc.model.Library;
import com.springapp.mvc.model.User;
import com.springapp.mvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    /*service*/
    @Autowired
    private BookService bookService;

    private int userID;

    @RequestMapping(value = "/user/{userId}", method=RequestMethod.GET)
    public String showUserBooks(@PathVariable("userId") Integer userId, ModelMap model){

        userID=userId;
        /* list of books*/
        model.addAttribute("book", new Book());
        model.addAttribute("bookList",bookService.listUserBooks(userId));


        // Load all libraries
        return "user";
    }
    @RequestMapping(method = RequestMethod.POST, value="/user/{userID}")
    public String addNewBook(@ModelAttribute(value = "book")Book book, BindingResult result){
        if (result.hasErrors()){
            return "user";
        } else {
            bookService.addBook(book);

            return "redirect:/user/"+userID;
        }
    }
}
