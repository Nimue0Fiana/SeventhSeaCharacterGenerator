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
    /**
     * @return
     */
    public static ObservableList<PlayerCharacter> getAllCharacters() {
        ObservableList<PlayerCharacter> characterList = FXCollections.observableArrayList();
        try {
            String sql = "SELECT C.id, C.name, C.player, C.gender, N.name nation, C.hero_points, C.created " +
                    "FROM characters C " +
                    "JOIN nations N ON N.id = C.nation_id";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String player = rs.getString("player");
                String gender = rs.getString("gender");
                String nation = rs.getString("nation");
                int heroPoints = rs.getInt("hero_points");
                Timestamp created = rs.getTimestamp("created");
                //Timestamp created = new Timestamp(myFormat).parse(rs.getString("created"));
                LocalDateTime createdDate = created.toLocalDateTime();

                PlayerCharacter character = new PlayerCharacter(id, name, player, gender, nation, heroPoints, createdDate);
                characterList.add(character);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return characterList;
    }

    /**
     * @param name
     * @param player
     * @param gender
     * @param heroPoints
     * @param nation_id
     * @param brawn
     * @param finesse
     * @param wits
     * @param resolve
     * @param panache
     * @return
     */
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

    /**
     * @param characterId
     * @return
     */
    public static PlayerCharacter getSimpleCharacterById(int characterId) {
        PlayerCharacter character = null;
        try {
            String sql = "SELECT C.id, C.name, C.player, C.gender, C.hero_points, C.brawn, C.finesse, C.wits, C.resolve, " +
                    "C.panache, N.id nation_id, N.name nation_name, N.favored_trait, N.description " +
                    "FROM characters C " +
                    "JOIN nations N ON N.id = C.nation_id " +
                    "WHERE C.id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, characterId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int nation_id = rs.getInt("nation_id");
                String nation_name = rs.getString("nation_name");
                String favored_trait = rs.getString("favored_trait");
                String description = rs.getString("description");

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String player = rs.getString("player");
                String gender = rs.getString("gender");
                int heroPoints = rs.getInt("hero_points");
                int brawn = rs.getInt("brawn");
                int finesse = rs.getInt("finesse");
                int wits = rs.getInt("wits");
                int resolve = rs.getInt("resolve");
                int panache = rs.getInt("panache");

                Nation char_nation = new Nation(nation_id, nation_name, favored_trait, description);
                character = new PlayerCharacter(id, name, player, heroPoints, gender, char_nation, brawn,
                        finesse, wits, resolve, panache);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return character;
    }

    /**
     * @param name
     * @param playerName
     * @param heroPoints
     * @param brawn
     * @param finesse
     * @param wits
     * @param resolve
     * @param panache
     * @param id
     * @return
     */
    public static int updatePersonalInfo(String name, String playerName, int heroPoints, int brawn, int finesse, int wits, int resolve, int panache, int id) {
        int rowsAffected = 0;
        try {
            String sql = "UPDATE characters " +
                    "SET name = ?, player = ?, hero_points = ?, brawn = ?, finesse = ?, wits = ?, resolve = ?, panache = ? " +
                    "WHERE id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, playerName);
            ps.setInt(3, heroPoints);
            ps.setInt(4, brawn);
            ps.setInt(5, finesse);
            ps.setInt(6, wits);
            ps.setInt(7, resolve);
            ps.setInt(8, panache);
            ps.setInt(9, id);

            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    /**
     * @param characterId
     * @return
     */
    public static int deleteCharacterById(int characterId) {
        int rowsAffected = 0;
        try {
            String sql = "DELETE FROM characters " +
                    "WHERE id = ?";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ps.setInt(1, characterId);
            rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    /**
     * @return
     */
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
