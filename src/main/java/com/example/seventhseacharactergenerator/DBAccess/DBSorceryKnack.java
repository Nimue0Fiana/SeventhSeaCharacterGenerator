package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Sorcery;
import com.example.seventhseacharactergenerator.Models.SorceryKnack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSorceryKnack {
    /**
     * @param sorcery_id
     * @return
     */
    public static ObservableList<SorceryKnack> getAllKnacksForSorcery(int sorcery_id) {
        ObservableList<SorceryKnack> knacksForSorcery = FXCollections.observableArrayList();
        try {
            String sql = "SELECT K.id, K.name, K.description " +
                    "FROM sorcery_knacks K " +
                    "WHERE K.sorcery_id = ?";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, String.valueOf(sorcery_id));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");

                SorceryKnack sorceryKnack = new SorceryKnack(id, name, description);
                knacksForSorcery.add(sorceryKnack);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return knacksForSorcery;
    }
}
