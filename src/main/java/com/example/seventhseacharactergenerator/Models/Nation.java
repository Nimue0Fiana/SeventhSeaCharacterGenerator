package com.example.seventhseacharactergenerator.Models;

public class Nation {
    private int id;
    private String nation_name;
    private String favored_trait;
    private String description;
    private Sorcery sorcery;

    /**
     * @param id
     * @param nation_name
     * @param favored_trait
     * @param description
     * @param sorcery
     */
    public Nation(int id, String nation_name, String favored_trait, String description, Sorcery sorcery) {
        this.id = id;
        this.nation_name = nation_name;
        this.favored_trait = favored_trait;
        this.description = description;
        this.sorcery = sorcery;
    }

    /**
     * @param id
     * @param nation_name
     * @param favored_trait
     * @param description
     */
    public Nation(int id, String nation_name, String favored_trait, String description) {
        this.id = id;
        this.nation_name = nation_name;
        this.favored_trait = favored_trait;
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
    public String getNation_name() {
        return nation_name;
    }

    /**
     * @param nation_name
     */
    public void setNation_name(String nation_name) {
        this.nation_name = nation_name;
    }

    /**
     * @return
     */
    public String getFavored_trait() {
        return favored_trait;
    }

    /**
     * @param favored_trait
     */
    public void setFavored_trait(String favored_trait) {
        this.favored_trait = favored_trait;
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
    public Sorcery getSorcery() {
        return sorcery;
    }

    /**
     * @param sorcery
     */
    public void setSorcery(Sorcery sorcery) {
        this.sorcery = sorcery;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Nation{" +
                "id=" + id +
                ", nation_name='" + nation_name + '\'' +
                ", favored_trait='" + favored_trait + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
