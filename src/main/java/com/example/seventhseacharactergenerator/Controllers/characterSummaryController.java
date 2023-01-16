package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'characterSummaryPage.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
public class characterSummaryController {

        @FXML // fx:id="DRCol"
        private TableColumn<?, ?> DRCol; // Value injected by FXMLLoader

        @FXML // fx:id="advantageCostCol"
        private TableColumn<?, ?> advantageCostCol; // Value injected by FXMLLoader

        @FXML // fx:id="advantageNameCol"
        private TableColumn<?, ?> advantageNameCol; // Value injected by FXMLLoader

        @FXML // fx:id="advantageTable"
        private TableView<?> advantageTable; // Value injected by FXMLLoader

        @FXML // fx:id="characterName"
        private Label characterName; // Value injected by FXMLLoader

        @FXML // fx:id="equipmentCol"
        private TableColumn<?, ?> equipmentCol; // Value injected by FXMLLoader

        @FXML // fx:id="equipmentTable"
        private TableView<?> equipmentTable; // Value injected by FXMLLoader

        @FXML // fx:id="experience"
        private Label experience; // Value injected by FXMLLoader

        @FXML // fx:id="heroPointsTotal"
        private Label heroPointsTotal; // Value injected by FXMLLoader

        @FXML // fx:id="knackDescCol"
        private TableColumn<?, ?> knackDescCol; // Value injected by FXMLLoader

        @FXML // fx:id="knackNameCol"
        private TableColumn<?, ?> knackNameCol; // Value injected by FXMLLoader

        @FXML // fx:id="knackRankCol"
        private TableColumn<?, ?> knackRankCol; // Value injected by FXMLLoader

        @FXML // fx:id="longCol"
        private TableColumn<?, ?> longCol; // Value injected by FXMLLoader

        @FXML // fx:id="memberships"
        private Label memberships; // Value injected by FXMLLoader

        @FXML // fx:id="nation"
        private Label nation; // Value injected by FXMLLoader

        @FXML // fx:id="playerName"
        private Label playerName; // Value injected by FXMLLoader

        @FXML // fx:id="profession"
        private Label profession; // Value injected by FXMLLoader

        @FXML // fx:id="rangeCol"
        private TableColumn<?, ?> rangeCol; // Value injected by FXMLLoader

        @FXML // fx:id="reloadCol"
        private TableColumn<?, ?> reloadCol; // Value injected by FXMLLoader

        @FXML // fx:id="reputationText"
        private Text reputationText; // Value injected by FXMLLoader

        @FXML // fx:id="shortCol"
        private TableColumn<?, ?> shortCol; // Value injected by FXMLLoader

        @FXML // fx:id="skillsTable"
        private TableView<?> skillsTable; // Value injected by FXMLLoader

        @FXML // fx:id="sorKnackRankCol"
        private TableColumn<?, ?> sorKnackRankCol; // Value injected by FXMLLoader

        @FXML // fx:id="sorceryKnackDescCol"
        private TableColumn<?, ?> sorceryKnackDescCol; // Value injected by FXMLLoader

        @FXML // fx:id="sorceryKnackNameCol"
        private TableColumn<?, ?> sorceryKnackNameCol; // Value injected by FXMLLoader

        @FXML // fx:id="sorceryTable"
        private TableView<?> sorceryTable; // Value injected by FXMLLoader

        @FXML // fx:id="swordSchoolNameCol"
        private TableColumn<?, ?> swordSchoolNameCol; // Value injected by FXMLLoader

        @FXML // fx:id="swordSchoolRankCol"
        private TableColumn<?, ?> swordSchoolRankCol; // Value injected by FXMLLoader

        @FXML // fx:id="swordsmanSchoolTable"
        private TableView<?> swordsmanSchoolTable; // Value injected by FXMLLoader

        @FXML // fx:id="weaponToHitCol"
        private TableColumn<?, ?> weaponToHitCol; // Value injected by FXMLLoader

        @FXML // fx:id="weaponTypeCol"
        private TableColumn<?, ?> weaponTypeCol; // Value injected by FXMLLoader

        @FXML // fx:id="weaponsTable"
        private TableView<?> weaponsTable; // Value injected by FXMLLoader

        @FXML //fx:id="saveButton"
        private Button saveButton; //Value injected by FXMLLoader

    public void onSaveButton(ActionEvent actionEvent) {
    }
}
