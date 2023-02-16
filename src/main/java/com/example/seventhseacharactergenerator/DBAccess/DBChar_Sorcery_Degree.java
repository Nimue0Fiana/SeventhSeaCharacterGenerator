package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBChar_Sorcery_Degree {
    /**
     * @param lastPcId
     * @param sorcery_degree_id
     * @return
     */
    public static int addCharSorceryDegree(int lastPcId, int sorcery_degree_id) {
        int rowsAffected = 0;
        try {
            String sql = "INSERT INTO char_sorcery_degrees (character_id, sorcery_degree_id) " +
                    "VALUES (?, ?)";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

            ps.setInt(1, lastPcId);
            ps.setInt(2, sorcery_degree_id);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }
}
