package com.example.seventhseacharactergenerator.Models;

public class Advantages {
    private int id;
    private String name;
    private int cost;
    private String description;

    /**
     * Constructor creates an advantage
     *
     * @param id
     * @param name
     * @param cost
     * @param description
     */
    public Advantages(int id, String name, int cost, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
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
    public int getCost() {
        return cost;
    }

    /**
     * @param cost
     */
    public void setCost(int cost) {
        this.cost = cost;
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
}
