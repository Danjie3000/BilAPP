package com.example.bilapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller // Main page
public class indexController {
    //TODO Find ud af hvad der høre hvor henne og husk comments.

    @GetMapping("/")
    public String index() {
        return "index";
    }


}
