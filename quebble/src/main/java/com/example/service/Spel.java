package com.example.service;

import com.example.Console;
import com.example.dao.QuizDatabaseMock;
import com.example.domain.Quiz;
import com.example.domain.Speler;

import java.io.IOException;
import java.util.ArrayList;

public class Spel {
    Console console = new Console();
    Speler speler = new Speler("sjaak",1000);

    public void setup() throws IOException {
        System.out.println("Welkom " + speler.getGebruikersnaam());
        System.out.println("Je balans is: " + speler.getBalans() + "\n");
        System.out.println("Voer \"start\" in om een nieuwe quiz te starten");

        if(console.read().equals("start")){
            if(checkBalans()) {
                speler.setBalans(40);
                System.out.println("40 credits van je balans afgehaald");
                System.out.println("QuizDatabase zoeken...");
//                QuizDatabase quiz = new QuizDatabase(speler);
            } else {
                System.out.println("Niet genoeg balans...");
            }
        }
    }

    public boolean checkBalans() {
        if(speler.getBalans() > 40) {
            return true;
        } else {
            return false;
        }
    }
}
