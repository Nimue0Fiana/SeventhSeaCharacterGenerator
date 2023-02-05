package com.example.seventhseacharactergenerator;

import com.example.seventhseacharactergenerator.Helper.JDBC;
import com.example.seventhseacharactergenerator.Models.Nation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
//TODO:May later increase cost of "advanced" knacks - outside scope of current application
//TODO:increase favored trait by 1 in initialize method of trait page - outside scope of current application
//TODO:if gender is male and Vodacce, present choice to take half magic for full cost - different page - outside scope of current application
//TODO:set value of rankValue spinner on knacks page to the rank of the selected object in the tableView. Outside the scope of this project.
public class CharacterApplication extends Application {

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