package com.example.bilapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/datareg")
public class dataregController {
    @GetMapping
    public List<Datareg>hello() {
        return List.of(
                new Datareg(
                        12,
                        "Bob",
                        "bobby",
                        "hejhej@email.com"

                )
        );
    }
}
