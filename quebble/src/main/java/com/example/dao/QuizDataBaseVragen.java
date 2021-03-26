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

    Vraag v9 = new VraagMeerkeuze("Wat is de hoofdstad van Peru?","C",
            "A) Arequipa",
            "B) Caracas",
            "C) Lima",
            "D) Santiago");

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

        return vragen;
    }
}
