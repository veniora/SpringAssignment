package com.springapp.mvc.controller;

import com.springapp.mvc.model.BasicUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This is will load the home page of the website
 * It will display a list of registered users and allow new users to be added
 */

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String displayUsers(ModelMap model) {
        BasicUser user = new BasicUser();
        model.addAttribute(user);
		return "index";
	}

    @RequestMapping(method = RequestMethod.POST)
    public String addNewUser(@ModelAttribute(value = "USER")BasicUser user, BindingResult result){
        if (result.hasErrors()){
            return "index";
        } else {
            System.out.println("New User Added");

            return "index";
        }
    }
}