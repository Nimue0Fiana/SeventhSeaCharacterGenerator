package com.example.seventhseacharactergenerator.Models;

import javafx.collections.ObservableList;

public class Sorcerer extends PlayerCharacter {
    PlayerCharacter playerCharacter;
    private int sorceryPoints1;
    private int sorceryPoints2;
    private int blood;
    private ObservableList<Sorcery> sorceries;
    private ObservableList<SorceryKnack> sorceryKnacks;
    private ObservableList<SorceryDegree> sorceryDegrees;

    public Sorcerer() {

    }

    public Sorcerer(int id, String name, String player, int heroPoints, int sorceryPoints1, int sorceryPoints2, String gender, Nation nation, int brawn, int finesse, int wits, int resolve, int panache, int blood, ObservableList<Sorcery> sorceries, ObservableList<SorceryKnack> sorceryKnacks, ObservableList<SorceryDegree> sorceryDegrees) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
        this.blood = blood;
        this.sorceries = sorceries;
        this.sorceryKnacks = sorceryKnacks;
        this.sorceryDegrees = sorceryDegrees;
    }
    public Sorcerer transformPCToSorcerer(PlayerCharacter pc) {
        Sorcerer sorcerer= new Sorcerer();
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

    public int getSorceryPoints1() {
        return sorceryPoints1;
    }

    public void setSorceryPoints1(int sorceryPoints1) {
        this.sorceryPoints1 = sorceryPoints1;
    }

    public int getSorceryPoints2() {
        return sorceryPoints2;
    }

    public void setSorceryPoints2(int sorceryPoints2) {
        this.sorceryPoints2 = sorceryPoints2;
    }

    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
    }
    public ObservableList<Sorcery> getSorceries() {
        return sorceries;
    }

    public void setSorceries(ObservableList<Sorcery> sorceries) {
        this.sorceries = sorceries;
    }

    public ObservableList<SorceryKnack> getSorceryKnacks() {
        return sorceryKnacks;
    }

    public void setSorceryKnacks(ObservableList<SorceryKnack> sorceryKnacks) {
        this.sorceryKnacks = sorceryKnacks;
    }

    public ObservableList<SorceryDegree> getSorceryDegrees() {
        return sorceryDegrees;
    }

    public void setSorceryDegrees(ObservableList<SorceryDegree> sorceryDegrees) {
        this.sorceryDegrees = sorceryDegrees;
    }

    @Override
    public String toString() {
        return "Sorcerer{" +
                "playerCharacter=" + playerCharacter +
                ", blood=" + blood +
                ", sorceries=" + sorceries +
                ", sorceryKnacks=" + sorceryKnacks +
                ", sorceryDegrees=" + sorceryDegrees +
                '}';
    }
}
