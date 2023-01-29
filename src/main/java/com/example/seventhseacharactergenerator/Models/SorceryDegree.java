package com.example.seventhseacharactergenerator.Models;

public class SorceryDegree {

    private int id;
    private int sorcery_id;
    private int degree;
    private String name;
    private String description;

    public SorceryDegree() {
    }

    public SorceryDegree(int id, int degree, String name, String description) {
        this.id = id;
        this.degree = degree;
        this.name = name;
        this.description = description;
    }

    public SorceryDegree(int id, int sorcery_id, int degree, String name, String description) {
        this.id = id;
        this.sorcery_id = sorcery_id;
        this.degree = degree;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSorcery_id() {
        return sorcery_id;
    }

    public void setSorcery_id(int sorcery_id) {
        this.sorcery_id = sorcery_id;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
