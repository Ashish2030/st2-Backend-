package com.spring.BlogPost.controller;

import com.spring.BlogPost.model.User;
import com.spring.BlogPost.model.post;
import com.spring.BlogPost.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;

import javax.servlet.http.HttpSession;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String login(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);
        return "index";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/users/registration")
    public String userRegistration(User user) {
        userService.registerUser(user);
       return "index";

    }

    @RequestMapping(method = RequestMethod.POST, value = "/posts")
    public String getUserPost( post x,Model model) {
        List<User> posts =  userService.m(x.getName());
        model.addAttribute("posts", posts);
        return "posts";
    }





}