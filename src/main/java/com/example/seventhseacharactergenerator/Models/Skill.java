package com.example.seventhseacharactergenerator.Models;

import javafx.collections.ObservableList;

public class Skill {
    private int id;
    private String name;
    private ObservableList<Knack> knacks;

    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObservableList<Knack> getKnacks() {
        return knacks;
    }

    public void setKnacks(ObservableList<Knack> knacks) {
        this.knacks = knacks;
    }
}
