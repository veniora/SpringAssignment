package com.springapp.mvc.controller;

import com.springapp.mvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookDetailsController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value="/book/{bookId}")
    public String showBookDetails(@PathVariable("bookId") long bookId, ModelMap model){

        model.addAttribute("book", bookService.getBook(bookId));
        return "bookDetails";
    }
}
