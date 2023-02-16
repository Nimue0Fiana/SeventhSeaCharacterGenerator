package com.example.seventhseacharactergenerator.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Swordsman extends PlayerCharacter {
    private ObservableList<SwordsmanSchool> swordsmanSchools = FXCollections.observableArrayList();

    private ObservableList<SwordsmanDegree> swordsmanDegrees = FXCollections.observableArrayList();

    private ObservableList<SwordsmanKnack> swordsmanKnacks = FXCollections.observableArrayList();

    /**
     *
     */
    public Swordsman() {
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
    public Swordsman(int id, String name, String player, int heroPoints, String gender, Nation nation, int brawn, int finesse, int wits, int resolve, int panache) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
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
     * @param swordsmanSchools
     * @param swordsmanDegrees
     */
    public Swordsman(int id, String name, String player, int heroPoints, String gender, Nation nation, int brawn, int finesse, int wits, int resolve, int panache, ObservableList<SwordsmanSchool> swordsmanSchools, ObservableList<SwordsmanDegree> swordsmanDegrees) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
        this.swordsmanSchools = swordsmanSchools;
        this.swordsmanDegrees = swordsmanDegrees;
    }

    /**
     * @param pc
     * @return
     */
    public Swordsman transformPCToSwordsman(PlayerCharacter pc) {
        Swordsman swordsman = new Swordsman();
        swordsman.setId(pc.getId());
        swordsman.setName(pc.getName());
        swordsman.setPlayer(pc.getPlayer());
        swordsman.setHeroPoints(pc.getHeroPoints());
        swordsman.setGender(pc.getGender());
        swordsman.setNation(pc.getNation());
        swordsman.setBrawn(pc.getBrawn());
        swordsman.setFinesse(pc.getFinesse());
        swordsman.setWits(pc.getWits());
        swordsman.setResolve(pc.getResolve());
        swordsman.setPanache(pc.getPanache());

        return swordsman;
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
        return "Swordsman{" +
                "swordsmanSchools=" + swordsmanSchools +
                ", swordsmanDegrees=" + swordsmanDegrees +
                ", swordsmanKnacks=" + swordsmanKnacks +
                '}';
    }
}
