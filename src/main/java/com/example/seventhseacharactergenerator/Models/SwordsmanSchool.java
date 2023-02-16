package com.example.seventhseacharactergenerator.Models;

public class SwordsmanSchool {
    private int id;
    private String name;
    private Nation nation;
    private String description;

    /**
     *
     */
    public SwordsmanSchool() {
    }

    /**
     * @param id
     * @param name
     * @param nation
     * @param description
     */
    public SwordsmanSchool(int id, String name, Nation nation, String description) {
        this.id = id;
        this.name = name;
        this.nation = nation;
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
    public Nation getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(Nation nation) {
        this.nation = nation;
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
        return name;
    }
}
