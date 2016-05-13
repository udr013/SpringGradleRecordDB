package com.udr.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by udr013 on 21-4-2016.
 */
@Controller
@ComponentScan
public class WebController {

    @RequestMapping("/")
    public String startPage(){
         return "index";
    }

    @RequestMapping("/login")
    public String loginPage(){
        System.out.println("login");
        return "login";
    }


    @RequestMapping("/about")
    public String viewAbout(){
        return "about";
    }

    @RequestMapping("/contact")
    public String viewContact(){
        return "contact";
    }

}
