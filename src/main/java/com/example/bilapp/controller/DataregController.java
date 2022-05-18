package com.example.bilapp.controller;

import com.example.bilapp.services.DataregService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/datareg")
public class DataregController {

    private final DataregService dataregService;

    @Autowired
    public DataregController(DataregService dataregService) {
        this.dataregService = dataregService;
    }

    @GetMapping
    public List<Datareg> getDatareg() {
        return dataregService.getDatareg();
    }
}
