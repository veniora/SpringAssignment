package com.springapp.mvc.controller;

import com.springapp.mvc.model.Book;
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

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/user/{userId}", method=RequestMethod.GET)
    public String showUserBooks(@PathVariable("userId") Integer userId, ModelMap model){

        model.addAttribute("userId", userId);
        model.addAttribute("book", new Book());
        model.addAttribute("bookList", bookService.listUserBooks(userId));

        return "user";
    }
    @RequestMapping(value="/user/{userId}", method = RequestMethod.POST)
    public String addNewBook(@PathVariable("userId") Integer userId,
                             @ModelAttribute(value = "book")Book book, BindingResult result){
        if (result.hasErrors()){
            return "/user/"+userId;
        } else {
            book.setUser_id(userId);
            bookService.addBook(book);

            return "redirect:/user/"+userId;
        }
    }
}
