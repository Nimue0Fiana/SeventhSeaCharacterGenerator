package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.SorceryKnack;
import com.example.seventhseacharactergenerator.Models.SwordsmanKnack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSwordsmanKnack {
    /**
     * @param searchSchool_id
     * @return
     */
    public static ObservableList<SwordsmanKnack> getInitKnacksForSwordsman(int searchSchool_id) {
        ObservableList<SwordsmanKnack> knacksForSwordsman = FXCollections.observableArrayList();
        try {
            String sql = "SELECT K.id, K.skill_id, K.school_id, K.name, K.description " +
                    "FROM swordsman_knacks K " +
                    "WHERE K.school_id = ?";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, String.valueOf(searchSchool_id));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int skill_id = rs.getInt("skill_id");
                int school_id = rs.getInt("school_id");
                String name = rs.getString("name");
                int knackLevel = 1;
                String description = rs.getString("description");
                //SwordsmanKnack(int id, int skill_id, int school_id, String name, int knackLevel, String description)
                SwordsmanKnack swordsmanKnack = new SwordsmanKnack(id, skill_id, school_id, name, knackLevel, description);
                knacksForSwordsman.add(swordsmanKnack);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return knacksForSwordsman;
    }
}

