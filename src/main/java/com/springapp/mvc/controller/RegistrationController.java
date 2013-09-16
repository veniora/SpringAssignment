package com.springapp.mvc.controller;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 16/09/13
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/register")
public class RegistrationController {

    @RequestMapping(method = RequestMethod.GET)
    public String showForm(ModelMap model){
        User user = new User();
        model.addAttribute("USER", user);
        return "register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@ModelAttribute(value="USER") User user, BindingResult result){
        if (result.hasErrors()){
            return "register";
        } else {
            System.out.println("User created");
            return "success";
        }
    }
}
