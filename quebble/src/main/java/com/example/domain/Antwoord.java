package com.example.domain;

public class Antwoord {
    private String antwoord;
    private Vraag vraag;
    private Speler speler;

    public Antwoord(String antwoord, Vraag vraag, Speler speler) {
        this.antwoord = antwoord;
        this.vraag = vraag;
        this.speler = speler;
    }

    public String getAntwoord() {
        return antwoord;
    }

    public void setAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    public Vraag getVraag() {
        return vraag;
    }

    public void setVraag(Vraag vraag) {
        this.vraag = vraag;
    }

    public Speler getSpeler() {
        return speler;
    }

    public void setSpeler(Speler speler) {
        this.speler = speler;
    }
}
