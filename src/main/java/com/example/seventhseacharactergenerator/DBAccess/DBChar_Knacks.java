package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBChar_Knacks {
    /**
     * @param lastPcId
     * @param knackId
     * @param rank
     * @return
     */
    public static int addCharKnacks(int lastPcId, int knackId, int rank) {
        int rowsAffected = 0;
        try {
            String sql = "INSERT INTO char_knacks (character_id, knack_id, rank_level) " +
                    "VALUES (?, ?, ?)";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

            ps.setInt(1, lastPcId);
            ps.setInt(2, knackId);
            ps.setInt(3, rank);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }
}
