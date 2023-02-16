package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBChar_Skills {
    /**
     * @param lastPcId
     * @param skillId
     * @return
     */
    public static int addCharSkills(int lastPcId, int skillId) {
        int rowsAffected = 0;
        try {
            String sql = "INSERT INTO char_skills (character_id, skill_id) " +
                    "VALUES (?, ?)";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

            ps.setInt(1, lastPcId);
            ps.setInt(2, skillId);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }
}
