package com.udr.controller;

import com.udr.models.User;
import com.udr.services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by udr013 on 12-5-2016.
 */
@Controller
public class UserController {

    @Autowired
    UserServiceInterface userServiceInterface;

    @RequestMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user", new User());
        System.out.println("register");
        return "register";
    }

    @RequestMapping(value = {"/register/save"}, method = RequestMethod.POST)
        public String registerPage( @ModelAttribute("user") User user) {
        userServiceInterface.saveUser(user);
        return "login";

    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login";//generally it's a good practice to show login screen again.
    }
}
