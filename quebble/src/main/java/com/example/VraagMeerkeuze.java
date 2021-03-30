package com.example;

import java.util.ArrayList;

//TODO: split the answers and the question
public class VraagMeerkeuze implements Vraag {
    private String vraag;
    private String antwoord;
    private String verdienenLetter;
    private String antwoordA;
    private String antwoordB;
    private String antwoordC;
    private String antwoordD;

    public VraagMeerkeuze(String vraag, String antwoord, String verdienenLetter, String antwoordA, String antwoordB, String antwoordC, String antwoordD) {
        this.vraag = vraag;
        this.antwoord = antwoord;
        this.verdienenLetter = verdienenLetter;
        this.antwoordA = antwoordA;
        this.antwoordB = antwoordB;
        this.antwoordC = antwoordC;
        this.antwoordD = antwoordD;
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

    public String getAntwoordA() {
        return antwoordA;
    }

    public void setAntwoordA(String antwoordA) {
        this.antwoordA = antwoordA;
    }

    public String getAntwoordB() {
        return antwoordB;
    }

    public void setAntwoordB(String antwoordB) {
        this.antwoordB = antwoordB;
    }

    public String getAntwoordC() {
        return antwoordC;
    }

    public void setAntwoordC(String antwoordC) {
        this.antwoordC = antwoordC;
    }

    public String getAntwoordD() {
        return antwoordD;
    }

    public void setAntwoordD(String antwoordD) {
        this.antwoordD = antwoordD;
    }

    public ArrayList<String> getAntwoorden() {
        ArrayList<String> antwoorden = new ArrayList<>();

        antwoorden.add(antwoordA);
        antwoorden.add(antwoordB);
        antwoorden.add(antwoordC);
        antwoorden.add(antwoordD);

        return antwoorden;
    }
}
