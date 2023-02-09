package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'knacksPage.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.Models.Knack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordsman;
import static com.example.seventhseacharactergenerator.Controllers.personalInfoController.tempCharacter;

public class knacksController implements Initializable {

    private int initHeroPoints;
    private int initKnackPoints;
    private ObservableList<Knack> purchasedKnacks = FXCollections.observableArrayList();
    @FXML // fx:id="continueButton"
    private Button continueButton; // Value injected by FXMLLoader
    @FXML //fx:id="knackName"
    private Label knackName; //Value injected by FXMLLoader
    @FXML // fx:id="heroPointsTotal"
    private Label heroPointsTotal; // Value injected by FXMLLoader

    @FXML // fx:id="knackDescription"
    private Label knackDescription; // Value injected by FXMLLoader

    @FXML // fx:id="knackNameCol"
    private TableColumn<?, ?> knackNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="knackTable"
    private TableView<Knack> knackTable; // Value injected by FXMLLoader

    @FXML // fx:id="rankCol"
    private TableColumn<?, ?> rankCol; // Value injected by FXMLLoader

    @FXML // fx:id="rankValue"
    private Spinner<Integer> rankValue; // Value injected by FXMLLoader

    @FXML // fx:id="sourceSkillCol"
    private TableColumn<?, ?> sourceSkillCol; // Value injected by FXMLLoader

    @FXML // fx:id="updateButton"
    private Button updateButton; // Value injected by FXMLLoader

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (tempCharacter.isSorcerer() && tempCharacter.isSwordsman()) {
            initHeroPoints = tempSwordSorcerer.getHeroPoints();
            purchasedKnacks = tempSwordSorcerer.getKnacks();
        } else if (tempCharacter.isSwordsman()) {
            initHeroPoints = tempSwordsman.getHeroPoints();
            purchasedKnacks = tempSwordsman.getKnacks();
        } else if (tempCharacter.isSorcerer()) {
            initHeroPoints = tempSorcerer.getHeroPoints();
            purchasedKnacks = tempSorcerer.getKnacks();
        } else {
            initHeroPoints = tempCharacter.getHeroPoints();
            purchasedKnacks = tempCharacter.getKnacks();
        }
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
        for (Knack k : purchasedKnacks
        ) {
            initKnackPoints += k.getKnackLevel();
        }

        knackTable.setItems(purchasedKnacks);
        knackNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        rankCol.setCellValueFactory(new PropertyValueFactory<>("knackLevel"));
        knackTable.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                knackName.setVisible(true);
                knackName.setText(knackTable.getSelectionModel().getSelectedItem().getName());
                knackDescription.setVisible(true);
                knackDescription.setText(knackTable.getSelectionModel().getSelectedItem().getDescription());
            }
        });
    }

    @FXML
    void onUpdateButton(ActionEvent event) {
        int prevKnackLevel = knackTable.getSelectionModel().getSelectedItem().getKnackLevel();
        knackTable.getSelectionModel().getSelectedItem().setKnackLevel(rankValue.getValue());
        knackTable.refresh();
        int newKnackLevel = knackTable.getSelectionModel().getSelectedItem().getKnackLevel();
        initHeroPoints = initHeroPoints + (prevKnackLevel - newKnackLevel);
        heroPointsTotal.setText(String.valueOf(initHeroPoints));

    }

    @FXML
    void onContinueButton(ActionEvent event) {
        if (initHeroPoints < 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "You've spent too many points.\n Reduce some skills and try again.");
            alert.showAndWait();
        } else {
            if (tempCharacter.isSorcerer() && tempCharacter.isSwordsman()) {
                tempSwordSorcerer.setHeroPoints(initHeroPoints);
                tempSwordSorcerer.setKnacks(purchasedKnacks);
            } else if (tempCharacter.isSwordsman()) {
                tempSwordsman.setHeroPoints(initHeroPoints);
                tempSwordsman.setKnacks(purchasedKnacks);
            } else if (tempCharacter.isSorcerer()) {
                tempSorcerer.setHeroPoints(initHeroPoints);
                tempSorcerer.setKnacks(purchasedKnacks);
            } else {
                tempCharacter.setHeroPoints(initHeroPoints);
                tempCharacter.setKnacks(purchasedKnacks);
            }
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/characterSummaryPage-view.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
