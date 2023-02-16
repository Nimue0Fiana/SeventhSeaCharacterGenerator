package com.example.seventhseacharactergenerator.Models;

public class SorceryDegree {

    private int id;
    private int sorcery_id;
    private int degree;
    private String name;
    private String description;

    /**
     *
     */
    public SorceryDegree() {
    }

    /**
     * @param id
     * @param degree
     * @param name
     * @param description
     */
    public SorceryDegree(int id, int degree, String name, String description) {
        this.id = id;
        this.degree = degree;
        this.name = name;
        this.description = description;
    }

    /**
     * @param id
     * @param sorcery_id
     * @param degree
     * @param name
     * @param description
     */
    public SorceryDegree(int id, int sorcery_id, int degree, String name, String description) {
        this.id = id;
        this.sorcery_id = sorcery_id;
        this.degree = degree;
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
    public int getSorcery_id() {
        return sorcery_id;
    }

    /**
     * @param sorcery_id
     */
    public void setSorcery_id(int sorcery_id) {
        this.sorcery_id = sorcery_id;
    }

    /**
     * @return
     */
    public int getDegree() {
        return degree;
    }

    /**
     * @param degree
     */
    public void setDegree(int degree) {
        this.degree = degree;
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
}
