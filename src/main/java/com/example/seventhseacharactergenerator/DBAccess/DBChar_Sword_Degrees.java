package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBChar_Sword_Degrees {
    /**
     * @param lastPcId
     * @param swordDegreeId
     * @return
     */
    public static int addCharSwordDegree(int lastPcId, int swordDegreeId) {
        int rowsAffected = 0;
        try {
            String sql = "INSERT INTO char_swordsman_degrees (character_id, swordsman_degree_id) " +
                    "VALUES (?, ?)";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

            ps.setInt(1, lastPcId);
            ps.setInt(2, swordDegreeId);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }
}
