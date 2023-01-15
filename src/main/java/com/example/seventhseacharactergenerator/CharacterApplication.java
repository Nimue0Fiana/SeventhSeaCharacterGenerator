package com.example.seventhseacharactergenerator;

import com.example.seventhseacharactergenerator.models.Nation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CharacterApplication extends Application {
    public static Nation nation = new Nation(-1, "avalon", "resolve", "Green and enchanted, " +
            "this union of three kingdoms has recently risen to the forefront of Thean politics.");

    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(CharacterApplication.class.getResource("landingPage-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 715, 433);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JDBC.openConnection();
        launch(args);
        JDBC.closeConnection();
    }
}