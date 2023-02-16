package com.example.seventhseacharactergenerator.Models;

public class SorceryKnack {
    private int id;
    private String name;
    private int knackLevel;
    private String description;

    /**
     *
     */
    public SorceryKnack() {
    }

    /**
     * @param id
     * @param name
     * @param description
     */
    public SorceryKnack(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * @param id
     * @param name
     * @param knackLevel
     * @param description
     */
    public SorceryKnack(int id, String name, int knackLevel, String description) {
        this.id = id;
        this.name = name;
        this.knackLevel = knackLevel;
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
    public int getKnackLevel() {
        return knackLevel;
    }

    /**
     * @param knackLevel
     */
    public void setKnackLevel(int knackLevel) {
        this.knackLevel = knackLevel;
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
    @Override
    public String toString() {
        return "SorceryKnack{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", knackLevel=" + knackLevel +
                ", description='" + description + '\'' +
                '}';
    }
}
