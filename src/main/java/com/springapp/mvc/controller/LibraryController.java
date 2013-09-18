package com.springapp.mvc.controller;

import com.springapp.mvc.model.Library;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

    /*service*/

    @RequestMapping(value = "/user/{userId}")
    public String showUserLibraries(@PathVariable("userId") Integer userId, ModelMap model){

        /* Can add either a book or a library*/
        model.addAttribute("library", new Library());
        // add Book

        // Load all libraries
        return null;
    }
}
