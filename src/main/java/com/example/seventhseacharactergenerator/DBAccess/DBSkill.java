package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Advantages;
import com.example.seventhseacharactergenerator.Models.Skill;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSkill {
    /**
     * @return
     */
    public static ObservableList<Skill> getAllSkills() {
        ObservableList<Skill> skills = FXCollections.observableArrayList();
        try {
            String sql = "SELECT S.id, S.name " +
                    "FROM skills S";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                Skill skill = new Skill(id, name);
                skills.add(skill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return skills;
    }

    /**
     * @param q
     * @return
     */
//https://stackoverflow.com/questions/8247970/using-like-wildcard-in-prepared-statement
    public static ObservableList<Skill> lookupSkill(String q) {
        ObservableList<Skill> skills = FXCollections.observableArrayList();
        try {
            String sql = "SELECT S.id, S.name " +
                    "FROM skills S " +
                    "WHERE S.name LIKE ?";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + q + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                Skill skill = new Skill(id, name);
                skills.add(skill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return skills;

    }

    /**
     * @param skillId
     * @return
     */
    public static Skill lookupSkillById(int skillId) {
        Skill searchedSkill = null;
        try {
            String sql = "SELECT id, name " +
                    "FROM skills " +
                    "WHERE skills.id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, skillId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                searchedSkill = new Skill(id, name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return searchedSkill;
    }
}
