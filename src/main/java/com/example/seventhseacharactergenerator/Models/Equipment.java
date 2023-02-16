package com.example.seventhseacharactergenerator.Models;

public class Equipment {
    private int id;
    private String name;
    private int cost;
    private int quantity;

    /**
     * @param id
     * @param name
     * @param cost
     * @param quantity
     */
    public Equipment(int id, String name, int cost, int quantity) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
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
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
