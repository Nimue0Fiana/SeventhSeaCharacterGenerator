package com.example.seventhseacharactergenerator.controllers;

/**
 * Sample Skeleton for 'chooseAdvantagesPage.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class chooseAdvantagesController {

        @FXML // fx:id="availAdvantageCost"
        private TableColumn<?, ?> availAdvantageCost; // Value injected by FXMLLoader

        @FXML // fx:id="availAdvantageDesc"
        private TableColumn<?, ?> availAdvantageDesc; // Value injected by FXMLLoader

        @FXML // fx:id="availAdvantageName"
        private TableColumn<?, ?> availAdvantageName; // Value injected by FXMLLoader

        @FXML // fx:id="availableAdvantageSearch"
        private TextField availableAdvantageSearch; // Value injected by FXMLLoader

        @FXML // fx:id="availableAdvantages"
        private TableView<?> availableAdvantages; // Value injected by FXMLLoader

        @FXML // fx:id="chosenAdvantageDescription"
        private TableColumn<?, ?> chosenAdvantageDescription; // Value injected by FXMLLoader

        @FXML // fx:id="chosenAdvantageName"
        private TableColumn<?, ?> chosenAdvantageName; // Value injected by FXMLLoader

        @FXML // fx:id="chosenAdvantageSearch"
        private TextField chosenAdvantageSearch; // Value injected by FXMLLoader

        @FXML // fx:id="chosenAdvantages"
        private TableView<?> chosenAdvantages; // Value injected by FXMLLoader

        @FXML // fx:id="heroPointsTotal"
        private Label heroPointsTotal; // Value injected by FXMLLoader

        @FXML
        void onAddSelected(ActionEvent event) {

        }

        @FXML
        void onAvailableEnter(ActionEvent event) {

        }

        @FXML
        void onAvailableGo(ActionEvent event) {

        }

        @FXML
        void onChosenEnter(ActionEvent event) {

        }

        @FXML
        void onChosenGo(ActionEvent event) {

        }

        @FXML
        void onContinueButton(ActionEvent event) {
                try {
                        Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/skillsPage-view.fxml"));
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        @FXML
        void onEnterKey(KeyEvent event) {

        }
}
