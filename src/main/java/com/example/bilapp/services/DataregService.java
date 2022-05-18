package com.example.bilapp.services;

import com.example.bilapp.controller.Datareg;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataregService {

    public List<Datareg> getDatareg() {
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
