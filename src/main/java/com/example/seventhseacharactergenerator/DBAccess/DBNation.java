package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Nation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBNation {

    public static ObservableList<Nation> getAllNations() {
        ObservableList<Nation> nationsList = FXCollections.observableArrayList();
        try{
            String sql = "SELECT N.id, N.name, N.favored_trait, N.description " +
                    "FROM nations N";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(("id"));
                String name = rs.getString("name");
                String favored_trait = rs.getString("favored_trait");
                String description = rs.getString("description");

                Nation nation = new Nation(id, name, favored_trait, description);
                nationsList.add(nation);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return nationsList;
    }

    public static String getNationDescByName(String name) {
        String description;
        try {
            String sql = "SELECT N.description " +
                    "FROM nations N " +
                    "WHERE N.name = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, name);
             ResultSet rs = ps.executeQuery();
             description = rs.getString("description");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return description;
    }

    public static Nation getNationByName(String name) {
        Nation requestedNation = null;
        try {
            String sql = "SELECT N.id, N.name, N.favored_trait, N.description " +
                    "FROM nations N " +
                    "WHERE N.name = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String nationName = rs.getString("name");
                String favored_trait = rs.getString("favored_trait");
                String description = rs.getString("description");
                requestedNation = new Nation(id, nationName, favored_trait, description);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return requestedNation;
    }
}
