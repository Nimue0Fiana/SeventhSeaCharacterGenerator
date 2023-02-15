package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Nation;
import com.example.seventhseacharactergenerator.Models.PlayerCharacter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class DBPlayerCharacter {
    //TODO: retrieve timestamp in local time
    public static ObservableList<PlayerCharacter> getAllCharacters() {
        ObservableList<PlayerCharacter> characterList = FXCollections.observableArrayList();
        try {
            String sql = "SELECT C.name, C.player, C.gender, N.name nation, C.hero_points, C.created " +
                    "FROM characters C " +
                    "JOIN nations N ON N.id = C.nation_id";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String player = rs.getString("player");
                String gender = rs.getString("gender");
                String nation = rs.getString("nation");
                int heroPoints = rs.getInt("hero_points");
                Timestamp created = rs.getTimestamp("created");
                //Timestamp created = new Timestamp(myFormat).parse(rs.getString("created"));
                LocalDateTime createdDate = created.toLocalDateTime();

                PlayerCharacter character = new PlayerCharacter(name, player, gender, nation, heroPoints, createdDate);
                characterList.add(character);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return characterList;
    }

    public static int addCharacter(String name, String player, String gender, int heroPoints, int nation_id, int brawn, int finesse, int wits, int resolve, int panache) {
        int rowsAffected = 0;
        try {
            String sql = "INSERT INTO characters(name, player, hero_points, gender, nation_id, brawn, finesse, wits, resolve, panache, created) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, player);
            ps.setInt(3, heroPoints);
            ps.setString(4, gender);
            ps.setInt(5, nation_id);
            ps.setInt(6, brawn);
            ps.setInt(7, finesse);
            ps.setInt(8, wits);
            ps.setInt(9, resolve);
            ps.setInt(10, panache);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return rowsAffected;
    }

    public static int lastPcId() {
        int lastCreatedPcId = 0;
        try {
            String sql = "SELECT MAX(id) last FROM characters";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lastCreatedPcId = rs.getInt("last");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lastCreatedPcId;
    }

}
