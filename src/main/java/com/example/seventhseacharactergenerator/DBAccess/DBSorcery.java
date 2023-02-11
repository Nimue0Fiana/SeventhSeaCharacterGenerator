package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Sorcery;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSorcery {
    public static Sorcery getSorceryById(int id) {
        Sorcery sorcery = null;
        try {
            String sql = "SELECT S.id, S.name, S.description " +
                    "FROM sorceries S " +
                    "WHERE S.id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int sorceryId = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");

                sorcery = new Sorcery(sorceryId, name, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sorcery;
    }

    public static Sorcery getSorceryByNationId(int id) {
        Sorcery sorcery = null;
        try {
            String sql = "SELECT S.id, S.name, S.description " +
                    "FROM sorceries S " +
                    "WHERE S.nation_id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int sorceryId = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");

                sorcery = new Sorcery(sorceryId, name, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sorcery;
    }
}
