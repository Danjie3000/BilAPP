package com.example.bilapp.services;

import com.example.bilapp.controller.Datareg;

import java.util.List;

public class SkadeService {
    public List<Datareg> hello() {
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
