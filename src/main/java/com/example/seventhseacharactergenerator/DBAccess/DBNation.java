package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Nation;
import com.example.seventhseacharactergenerator.Models.Sorcery;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBNation {
    /**
     * @return
     */
    public static ObservableList<Nation> getAllNations() {
        ObservableList<Nation> nationsList = FXCollections.observableArrayList();
        try {
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

    /**
     * @param name
     * @return
     */
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

    /**
     * @param name
     * @return
     */
    public static Nation getNationByName(String name) {
        Nation requestedNation = null;
        int sorcery_id = 0;
        Sorcery sorcery = null;
        try {
            String sql = "SELECT N.id, N.name, N.favored_trait, N.description, N.sorcery_id " +
                    "FROM nations N " +
                    "WHERE N.name = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nationName = rs.getString("name");
                String favored_trait = rs.getString("favored_trait");
                String description = rs.getString("description");
                sorcery_id = rs.getInt("sorcery_id");
                requestedNation = new Nation(id, nationName, favored_trait, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            String sql = "SELECT S.id, S.name, S.description " +
                    "FROM sorceries S " +
                    "WHERE S.id = " + sorcery_id;

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String sorceryName = rs.getString("name");
                String description = rs.getString("description");
                sorcery = new Sorcery(id, sorceryName, description);

                requestedNation.setSorcery(sorcery);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return requestedNation;
    }

    /**
     * @param id
     * @return
     */
    public static Nation getNationById(int id) {
        Nation requestedNation = null;
        try {
            String sql = "SELECT N.id, N.name, N.favored_trait, N.description " +
                    "FROM nations N " +
                    "WHERE N.id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int nationId = rs.getInt("id");
                String nationName = rs.getString("name");
                String favored_trait = rs.getString("favored_trait");
                String description = rs.getString("description");
                requestedNation = new Nation(id, nationName, favored_trait, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return requestedNation;
    }
}
