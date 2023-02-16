package com.example.seventhseacharactergenerator.Models;

import javafx.collections.ObservableList;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class PlayerCharacter {
    private int id;
    private boolean isSorcerer;
    private boolean isSwordsman;
    private String name;
    private String player;
    private int heroPoints;
    private String gender;
    private Nation nation;
    private String nationName;
    private LocalDateTime createDate;
    private int brawn;
    private int finesse;
    private int wits;
    private int resolve;
    private int panache;
    private ObservableList<Skill> skills;
    private ObservableList<Knack> knacks;
    private ObservableList<Equipment> equipment;
    private ObservableList<Advantages> advantages;

    /**
     *
     */
    public PlayerCharacter() {
    }

    /**
     * @param id
     * @param name
     * @param player
     * @param heroPoints
     * @param gender
     * @param nation
     * @param brawn
     * @param finesse
     * @param wits
     * @param resolve
     * @param panache
     */
    public PlayerCharacter(int id, String name, String player, int heroPoints, String gender, Nation nation, int brawn, int finesse, int wits, int resolve, int panache) {
        this.id = id;
        this.name = name;
        this.player = player;
        this.heroPoints = heroPoints;
        this.gender = gender;
        this.nation = nation;
        this.brawn = brawn;
        this.finesse = finesse;
        this.wits = wits;
        this.resolve = resolve;
        this.panache = panache;
    }

    /**
     * @param id
     * @param name
     * @param player
     * @param gender
     * @param nationName
     * @param heroPoints
     * @param createDate
     */
    public PlayerCharacter(int id, String name, String player, String gender, String nationName, int heroPoints, LocalDateTime createDate) {
        this.id = id;
        this.name = name;
        this.player = player;
        this.gender = gender;
        this.nationName = nationName;
        this.heroPoints = heroPoints;
        this.createDate = createDate;
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
    public String getPlayer() {
        return player;
    }

    /**
     * @param player
     */
    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     * @return
     */
    public int getHeroPoints() {
        return heroPoints;
    }

    /**
     * @param heroPoints
     */
    public void setHeroPoints(int heroPoints) {
        this.heroPoints = heroPoints;
    }

    /**
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
    public int getBrawn() {
        return brawn;
    }

    /**
     * @param brawn
     */
    public void setBrawn(int brawn) {
        this.brawn = brawn;
    }

    /**
     * @return
     */
    public int getFinesse() {
        return finesse;
    }

    /**
     * @param finesse
     */
    public void setFinesse(int finesse) {
        this.finesse = finesse;
    }

    /**
     * @return
     */
    public int getWits() {
        return wits;
    }

    /**
     * @param wits
     */
    public void setWits(int wits) {
        this.wits = wits;
    }

    /**
     * @return
     */
    public int getResolve() {
        return resolve;
    }

    /**
     * @param resolve
     */
    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    /**
     * @return
     */
    public int getPanache() {
        return panache;
    }

    /**
     * @param panache
     */
    public void setPanache(int panache) {
        this.panache = panache;
    }

    /**
     * @return
     */
    public ObservableList<Skill> getSkills() {
        return skills;
    }

    /**
     * @param skills
     */
    public void setSkills(ObservableList<Skill> skills) {
        this.skills = skills;
    }

    /**
     * @return
     */
    public ObservableList<Knack> getKnacks() {
        return knacks;
    }

    /**
     * @param knacks
     */
    public void setKnacks(ObservableList<Knack> knacks) {
        this.knacks = knacks;
    }

    /**
     * @return
     */
    public ObservableList<Equipment> getEquipment() {
        return equipment;
    }

    /**
     * @param equipment
     */
    public void setEquipment(ObservableList<Equipment> equipment) {
        this.equipment = equipment;
    }

    /**
     * @return
     */
    public ObservableList<Advantages> getAdvantages() {
        return advantages;
    }

    /**
     * @param advantages
     */
    public void setAdvantages(ObservableList<Advantages> advantages) {
        this.advantages = advantages;
    }

    /**
     * @return
     */
    public boolean isSorcerer() {
        return isSorcerer;
    }

    /**
     * @param sorcerer
     */
    public void setSorcerer(boolean sorcerer) {
        isSorcerer = sorcerer;
    }

    /**
     * @return
     */
    public boolean isSwordsman() {
        return isSwordsman;
    }

    /**
     * @param swordsman
     */
    public void setSwordsman(boolean swordsman) {
        isSwordsman = swordsman;
    }

    /**
     * @return
     */
    public String getNationName() {
        return nationName;
    }

    /**
     * @param nationName
     */
    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    /**
     * @return
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "PlayerCharacter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", player='" + player + '\'' +
                ", heroPoints=" + heroPoints +
                ", gender='" + gender + '\'' +
                ", nation=" + nation +
                ", brawn=" + brawn +
                ", finesse=" + finesse +
                ", wits=" + wits +
                ", resolve=" + resolve +
                ", panache=" + panache +
                ", skills=" + skills +
                ", knacks=" + knacks +
                ", equipment=" + equipment +
                ", advantages=" + advantages +
                '}';
    }
}
