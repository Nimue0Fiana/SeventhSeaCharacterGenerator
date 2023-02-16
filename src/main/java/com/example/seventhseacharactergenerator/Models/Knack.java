package com.example.seventhseacharactergenerator.Models;

public class Knack {
    private int id;
    private int skill_id;
    private String name;
    private int knackLevel;
    private boolean isAdvanced;
    private String description;

    /**
     *
     * @param id
     * @param skill_id
     * @param name
     * @param isAdvanced
     * @param description
     */
    public Knack(int id, int skill_id, String name, boolean isAdvanced, String description) {
        this.id = id;
        this.skill_id = skill_id;
        this.name = name;
        this.isAdvanced = isAdvanced;
        this.description = description;
    }

    /**
     *
     * @param id
     * @param skill_id
     * @param name
     * @param knackLevel
     * @param isAdvanced
     * @param description
     */
    public Knack(int id, int skill_id, String name, int knackLevel, boolean isAdvanced, String description) {
        this.id = id;
        this.skill_id = skill_id;
        this.name = name;
        this.knackLevel = knackLevel;
        this.isAdvanced = isAdvanced;
        this.description = description;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public int getSkill_id() {
        return skill_id;
    }

    /**
     *
     * @param skill_id
     */
    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getKnackLevel() {
        return knackLevel;
    }

    /**
     *
     * @param knackLevel
     */
    public void setKnackLevel(int knackLevel) {
        this.knackLevel = knackLevel;
    }

    /**
     *
     * @return
     */
    public boolean isAdvanced() {
        return isAdvanced;
    }

    /**
     *
     * @param advanced
     */
    public void setAdvanced(boolean advanced) {
        isAdvanced = advanced;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Knack{" +
                ", name='" + name + '\'' +
                ", knackLevel=" + knackLevel +
                '}';
    }
}
