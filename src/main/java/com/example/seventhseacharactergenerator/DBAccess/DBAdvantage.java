package com.example.seventhseacharactergenerator.DBAccess;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Advantages;
import com.example.seventhseacharactergenerator.Models.SorceryKnack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAdvantage {

    public static ObservableList<Advantages> getAllAdvantages() {
        ObservableList<Advantages> advantages = FXCollections.observableArrayList();
        try {
            String sql = "SELECT A.id, A.name, A.description, A.point_cost " +
                    "FROM advantages A";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int cost = rs.getInt("point_cost");

                Advantages advantage = new Advantages(id, name, cost, description);
                advantages.add(advantage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return advantages;
    }
}
