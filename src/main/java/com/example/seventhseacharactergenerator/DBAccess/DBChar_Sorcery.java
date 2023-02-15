package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBChar_Sorcery {

    public static int addCharSorcery(int lastPcId, int sorceryId, int blood) {
        int rowsAffected = 0;
        try {
            String sql = "INSERT INTO char_sorcery (character_id, sorcery_id, blood) " +
                    "VALUES (?, ?, ?)";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

            ps.setInt(1, lastPcId);
            ps.setInt(2, sorceryId);
            ps.setInt(3, blood);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

}
