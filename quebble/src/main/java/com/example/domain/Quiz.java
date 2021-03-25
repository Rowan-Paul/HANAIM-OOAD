package com.example.domain;

import java.util.ArrayList;
import java.util.UUID;

public class Quiz {
    private String id;
    private ArrayList<Vraag> vragen;

    public Quiz(ArrayList<Vraag> vragen) {
        this.id = UUID.randomUUID().toString();
        this.vragen = vragen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Vraag> getVragen() {
        return vragen;
    }

    public void setVragen(ArrayList<Vraag> vragen) {
        this.vragen = vragen;
    }
}
