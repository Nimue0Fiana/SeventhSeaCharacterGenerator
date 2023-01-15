package com.example.seventhseacharactergenerator.models;

import javafx.collections.ObservableList;

public class Skill {
    private int id;
    private String name;
    private boolean isMartial;
    private ObservableList<Knack> knacks;

    public Skill(int id, String name, boolean isMartial) {
        this.id = id;
        this.name = name;
        this.isMartial = isMartial;
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

    public boolean isMartial() {
        return isMartial;
    }

    public void setMartial(boolean martial) {
        isMartial = martial;
    }

    public ObservableList<Knack> getKnacks() {
        return knacks;
    }

    public void setKnacks(ObservableList<Knack> knacks) {
        this.knacks = knacks;
    }
}
