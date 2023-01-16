package com.example.seventhseacharactergenerator.Models;

public class Nation {
    private int id;
    private String nation_name;
    private String favored_trait;
    private String description;

    public Nation(int id, String nation_name, String favored_trait, String description) {
        this.id = id;
        this.nation_name = nation_name;
        this.favored_trait = favored_trait;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNation_name() {
        return nation_name;
    }

    public void setNation_name(String nation_name) {
        this.nation_name = nation_name;
    }

    public String getFavored_trait() {
        return favored_trait;
    }

    public void setFavored_trait(String favored_trait) {
        this.favored_trait = favored_trait;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
