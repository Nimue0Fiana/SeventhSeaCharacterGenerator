package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.SorceryDegree;
import com.example.seventhseacharactergenerator.Models.SwordsmanDegree;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSorceryDegree {
    public static SorceryDegree getSorceryDegreeBySorcery(int sorcery_id){

        SorceryDegree requestedDegree = null;
            try {
                String sql = "SELECT D.id, D.sorcery_id,D.degree, D.name, D.description " +
                        "FROM sorcery_degrees D " +
                        "WHERE sorcery_id = ?";
                PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
                ps.setInt(1, sorcery_id);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("id");
                    int school_id = rs.getInt("sorcery_id");
                    int degree = rs.getInt("degree");
                    String name = rs.getString("name");
                    String description = rs.getString("description");
                    requestedDegree = new SorceryDegree(id, sorcery_id, degree, name, description);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return requestedDegree;


    }
}
