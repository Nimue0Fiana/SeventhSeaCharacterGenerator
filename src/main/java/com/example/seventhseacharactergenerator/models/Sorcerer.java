package com.example.seventhseacharactergenerator.models;

import javafx.collections.ObservableList;

public class Sorcerer extends PlayerCharacter {
    private enum Blood{Half, Full, Double};
    private ObservableList<Sorcery> sorceries;
    private ObservableList<SorceryKnack> sorceryKnacks;
    private ObservableList<SorceryDegree> sorceryDegrees;

    public Sorcerer(ObservableList<Sorcery> sorceries, ObservableList<SorceryKnack> sorceryKnacks, ObservableList<SorceryDegree> sorceryDegrees) {
        this.sorceries = sorceries;
        this.sorceryKnacks = sorceryKnacks;
        this.sorceryDegrees = sorceryDegrees;
    }

    public Sorcerer(int id, String name, String player, int heroPoints, String gender, Nation nation, int brawn, int finesse, int wits, int resolve, int panache, ObservableList<Sorcery> sorceries, ObservableList<SorceryKnack> sorceryKnacks, ObservableList<SorceryDegree> sorceryDegrees) {
        super(id, name, player, heroPoints, gender, nation, brawn, finesse, wits, resolve, panache);
        this.sorceries = sorceries;
        this.sorceryKnacks = sorceryKnacks;
        this.sorceryDegrees = sorceryDegrees;
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
}
