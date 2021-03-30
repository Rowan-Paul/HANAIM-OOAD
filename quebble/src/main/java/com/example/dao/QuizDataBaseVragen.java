package com.example.dao;

import com.example.domain.Vraag;
import com.example.domain.VraagKortAntwoord;
import com.example.domain.VraagMeerkeuze;

import java.util.ArrayList;

public class QuizDataBaseVragen {
    Vraag v1 = new VraagKortAntwoord("Hoe laat begint lunch?","12 uur");
    Vraag v2 = new VraagKortAntwoord("Waar staat RAM voor?", "Random Access Memory");
    Vraag v3 = new VraagKortAntwoord("Wat is de grootste orgaan van de mens?","Lever");
    Vraag v4 = new VraagKortAntwoord("Welk Afrikaans dier doodt de meeste mensen?","Krokodil");
    Vraag v5 = new VraagKortAntwoord("Waar of niet waar: haaien knipperen niet","Waar");
    Vraag v6 = new VraagKortAntwoord("Hoeveel ogen heeft een bij?","5");
    Vraag v7 = new VraagKortAntwoord("Hoe heten de 2 huurmoordenaars in Pulp Fiction",
            "Vincent Vega & Jules Winnfield");
    Vraag v8 = new VraagKortAntwoord("Wie speelde Mr Freeze in Batman and Robin?",
            "Arnold Schwarzenegger");

    Vraag v9 = new VraagMeerkeuze("Wat is de hoofdstad van Peru?",
            "C",
            "A) Arequipa",
            "B) Caracas",
            "C) Lima",
            "D) Santiago");
    Vraag v10 = new VraagMeerkeuze("Hoe heet de officieuze landenkampioenschap tennis voor mannen?",
            "A",
            "A) Davis Cup",
            "B) Diamond League",
            "C) Fed Cup",
            "D) Nations League");
    Vraag v11 = new VraagMeerkeuze("Wat is de voornaam van de schepper van Miss Marple en Hercule Poirot?",
            "D",
            "A) Ruth",
            "B) Emmy",
            "C) Joanne",
            "D) Agatha");
    Vraag v12 = new VraagMeerkeuze("Welke van de volgende Engelse voetbalclub is afkomstig uit Liverpool?",
            "C",
            "A) Arsenal",
            "B) Chelsea",
            "C) Everton",
            "D) Dottenham Hotspur");
    Vraag v13 = new VraagMeerkeuze("Wat is de hoofdstad van het Franse departement Vaucluse die we kennen uit"+
            "een heel bekend liedje over een brug?", "B",
            "A) Parijs",
            "B) Avignon",
            "C) Keulen",
            "D) Port-au-Prince");
    Vraag v14 = new VraagMeerkeuze("Welke band stond in 2008 in de hitparade met de song Viva La Vida?",
            "C",
            "A) Kensington",
            "B) One Direction",
            "C) Coldplay",
            "D) Hotplay");
    Vraag v15 = new VraagMeerkeuze("Wat is de bijnaam van de Conservatieve Partij in Engeland?",
            "A",
            "A) Tory, Torries, The Tories",
            "B) Red hats",
            "C) Tobies",
            "D) Tonies");
    Vraag v16 = new VraagMeerkeuze("Wat stad ligt in twee continenten?",
            "A",
            "A) Instanboel",
            "B) Istanbon",
            "C) Constantinopel",
            "D) shenzhen");

    public ArrayList<Vraag> getAllVragen() {
        ArrayList<Vraag> vragen = new ArrayList<>();

        //TODO: make this loopy loop
        vragen.add(v1);
        vragen.add(v9);
        vragen.add(v3);
        vragen.add(v4);
        vragen.add(v5);
        vragen.add(v6);
        vragen.add(v7);
        vragen.add(v8);
        vragen.add(v9);
        vragen.add(v10);
        vragen.add(v11);
        vragen.add(v12);
        vragen.add(v13);
        vragen.add(v14);
        vragen.add(v15);
        vragen.add(v16);

        return vragen;
    }
}
