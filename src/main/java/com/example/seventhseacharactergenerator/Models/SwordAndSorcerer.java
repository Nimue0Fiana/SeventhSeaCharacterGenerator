package com.example.seventhseacharactergenerator.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SwordAndSorcerer extends PlayerCharacter {
    private int sorceryPoints1;
    private int sorceryPoints2;
    private int blood;

    private Sorcery sorcery;
    private ObservableList<Sorcery> sorceries = FXCollections.observableArrayList();
    private ObservableList<SorceryKnack> sorceryKnacks1 = FXCollections.observableArrayList();
    private ObservableList<SorceryKnack> sorceryKnacks2 = FXCollections.observableArrayList();
    private ObservableList<SorceryDegree> sorceryDegrees = FXCollections.observableArrayList();

    private ObservableList<SwordsmanSchool> swordsmanSchools = FXCollections.observableArrayList();
    private ObservableList<SwordsmanDegree> swordsmanDegrees = FXCollections.observableArrayList();
    private ObservableList<SwordsmanKnack> swordsmanKnacks = FXCollections.observableArrayList();

    /**
     *
     */
    public SwordAndSorcerer() {

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
     * @param sorceryPoints1
     * @param blood
     * @param sorcery
     * @param sorceryKnacks1
     * @param sorceryDegrees
     * @param swordsmanSchools
     * @param swordsmanDegrees
     */
    //Initialize full-blooded or half-blooded sorcerer swordsman
    public SwordAndSorcerer(int id, String name, String player, int heroPoints, String gender, Nation nation, int brawn,
                            int finesse, int wits, int resolve, int panache, int sorceryPoints1,
                            int blood, Sorcery sorcery, ObservableList<SorceryKnack> sorceryKnacks1,
                            ObservableList<SorceryDegree> sorceryDegrees, ObservableList<SwordsmanSchool> swordsmanSchools,
                            ObservableList<SwordsmanDegree> swordsmanDegrees) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
        this.sorceryPoints1 = sorceryPoints1;
        this.blood = blood;
        this.sorcery = sorcery;
        this.sorceryKnacks1 = sorceryKnacks1;
        this.sorceryDegrees = sorceryDegrees;
        this.swordsmanSchools = swordsmanSchools;
        this.swordsmanDegrees = swordsmanDegrees;

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
     * @param sorceryPoints1
     * @param sorceryPoints2
     * @param blood
     * @param sorcery
     * @param sorceries
     * @param sorceryKnacks1
     * @param sorceryKnacks2
     * @param sorceryDegrees
     * @param swordsmanSchools
     * @param swordsmanDegrees
     */
    //Initialize double-blooded sorcerer swordsman
    public SwordAndSorcerer(int id, String name, String player, int heroPoints, String gender, Nation nation, int brawn,
                            int finesse, int wits, int resolve, int panache, int sorceryPoints1, int sorceryPoints2,
                            int blood, Sorcery sorcery, ObservableList<Sorcery> sorceries,
                            ObservableList<SorceryKnack> sorceryKnacks1, ObservableList<SorceryKnack> sorceryKnacks2,
                            ObservableList<SorceryDegree> sorceryDegrees, ObservableList<SwordsmanSchool> swordsmanSchools,
                            ObservableList<SwordsmanDegree> swordsmanDegrees) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
        this.sorceryPoints1 = sorceryPoints1;
        this.sorceryPoints2 = sorceryPoints2;
        this.blood = blood;
        this.sorcery = sorcery;
        this.sorceries = sorceries;
        this.sorceryKnacks1 = sorceryKnacks1;
        this.sorceryKnacks2 = sorceryKnacks2;
        this.sorceryDegrees = sorceryDegrees;
        this.swordsmanSchools = swordsmanSchools;
        this.swordsmanDegrees = swordsmanDegrees;
    }

    /**
     * @param pc
     * @return
     */
    //full or half-blooded sorcerer to Swordsman-Sorcerer
    public SwordAndSorcerer transformSorcererToSwordAndSorcerer(Sorcerer pc) {
        SwordAndSorcerer swordAndSorcerer = new SwordAndSorcerer();
        swordAndSorcerer.setId(pc.getId());
        swordAndSorcerer.setName(pc.getName());
        swordAndSorcerer.setPlayer(pc.getPlayer());
        swordAndSorcerer.setHeroPoints(pc.getHeroPoints());
        swordAndSorcerer.setGender(pc.getGender());
        swordAndSorcerer.setNation(pc.getNation());
        swordAndSorcerer.setBrawn(pc.getBrawn());
        swordAndSorcerer.setFinesse(pc.getFinesse());
        swordAndSorcerer.setWits(pc.getWits());
        swordAndSorcerer.setResolve(pc.getResolve());
        swordAndSorcerer.setPanache(pc.getPanache());
        swordAndSorcerer.setSorceryPoints1(pc.getSorceryPoints1());
        swordAndSorcerer.setBlood(pc.getBlood());
        swordAndSorcerer.setSorcery(pc.getSorcery());
        swordAndSorcerer.setSorceryKnacks1(pc.getSorceryKnacks1());
        swordAndSorcerer.setSorceryDegrees(pc.getSorceryDegrees());


        return swordAndSorcerer;
    }

    /**
     * @param pc
     * @return
     */
    //transformation method for double-blooded sorcerer to swordsman sorcerer
    public SwordAndSorcerer transformDoubleSorcererToSwordSorcerer(Sorcerer pc) {
        SwordAndSorcerer swordAndSorcerer = new SwordAndSorcerer();
        swordAndSorcerer.setId(pc.getId());
        swordAndSorcerer.setName(pc.getName());
        swordAndSorcerer.setPlayer(pc.getPlayer());
        swordAndSorcerer.setHeroPoints(pc.getHeroPoints());
        swordAndSorcerer.setGender(pc.getGender());
        swordAndSorcerer.setNation(pc.getNation());
        swordAndSorcerer.setBrawn(pc.getBrawn());
        swordAndSorcerer.setFinesse(pc.getFinesse());
        swordAndSorcerer.setWits(pc.getWits());
        swordAndSorcerer.setResolve(pc.getResolve());
        swordAndSorcerer.setPanache(pc.getPanache());
        swordAndSorcerer.setSorceryPoints1(pc.getSorceryPoints1());
        swordAndSorcerer.setSorceryPoints2(pc.getSorceryPoints2());
        swordAndSorcerer.setBlood(pc.getBlood());
        swordAndSorcerer.setSorceryKnacks1(pc.getSorceryKnacks1());
        swordAndSorcerer.setSorceryKnacks2(pc.getSorceryKnacks2());
        swordAndSorcerer.setSorceryDegrees(pc.getSorceryDegrees());


        return swordAndSorcerer;
    }

    /**
     * @return
     */
    public int getSorceryPoints1() {
        return sorceryPoints1;
    }

    /**
     * @param sorceryPoints1
     */
    public void setSorceryPoints1(int sorceryPoints1) {
        this.sorceryPoints1 = sorceryPoints1;
    }

    /**
     * @return
     */
    public int getSorceryPoints2() {
        return sorceryPoints2;
    }

    /**
     * @param sorceryPoints2
     */
    public void setSorceryPoints2(int sorceryPoints2) {
        this.sorceryPoints2 = sorceryPoints2;
    }

    /**
     * @return
     */
    public int getBlood() {
        return blood;
    }

    /**
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
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
    public ObservableList<Sorcery> getSorceries() {
        return sorceries;
    }

    /**
     * @param sorceries
     */
    public void setSorceries(ObservableList<Sorcery> sorceries) {
        this.sorceries = sorceries;
    }

    /**
     * @return
     */
    public ObservableList<SorceryKnack> getSorceryKnacks1() {
        return sorceryKnacks1;
    }

    /**
     * @param sorceryKnacks1
     */
    public void setSorceryKnacks1(ObservableList<SorceryKnack> sorceryKnacks1) {
        this.sorceryKnacks1 = sorceryKnacks1;
    }

    /**
     * @return
     */
    public ObservableList<SorceryKnack> getSorceryKnacks2() {
        return sorceryKnacks2;
    }

    /**
     * @param sorceryKnacks2
     */
    public void setSorceryKnacks2(ObservableList<SorceryKnack> sorceryKnacks2) {
        this.sorceryKnacks2 = sorceryKnacks2;
    }

    /**
     * @return
     */
    public ObservableList<SorceryDegree> getSorceryDegrees() {
        return sorceryDegrees;
    }

    /**
     * @param sorceryDegrees
     */
    public void setSorceryDegrees(ObservableList<SorceryDegree> sorceryDegrees) {
        this.sorceryDegrees = sorceryDegrees;
    }

    /**
     * @return
     */
    public ObservableList<SwordsmanSchool> getSwordsmanSchools() {
        return swordsmanSchools;
    }

    /**
     * @param swordsmanSchools
     */
    public void setSwordsmanSchools(ObservableList<SwordsmanSchool> swordsmanSchools) {
        this.swordsmanSchools = swordsmanSchools;
    }

    /**
     * @param swordsmanSchool
     */
    public void addSwordsmanSchool(SwordsmanSchool swordsmanSchool) {
        swordsmanSchools.add(swordsmanSchool);
    }

    /**
     * @param swordsmanSchool
     * @return
     */
    public boolean removeSwordsmanSchool(SwordsmanSchool swordsmanSchool) {
        return this.swordsmanSchools.remove(swordsmanSchool);
    }

    /**
     * @return
     */
    public ObservableList<SwordsmanDegree> getSwordsmanDegrees() {
        return swordsmanDegrees;
    }

    /**
     * @param swordsmanDegrees
     */
    public void setSwordsmanDegrees(ObservableList<SwordsmanDegree> swordsmanDegrees) {
        this.swordsmanDegrees = swordsmanDegrees;
    }

    /**
     * @param swordsmanDegree
     */
    public void addSwordsmanDegree(SwordsmanDegree swordsmanDegree) {
        swordsmanDegrees.add(swordsmanDegree);
    }

    /**
     * @param swordsmanDegree
     * @return
     */
    public boolean removeSwordsmanDegree(SwordsmanDegree swordsmanDegree) {
        return this.swordsmanDegrees.remove(swordsmanDegree);
    }

    /**
     * @param swordsmanKnacks
     */
    public void setSwordsmanKnacks(ObservableList<SwordsmanKnack> swordsmanKnacks) {
        this.swordsmanKnacks = swordsmanKnacks;
    }

    /**
     * @param swordsmanKnack
     * @return
     */
    public boolean removeSwordsmanKnack(SwordsmanKnack swordsmanKnack) {
        return this.swordsmanKnacks.remove(swordsmanKnack);
    }

    /**
     * @param swordsmanKnack
     */
    public void addSwordsmanKnack(SwordsmanKnack swordsmanKnack) {
        swordsmanKnacks.add(swordsmanKnack);
    }

    /**
     * @return
     */
    public ObservableList<SwordsmanKnack> getSwordsmanKnacks() {
        return swordsmanKnacks;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "SwordAndSorcerer{" +
                ", sorceryPoints1=" + sorceryPoints1 +
                ", sorceryPoints2=" + sorceryPoints2 +
                ", blood=" + blood +
                ", sorcery=" + sorcery +
                ", sorceries=" + sorceries +
                ", sorceryKnacks1=" + sorceryKnacks1 +
                ", sorceryKnacks2=" + sorceryKnacks2 +
                ", sorceryDegrees=" + sorceryDegrees +
                ", swordsmanSchools=" + swordsmanSchools +
                ", swordsmanDegrees=" + swordsmanDegrees +
                ", swordsmanKnacks=" + swordsmanKnacks +
                '}';
    }
}
