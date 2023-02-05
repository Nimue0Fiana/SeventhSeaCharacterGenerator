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
}
