package com.example.seventhseacharactergenerator.Models;

public class SwordsmanKnack {

    private int id;
    private int skill_id;
    private int school_id;
    private String name;
    private int knackLevel;
    private String description;

    public SwordsmanKnack() {
    }

    public SwordsmanKnack(int id, int skill_id, int school_id, String name, int knackLevel, String description) {
        this.id = id;
        this.skill_id = skill_id;
        this.school_id = school_id;
        this.name = name;
        this.knackLevel = knackLevel;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKnackLevel() {
        return knackLevel;
    }

    public void setKnackLevel(int knackLevel) {
        this.knackLevel = knackLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
