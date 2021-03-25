package com.example.domain;

public class Speler {
    private String gebruikersnaam;
    private int balans;

    public Speler(String gebruikersnaam, int balans) {
        this.gebruikersnaam = gebruikersnaam;
        this.balans = balans;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public int getBalans() {
        return balans;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }
}
