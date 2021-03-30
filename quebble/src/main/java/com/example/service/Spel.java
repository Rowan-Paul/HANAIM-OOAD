package com.example.service;

import com.example.Console;
import com.example.dao.QuizDatabaseMock;
import com.example.domain.*;

import java.io.IOException;
import java.util.ArrayList;

public class Spel {
    Console console = new Console();
    Speler speler = new Speler("sjaak",1000);
    ArrayList<Integer> gespeeldeQuizzes = speler.getGespeeldeQuizzes();
    QuizDatabaseMock quizDB = new QuizDatabaseMock();

    public void setup() throws IOException {
        System.out.println("Welkom " + speler.getGebruikersnaam());
        System.out.println("Je balans is: " + speler.getBalans() + "\n");
        System.out.println("Voer \"start\" in om een nieuwe quiz te starten");

        if(console.read().equals("start")){
            if(checkBalans()) {
                speler.setBalans(speler.getBalans()-40);
                System.out.println("40 credits van je balans afgehaald");
                System.out.println("Quiz zoeken...");

                speelQuiz();
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

    public void speelQuiz() throws IOException {
        Quiz nieuweQuiz = getNieuweQuiz();

        ArrayList<Antwoord> antwoorden = laatVragenZien(nieuweQuiz.getVragen());
        System.out.println("\nAntwoorden controleren...");
        ArrayList<Letter> letters = controleerVragen(antwoorden);

        System.out.print("\nMaak een woord met deze letters:");
        for (Letter letter : letters) {
            System.out.print(" " + letter.getLetter());
        }
    }

    public Quiz getNieuweQuiz() {
        ArrayList<Quiz> quizzes = quizDB.getQuizzes();
        Quiz nieuweQuiz = null;

        for(Quiz quiz : quizzes) {
            if(!speler.getGespeeldeQuizzes().contains(quiz.getId())) {
                nieuweQuiz = quiz;
                gespeeldeQuizzes.add(quiz.getId());
                speler.setGespeeldeQuizzes(gespeeldeQuizzes);
                break;
            }
        }

        return nieuweQuiz;
    }

    public ArrayList<Antwoord> laatVragenZien(ArrayList<Vraag> vragen) throws IOException {
        ArrayList<Antwoord> antwoorden = new ArrayList<>();

        for(Vraag vraag : vragen) {
            System.out.println("\nVraag: " + vraag.getVraag());

            if(vraag instanceof VraagMeerkeuze) {
                VraagMeerkeuze meerkeuzeVraag = (VraagMeerkeuze) vraag;

                System.out.println("Antwoorden: ");
                for(String antwoord : meerkeuzeVraag.getAntwoorden()) {
                    System.out.println(antwoord);
                }
            }

            Antwoord antwoord = new Antwoord(console.read(),vraag,speler);
            antwoorden.add(antwoord);
        }

        return antwoorden;
    }

    public ArrayList<Letter> controleerVragen(ArrayList<Antwoord> antwoorden) {
        ArrayList<Letter> letters = new ArrayList<>();
        int antwoordenGoed = 0;

        for(Antwoord antwoord : antwoorden) {
            if(antwoord.getAntwoord().equals(antwoord.getVraag().getAntwoord())) {
                //TODO: return letter which can make a word (first letter of answer)
                Letter letter = new Letter(antwoord.getVraag().getVerdienenLetter());
                letters.add(letter);
                antwoordenGoed++;
            }
        }

        System.out.println("Antwoorden goed: " + antwoordenGoed);

        return letters;
    }
}
