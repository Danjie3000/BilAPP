package com.example.bilapp.services;

import com.example.bilapp.models.Datareg;
import com.example.bilapp.repositories.DataregRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataregService {

    @Autowired
    DataregRepository dataregRepository;


    public void createDatareg(Datareg datareg) {
        dataregRepository.createDatareg(datareg);
    }
}
