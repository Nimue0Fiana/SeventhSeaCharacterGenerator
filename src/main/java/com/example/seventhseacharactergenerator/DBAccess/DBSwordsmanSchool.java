package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Nation;
import com.example.seventhseacharactergenerator.Models.SwordsmanSchool;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSwordsmanSchool {
    public static String getSwordSchoolDescById(int id) {
        String description;
        try {
            String sql = "SELECT S.description " +
                    "FROM swordsman_schools S " +
                    "WHERE S.nation_id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            description = rs.getString("description");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return description;
    }

        public static String getSwordSchoolNameById(int id) {
            String name;
            try {
                String sql = "SELECT S.name " +
                        "FROM swordsman_schools S " +
                        "WHERE S.nation_id = ?";
                PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                name = rs.getString("name");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return name;
        }

    public static ObservableList<String> getNonNativeSwordSchool(int id) {
        ObservableList<String> otherSwordSchools = FXCollections.observableArrayList();
        try {
            String sql = "SELECT S.name " +
                    "FROM swordsman_schools S " +
                    "WHERE S.nation_id != ? " +
                    "ORDER BY S.id";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");

                otherSwordSchools.add(name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return otherSwordSchools;
    }

    public static String getSchoolDescByName(String schoolName) {
        String description=null;
        try{
            String sql = "SELECT S.description " +
                    "FROM swordsman_schools S " +
                    "WHERE S.name = ?";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, schoolName);
            ResultSet rs = ps.executeQuery();
            description = rs.getString("description");
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return description;
    }

    public static SwordsmanSchool getSwordSchoolById(int id) {
        SwordsmanSchool requestedSchool = null;
        Nation nation;
        try {
            String sql = "SELECT S.id, S.nation_id, S.name, S.description " +
                    "FROM swordsman_schools S " +
                    "WHERE S.nation_id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int schoolId = rs.getInt("id");
                int nationId = rs.getInt("nation_id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                nation = DBNation.getNationById(nationId);
                requestedSchool = new SwordsmanSchool(schoolId, name, nation, description);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return requestedSchool;
    }
}
