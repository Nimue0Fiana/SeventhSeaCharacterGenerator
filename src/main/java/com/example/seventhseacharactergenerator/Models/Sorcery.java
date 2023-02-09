package com.example.seventhseacharactergenerator.Models;

import javafx.collections.ObservableList;

public class Sorcery {
   private int id;
   private String name;
   private String description;
   private ObservableList<SorceryDegree> degrees;
   private ObservableList<SorceryKnack> knacks;

   public Sorcery(){

   }

    public Sorcery(int id, String name, String description) {
       this.id = id;
       this.name = name;
       this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ObservableList<SorceryDegree> getDegrees() {
        return degrees;
    }

    public void setDegrees(ObservableList<SorceryDegree> degrees) {
        this.degrees = degrees;
    }

    public ObservableList<SorceryKnack> getKnacks() {
        return knacks;
    }

    public void setKnacks(ObservableList<SorceryKnack> knacks) {
        this.knacks = knacks;
    }

    @Override
    public String toString() {
        return "Sorcery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", degrees=" + degrees +
                ", knacks=" + knacks +
                '}';
    }
}
