package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'skillsPage.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class skillsController {

        @FXML // fx:id="addButton"
        private Button addButton; // Value injected by FXMLLoader

        @FXML // fx:id="availKnacksCol"
        private TableColumn<?, ?> availKnacksCol; // Value injected by FXMLLoader

        @FXML // fx:id="availableGoButton"
        private Button availableGoButton; // Value injected by FXMLLoader

        @FXML // fx:id="availableSearch"
        private TextField availableSearch; // Value injected by FXMLLoader

        @FXML // fx:id="availableSkillNameCol"
        private TableColumn<?, ?> availableSkillNameCol; // Value injected by FXMLLoader

        @FXML // fx:id="availableSkillsTable"
        private TableView<?> availableSkillsTable; // Value injected by FXMLLoader

        @FXML // fx:id="chosenAttachedKnackCol"
        private TableColumn<?, ?> chosenAttachedKnackCol; // Value injected by FXMLLoader

        @FXML // fx:id="chosenGoButton"
        private Button chosenGoButton; // Value injected by FXMLLoader

        @FXML // fx:id="chosenSearch"
        private TextField chosenSearch; // Value injected by FXMLLoader

        @FXML // fx:id="chosenSkillCol"
        private TableColumn<?, ?> chosenSkillCol; // Value injected by FXMLLoader

        @FXML // fx:id="chosenSkillsTable"
        private TableView<?> chosenSkillsTable; // Value injected by FXMLLoader

        @FXML // fx:id="continueButton"
        private Button continueButton; // Value injected by FXMLLoader

        @FXML // fx:id="heroPointsTotal"
        private Label heroPointsTotal; // Value injected by FXMLLoader

        @FXML
        void onAvailableGoButton(ActionEvent event) {

        }

        @FXML
        void onAvailableSearchEnter(ActionEvent event) {

        }

        @FXML
        void onChosenGoButton(ActionEvent event) {

        }

        @FXML
        void onChosenSearchEnter(ActionEvent event) {

        }

        @FXML
        void onContinue(ActionEvent event) {
                try {
                        Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/knacksPage-view.fxml"));
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
