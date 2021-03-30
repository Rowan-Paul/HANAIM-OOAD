package com.example.domain;

import java.util.ArrayList;

public class Quiz {
    private int id;
    private ArrayList<Vraag> vragen;

    public Quiz(int id, ArrayList<Vraag> vragen) {
        this.id = id;
        this.vragen = vragen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Vraag> getVragen() {
        return vragen;
    }

    public void setVragen(ArrayList<Vraag> vragen) {
        this.vragen = vragen;
    }
}
