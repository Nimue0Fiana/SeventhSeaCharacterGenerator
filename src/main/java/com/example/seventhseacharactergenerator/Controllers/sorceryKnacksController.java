package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'sorceryKnacksPage-view.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
public class sorceryKnacksController {


        @FXML // fx:id="continueButton"
        private Button continueButton; // Value injected by FXMLLoader

        @FXML // fx:id="heroPointsTotal"
        private Label heroPointsTotal; // Value injected by FXMLLoader

        @FXML // fx:id="knackDescription"
        private Label knackDescription; // Value injected by FXMLLoader

        @FXML // fx:id="knackNameCol"
        private TableColumn<?, ?> knackNameCol; // Value injected by FXMLLoader

        @FXML // fx:id="knackTable"
        private TableView<?> knackTable; // Value injected by FXMLLoader

        @FXML // fx:id="rankCol"
        private TableColumn<?, ?> rankCol; // Value injected by FXMLLoader

        @FXML // fx:id="rankValue"
        private Spinner<?> rankValue; // Value injected by FXMLLoader

        @FXML // fx:id="sourceSkillCol"
        private TableColumn<?, ?> sourceSkillCol; // Value injected by FXMLLoader

        @FXML // fx:id="updateButton"
        private Button updateButton; // Value injected by FXMLLoader

        @FXML
        void onContinueButton(ActionEvent event) {

        }

        @FXML
        void onUpdateButton(ActionEvent event) {

        }

}
