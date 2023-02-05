package com.example.seventhseacharactergenerator.Models;

public class Knack {
    private int id;
    private int skill_id;
    private String name;
    private int knackLevel;
    private boolean isAdvanced;
    private String description;

    public Knack(int id, int skill_id, String name, boolean isAdvanced, String description) {
        this.id = id;
        this.skill_id = skill_id;
        this.name = name;
        this.isAdvanced = isAdvanced;
        this.description = description;
    }

    public Knack(int id, int skill_id, String name, int knackLevel, boolean isAdvanced, String description) {
        this.id = id;
        this.skill_id = skill_id;
        this.name = name;
        this.knackLevel = knackLevel;
        this.isAdvanced = isAdvanced;
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

    public boolean isAdvanced() {
        return isAdvanced;
    }

    public void setAdvanced(boolean advanced) {
        isAdvanced = advanced;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Knack{" +
                ", name='" + name + '\'' +
                ", knackLevel=" + knackLevel +
                '}';
    }
}
