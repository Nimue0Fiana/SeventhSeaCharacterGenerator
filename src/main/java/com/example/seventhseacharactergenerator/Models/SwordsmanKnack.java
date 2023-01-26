package com.example.seventhseacharactergenerator.Models;

public class SwordsmanKnack {

    private int id;
    private String name;
    private int knackLevel;
    private String description;

    public SwordsmanKnack() {
    }

    public SwordsmanKnack(int id, String name, int knackLevel, String description) {
        this.id = id;
        this.name = name;
        this.knackLevel = knackLevel;
        this.description = description;
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

    public int getKnackLevel() {
        return knackLevel;
    }

    public void setKnackLevel(int knackLevel) {
        this.knackLevel = knackLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
