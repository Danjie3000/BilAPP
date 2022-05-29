package com.example.bilapp.models;

public class Datareg { // Her inde skal der være de HTML'er som har med denne bruger at gøre.
    private int id;
    private String fornavn;
    private String efternavn;
    private int telefon_nummer;
    private String email;
    private int kunde_id;
    private String abonnement;
    private int vogn_nummer_id;
    private int stel_nummer;
    private double pris;

    public Datareg(String fornavn, String efternavn, int telefonnummer, String email, int kunde_id, String abonnement, int vogn_nummer_id, int stel_nummer, double pris) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.telefon_nummer = telefonnummer;
        this.email = email;
        this.kunde_id = kunde_id;
        this.abonnement = abonnement;
        this.vogn_nummer_id = vogn_nummer_id;
        this.stel_nummer = stel_nummer;
        this.pris = pris;
    }

    public Datareg(int id, String fornavn, String efternavn, int telefonnummer, String email, int kunde_id, String abonnement, int vogn_nummer_id, int stel_nummer, double pris) {
        this.id = id;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.telefon_nummer = telefonnummer;
        this.email = email;
        this.kunde_id = kunde_id;
        this.abonnement = abonnement;
        this.vogn_nummer_id = vogn_nummer_id;
        this.stel_nummer = stel_nummer;
        this.pris = pris;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getTelefon_nummer() {
        return telefon_nummer;
    }

    public void setTelefon_nummer(int telefon_nummer) {
        this.telefon_nummer = telefon_nummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getKunde_id() {
        return kunde_id;
    }

    public void setKunde_id(int kunde_id) {
        this.kunde_id = kunde_id;
    }

    public String getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(String abonnement) {
        this.abonnement = abonnement;
    }

    public int getVogn_nummer_id() {
        return vogn_nummer_id;
    }

    public void setVogn_nummer_id(int vogn_nummer_id) {
        this.vogn_nummer_id = vogn_nummer_id;
    }

    public int getStel_nummer() {
        return stel_nummer;
    }

    public void setStel_nummer(int stel_nummer) {
        this.stel_nummer = stel_nummer;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

}
