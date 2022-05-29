package com.example.bilapp.controller;


import com.example.bilapp.models.Datareg;
import com.example.bilapp.services.DataregService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DataregController {
    DataregService dataregService;


    @GetMapping("/createdatareg")
    public String createDatareg() {
        return "/createdataregistrering";
    }

    @PostMapping("/createdatareg")
    public String createDatareg(@ModelAttribute Datareg datareg) {
        dataregService.createDatareg(datareg);
        return "redirect:/";
    }
}
