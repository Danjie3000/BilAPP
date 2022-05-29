package com.example.bilapp.repositories;

import com.example.bilapp.models.Datareg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DataregRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

   public void createDatareg(Datareg datareg) {
        String SQL = "INSERT INTO dataregistrering VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(SQL, datareg.getFornavn(), datareg.getEfternavn(), datareg.getTelefon_nummer(), datareg.getEmail(), datareg.getKunde_id(), datareg.getAbonnement(), datareg.getVogn_nummer_id(), datareg.getStel_nummer(), datareg.getPris());

    }
}
