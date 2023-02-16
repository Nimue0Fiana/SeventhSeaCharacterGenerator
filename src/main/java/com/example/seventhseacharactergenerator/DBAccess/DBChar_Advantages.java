package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBChar_Advantages {
    /**
     * @param lastPcId
     * @param advantageId
     * @return
     */
    public static int addCharAdvantages(int lastPcId, int advantageId) {
        int rowsAffected = 0;
        try {
            String sql = "INSERT INTO char_advantages (character_id, advantage_id) " +
                    "VALUES (?, ?)";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

            ps.setInt(1, lastPcId);
            ps.setInt(2, advantageId);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }
}
