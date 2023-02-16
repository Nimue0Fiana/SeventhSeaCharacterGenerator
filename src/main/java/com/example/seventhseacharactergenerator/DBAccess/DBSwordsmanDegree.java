package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.SwordsmanDegree;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSwordsmanDegree {
    /**
     * @param schoolId
     * @return
     */
    public static SwordsmanDegree getSwordsmanDegreeBySchoolId(int schoolId) {
        SwordsmanDegree requestedDegree = null;
        try {
            String sql = "SELECT D.id, D.swordsman_school_id, D.name, D.description " +
                    "FROM swordsman_degrees D " +
                    "WHERE swordsman_school_id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, schoolId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int school_id = rs.getInt("swordsman_school_id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                requestedDegree = new SwordsmanDegree(id, school_id, name, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return requestedDegree;

    }
}
