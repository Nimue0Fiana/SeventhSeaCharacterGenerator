/**
 * Sample Skeleton for 'swordKnacksPage-view.fxml' Controller Class
 */

package com.example.seventhseacharactergenerator.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class swordsmanKnacksController {

    @FXML // fx:id="continueButton"
    private Button continueButton; // Value injected by FXMLLoader

    @FXML // fx:id="knackDescription"
    private Label knackDescription; // Value injected by FXMLLoader

    @FXML // fx:id="knackName"
    private Label knackName; // Value injected by FXMLLoader

    @FXML // fx:id="knackNameCol"
    private TableColumn<?, ?> knackNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="knackRankCol"
    private TableColumn<?, ?> knackRankCol; // Value injected by FXMLLoader

    @FXML // fx:id="knackTable"
    private TableView<?> knackTable; // Value injected by FXMLLoader

    @FXML // fx:id="rankValue"
    private Spinner<?> rankValue; // Value injected by FXMLLoader

    @FXML // fx:id="sorceryPointsTotal"
    private Label sorceryPointsTotal; // Value injected by FXMLLoader

    @FXML // fx:id="updateButton"
    private Button updateButton; // Value injected by FXMLLoader

    @FXML
    void onContinueButton(ActionEvent event) {

    }

    @FXML
    void onUpdateButton(ActionEvent event) {

    }
}
