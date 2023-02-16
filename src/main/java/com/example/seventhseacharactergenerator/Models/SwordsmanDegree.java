package com.example.seventhseacharactergenerator.Models;

public class SwordsmanDegree {
    private int id;
    private int swordsman_school_id; //not sure this one is necessary
    private String degree;
    private String description;

    /**
     *
     */
    public SwordsmanDegree() {
    }

    /**
     * @param id
     * @param degree
     * @param description
     */
    public SwordsmanDegree(int id, String degree, String description) {
        this.id = id;
        this.degree = degree;
        this.description = description;
    }

    /**
     * @param id
     * @param swordsman_school_id
     * @param degree
     * @param description
     */
    public SwordsmanDegree(int id, int swordsman_school_id, String degree, String description) {
        this.id = id;
        this.swordsman_school_id = swordsman_school_id;
        this.degree = degree;
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
    public int getSwordsman_school_id() {
        return swordsman_school_id;
    }

    /**
     * @param swordsman_school_id
     */
    public void setSwordsman_school_id(int swordsman_school_id) {
        this.swordsman_school_id = swordsman_school_id;
    }

    /**
     * @return
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
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
        return "SwordsmanDegree{" +
                "id=" + id +
                ", swordsman_school_id=" + swordsman_school_id +
                ", degree='" + degree + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
