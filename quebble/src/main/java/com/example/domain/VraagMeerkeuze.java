package com.example.domain;

public class VraagMeerkeuze implements Vraag {
    private String vraag;
    private String antwoord;

    public VraagMeerkeuze(String vraag, String antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
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
}
