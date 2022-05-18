package com.example.bilapp.controller;

public class Datareg { // Her inde skal der være de HTML'er som har med denne bruger at gøre.
    private int id;
    private String name;
    private String car;
    private String email;

    public Datareg() {
    }

    public Datareg(int id, String name, String car, String email) {
        this.id = id;
        this.name = name;
        this.car = car;
        this.email = email;
    }

    public Datareg(String name, String car, String email) {
        this.name = name;
        this.car = car;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DataregController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car='" + car + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
