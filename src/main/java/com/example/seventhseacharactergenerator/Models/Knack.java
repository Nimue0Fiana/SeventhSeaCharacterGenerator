package com.example.seventhseacharactergenerator.Models;

public class Knack {
    private int id;
    private String name;
    private int knackLevel;
    private boolean isAdvanced;
    private String description;
    private int heroPoints;

    public Knack(int id, String name, int knackLevel, boolean isAdvanced, String description, int heroPoints) {
        this.id = id;
        this.name = name;
        this.knackLevel = knackLevel;
        this.isAdvanced = isAdvanced;
        this.description = description;
        this.heroPoints = heroPoints;
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

    public boolean isAdvanced() {
        return isAdvanced;
    }

    public void setAdvanced(boolean advanced) {
        isAdvanced = advanced;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeroPoints() {
        return heroPoints;
    }

    public void setHeroPoints(int heroPoints) {
        this.heroPoints = heroPoints;
    }
}
