package com.example.seventhseacharactergenerator.Models;

public class SwordsmanKnack {

    private int id;
    private int skill_id;
    private int school_id;
    private String name;
    private int knackLevel;
    private String description;

    /**
     *
     */
    public SwordsmanKnack() {
    }

    /**
     * @param id
     * @param skill_id
     * @param school_id
     * @param name
     * @param knackLevel
     * @param description
     */
    public SwordsmanKnack(int id, int skill_id, int school_id, String name, int knackLevel, String description) {
        this.id = id;
        this.skill_id = skill_id;
        this.school_id = school_id;
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
    public int getSkill_id() {
        return skill_id;
    }

    /**
     * @param skill_id
     */
    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    /**
     * @return
     */
    public int getSchool_id() {
        return school_id;
    }

    /**
     * @param school_id
     */
    public void setSchool_id(int school_id) {
        this.school_id = school_id;
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
        return "SwordsmanKnack{" +
                "id=" + id +
                ", skill_id=" + skill_id +
                ", school_id=" + school_id +
                ", name='" + name + '\'' +
                ", knackLevel=" + knackLevel +
                ", description='" + description + '\'' +
                '}';
    }
}
