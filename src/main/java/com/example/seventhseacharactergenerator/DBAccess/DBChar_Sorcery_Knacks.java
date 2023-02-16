package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBChar_Sorcery_Knacks {
    /**
     * @param lastPcId
     * @param sorcery_knack_id
     * @param rank
     * @return
     */
    public static int addCharSorceryKnacks(int lastPcId, int sorcery_knack_id, int rank) {
        int rowsAffected = 0;
        try {
            String sql = "INSERT INTO char_sorcery_knacks (character_id, sorcery_knack_id, rank_level) " +
                    "VALUES (?, ?, ?)";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

            ps.setInt(1, lastPcId);
            ps.setInt(2, sorcery_knack_id);
            ps.setInt(3, rank);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

}
