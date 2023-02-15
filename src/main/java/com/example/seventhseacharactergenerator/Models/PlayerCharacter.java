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

    public PlayerCharacter(){
    }
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

    public PlayerCharacter(String name, String player, String gender, String nationName, int heroPoints, LocalDateTime createDate) {
        this.name= name;
        this.player = player;
        this.gender = gender;
        this.nationName= nationName;
        this.heroPoints= heroPoints;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getHeroPoints() {
        return heroPoints;
    }

    public void setHeroPoints(int heroPoints) {
        this.heroPoints = heroPoints;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public int getBrawn() {
        return brawn;
    }

    public void setBrawn(int brawn) {
        this.brawn = brawn;
    }

    public int getFinesse() {
        return finesse;
    }

    public void setFinesse(int finesse) {
        this.finesse = finesse;
    }

    public int getWits() {
        return wits;
    }

    public void setWits(int wits) {
        this.wits = wits;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getPanache() {
        return panache;
    }

    public void setPanache(int panache) {
        this.panache = panache;
    }

    public ObservableList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ObservableList<Skill> skills) {
        this.skills = skills;
    }

    public ObservableList<Knack> getKnacks() {
        return knacks;
    }

    public void setKnacks(ObservableList<Knack> knacks) {
        this.knacks = knacks;
    }

    public ObservableList<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(ObservableList<Equipment> equipment) {
        this.equipment = equipment;
    }

    public ObservableList<Advantages> getAdvantages() {
        return advantages;
    }

    public void setAdvantages(ObservableList<Advantages> advantages) {
        this.advantages = advantages;
    }

    public boolean isSorcerer() {
        return isSorcerer;
    }

    public void setSorcerer(boolean sorcerer) {
        isSorcerer = sorcerer;
    }

    public boolean isSwordsman() {
        return isSwordsman;
    }

    public void setSwordsman(boolean swordsman) {
        isSwordsman = swordsman;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

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
