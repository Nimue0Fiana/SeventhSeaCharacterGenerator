package com.example.seventhseacharactergenerator.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Swordsman extends  PlayerCharacter{
    private ObservableList<SwordsmanSchool> swordsmanSchools = FXCollections.observableArrayList();

    private ObservableList<SwordsmanDegree> swordsmanDegrees = FXCollections.observableArrayList();

    private ObservableList<SwordsmanKnack> swordsmanKnacks = FXCollections.observableArrayList();

    public Swordsman() {
    }

    public Swordsman(int id, String name, String player, int heroPoints, String gender, Nation nation, int brawn, int finesse, int wits, int resolve, int panache) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
    }

    public Swordsman(int id, String name, String player, int heroPoints, String gender, Nation nation, int brawn, int finesse, int wits, int resolve, int panache, ObservableList<SwordsmanSchool> swordsmanSchools, ObservableList<SwordsmanDegree> swordsmanDegrees) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
        this.swordsmanSchools = swordsmanSchools;
        this.swordsmanDegrees = swordsmanDegrees;
    }

    public Swordsman transformPCToSwordsman(PlayerCharacter pc) {
        Swordsman swordsman= new Swordsman();
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

    public ObservableList<SwordsmanSchool> getSwordsmanSchools() {
        return swordsmanSchools;
    }

    public void setSwordsmanSchools(ObservableList<SwordsmanSchool> swordsmanSchools) {
        this.swordsmanSchools = swordsmanSchools;
    }

    public ObservableList<SwordsmanDegree> getSwordsmanDegrees() {
        return swordsmanDegrees;
    }

    public void setSwordsmanDegrees(ObservableList<SwordsmanDegree> swordsmanDegrees) {
        this.swordsmanDegrees = swordsmanDegrees;
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "swordsmanSchools=" + swordsmanSchools +
                ", swordsmanDegrees=" + swordsmanDegrees +
                '}';
    }
}
