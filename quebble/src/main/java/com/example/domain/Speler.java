package com.example.domain;

import java.util.ArrayList;

public class Speler {
    private String gebruikersnaam;
    private int balans;
    private ArrayList<Antwoord> antwoorden;

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

    public ArrayList<Antwoord> getAntwoorden() {
        return antwoorden;
    }

    public void setAntwoorden(ArrayList<Antwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }
}
