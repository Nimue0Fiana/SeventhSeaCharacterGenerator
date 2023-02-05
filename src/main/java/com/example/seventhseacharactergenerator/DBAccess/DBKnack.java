package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Knack;
import com.example.seventhseacharactergenerator.Models.Skill;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBKnack {
    public static String allKnacksForSkill(int skillId) {
        String knackList = null;
        try {
            String sql = "SELECT GROUP_CONCAT(K.name, ', ') AS names " +
                    "FROM knacks K " +
                    "JOIN skills S on K.skill_id = S.id " +
                    "WHERE S.id = ?";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, skillId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                knackList = rs.getString("names");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return knackList;
    }

    public static ObservableList knackListForSkill(int skillId) {
        ObservableList<Knack> associatedKnacks = FXCollections.observableArrayList();
        try {
            String sql = "SELECT K.id, K.skill_id, K.name, K.knack_level,  K.isAdvanced, K.description " +
                    "FROM knacks K " +
                    "WHERE K.skill_id = ?";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, skillId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int skill_id = rs.getInt("skill_id");
                String name = rs.getString("name");
                int knack_level = rs.getInt("knack_level");
                boolean isAdvanced = rs.getBoolean("isAdvanced");
                String description = rs.getString("description");

                Knack knack = new Knack(id, skill_id, name, knack_level, isAdvanced, description);
                associatedKnacks.add(knack);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return associatedKnacks;
    }
}
