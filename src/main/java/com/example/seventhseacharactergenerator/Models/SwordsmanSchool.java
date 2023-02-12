package com.example.seventhseacharactergenerator.Models;

public class SwordsmanSchool {
    private int id;
    private String name;
    private Nation nation;
    private String description;

    public SwordsmanSchool() {
    }

    public SwordsmanSchool(int id, String name, Nation nation, String description) {
        this.id = id;
        this.name = name;
        this.nation = nation;
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

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }
}
