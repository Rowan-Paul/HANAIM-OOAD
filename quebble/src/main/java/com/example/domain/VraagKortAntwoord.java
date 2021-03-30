package com.example.domain;

public class VraagKortAntwoord implements Vraag {
    private String vraag;
    private String antwoord;
    private String verdienenLetter;

    public VraagKortAntwoord(String vraag, String antwoord, String verdienenLetter) {
        this.vraag = vraag;
        this.antwoord = antwoord;
        this.verdienenLetter = verdienenLetter;
    }

    @Override
    public String getVraag() {
        return vraag;
    }

    @Override
    public void setVraag(String vraag) {
        this.vraag = vraag;
    }

    @Override
    public String getAntwoord() {
        return antwoord;
    }

    @Override
    public void setAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    @Override
    public String getVerdienenLetter() {
        return verdienenLetter;
    }

    @Override
    public void setVerdienenLetter(String verdienenLetter) {
        this.verdienenLetter = verdienenLetter;
    }
}
