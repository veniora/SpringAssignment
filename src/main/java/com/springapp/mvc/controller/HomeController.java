package com.springapp.mvc.controller;

import com.springapp.mvc.model.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String displayUsers(ModelMap model) {
        model.addAttribute("user", new User());
        model.addAttribute("userList", userService.listUsers());

		return "index";
	}

    @RequestMapping(method = RequestMethod.POST)
    public String addNewUser(@ModelAttribute(value = "user")User user, BindingResult result){
        if (result.hasErrors()){
            return "index";
        } else {
            userService.addUser(user);

            return "redirect:/";
        }
    }

    @RequestMapping("/delete/user/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId) {
        userService.removeUser(userId);

        return "redirect:/";
    }
}