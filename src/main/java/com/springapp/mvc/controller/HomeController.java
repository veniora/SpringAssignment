package com.springapp.mvc.controller;

import com.springapp.mvc.model.BasicUser;
import com.springapp.mvc.service.BasicUserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private BasicUserService basicUserService;

	@RequestMapping(method = RequestMethod.GET)
	public String displayUsers(ModelMap model) {
        model.addAttribute("userList", basicUserService.listUsers());

		return "index";
	}

    @RequestMapping(method = RequestMethod.POST)
    public String addNewUser(@ModelAttribute(value = "basicUser")BasicUser user, BindingResult result){
        if (result.hasErrors()){
            return "index";
        } else {
            System.out.println("New User Added");
            basicUserService.addUser(user);

            return "index";
        }
    }
}