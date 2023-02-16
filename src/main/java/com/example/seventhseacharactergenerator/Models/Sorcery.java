package com.example.seventhseacharactergenerator.Models;

import javafx.collections.ObservableList;

public class Sorcery {
    private int id;
    private String name;
    private String description;
    private ObservableList<SorceryDegree> degrees;
    private ObservableList<SorceryKnack> knacks;

    /**
     *
     */
    public Sorcery() {

    }

    /**
     * @param id
     * @param name
     * @param description
     */
    public Sorcery(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */
    public ObservableList<SorceryDegree> getDegrees() {
        return degrees;
    }

    /**
     * @param degrees
     */
    public void setDegrees(ObservableList<SorceryDegree> degrees) {
        this.degrees = degrees;
    }

    /**
     * @return
     */
    public ObservableList<SorceryKnack> getKnacks() {
        return knacks;
    }

    /**
     * @param knacks
     */
    public void setKnacks(ObservableList<SorceryKnack> knacks) {
        this.knacks = knacks;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return name;
    }


}
