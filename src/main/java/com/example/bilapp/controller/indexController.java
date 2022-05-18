package com.example.bilapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


//TODO Find ud af hvad der høre hvor henne og husk comments.

@Controller // Main page
public class indexController {

}
/*

    private final UserService userService;

    @Autowired
    public indexController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:index";
    }

    @GetMapping("/index")
    public String logind() {
        return "index.html";
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:index";
    }

} */
