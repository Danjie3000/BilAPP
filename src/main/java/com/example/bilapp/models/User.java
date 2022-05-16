package com.example.bilapp.models;

public class User {

    private int id;
    private String password;
    private String firstName; // Tror ikke disse skal benyttes.
    private String lastName; // Tror ikke disse skal benyttes.

    public User(int id, String password) {
        this.id = id;
        this.password = password;
    }

}
