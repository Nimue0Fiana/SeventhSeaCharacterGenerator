package com.example.seventhseacharactergenerator.Models;

import javafx.collections.ObservableList;

public class Skill {
    private int id;
    private String name;
    private ObservableList<Knack> knacks;

    /**
     * @param id
     * @param name
     */
    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public ObservableList<Knack> getKnacks() {
        return knacks;
    }

    /**
     * @param knacks
     */
    public void setKnacks(ObservableList<Knack> knacks) {
        this.knacks = knacks;
    }
}
