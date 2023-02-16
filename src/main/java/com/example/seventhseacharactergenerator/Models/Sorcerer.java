package com.example.seventhseacharactergenerator.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Sorcerer extends PlayerCharacter {
    private int sorceryPoints1;
    private int sorceryPoints2;
    //half-blood = 1, full-blood = 2, double-blood = 3
    private int blood;

    private Sorcery sorcery;
    private ObservableList<Sorcery> sorceries = FXCollections.observableArrayList();

    private ObservableList<SorceryKnack> sorceryKnacks1 = FXCollections.observableArrayList();
    private ObservableList<SorceryKnack> sorceryKnacks2 = FXCollections.observableArrayList();
    private ObservableList<SorceryDegree> sorceryDegrees = FXCollections.observableArrayList();

    /**
     *
     */
    public Sorcerer() {

    }

    /**
     * @param id
     * @param name
     * @param player
     * @param heroPoints
     * @param sorceryPoints1
     * @param sorceryPoints2
     * @param gender
     * @param nation
     * @param brawn
     * @param finesse
     * @param wits
     * @param resolve
     * @param panache
     * @param blood
     */
    public Sorcerer(int id, String name, String player, int heroPoints, int sorceryPoints1, int sorceryPoints2, String gender, Nation nation, int brawn, int finesse, int wits, int resolve, int panache, int blood) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
        this.sorceryPoints1 = sorceryPoints1;
        this.sorceryPoints2 = sorceryPoints2;
        this.blood = blood;
    }

    /**
     * @param pc
     * @return
     */
    public Sorcerer transformPCToSorcerer(PlayerCharacter pc) {
        Sorcerer sorcerer = new Sorcerer();
        sorcerer.setId(pc.getId());
        sorcerer.setName(pc.getName());
        sorcerer.setPlayer(pc.getPlayer());
        sorcerer.setHeroPoints(pc.getHeroPoints());
        sorcerer.setGender(pc.getGender());
        sorcerer.setNation(pc.getNation());
        sorcerer.setBrawn(pc.getBrawn());
        sorcerer.setFinesse(pc.getFinesse());
        sorcerer.setWits(pc.getWits());
        sorcerer.setResolve(pc.getResolve());
        sorcerer.setPanache(pc.getPanache());

        return sorcerer;
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
     * @param sorcery
     */
    public void addSorcery(Sorcery sorcery) {
        sorceries.add(sorcery);
    }

    /**
     * @param sorcery
     * @return
     */
    public boolean removeSorcery(Sorcery sorcery) {
        return this.sorceries.remove(sorcery);
    }

    /**
     * @return
     */
    public ObservableList<SorceryKnack> getSorceryKnacks1() {
        return sorceryKnacks1;
    }

    /**
     * @return
     */
    public ObservableList<SorceryKnack> getSorceryKnacks2() {
        return sorceryKnacks2;
    }

    /**
     * @param sorceryKnacks1
     */
    public void setSorceryKnacks1(ObservableList<SorceryKnack> sorceryKnacks1) {
        this.sorceryKnacks1 = sorceryKnacks1;
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
     * @param degree
     */
    public void addSorceryDegree(SorceryDegree degree) {
        sorceryDegrees.add(degree);
    }

    /**
     * @param degree
     * @return
     */
    public boolean removeSorceryDegree(SorceryDegree degree) {
        return this.sorceryDegrees.remove(degree);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Sorcerer{" +
                "sorceryPoints1=" + sorceryPoints1 +
                ", sorceryPoints2=" + sorceryPoints2 +
                ", blood=" + blood +
                ", sorcery=" + sorcery +
                ", sorceries=" + sorceries +
                ", sorceryKnacks1=" + sorceryKnacks1 +
                ", sorceryKnacks2=" + sorceryKnacks2 +
                ", sorceryDegrees=" + sorceryDegrees +
                '}';
    }
}
