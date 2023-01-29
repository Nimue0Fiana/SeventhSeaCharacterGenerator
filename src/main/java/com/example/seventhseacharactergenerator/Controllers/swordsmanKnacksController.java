/**
 * Sample Skeleton for 'swordKnacksPage-view.fxml' Controller Class
 */

package com.example.seventhseacharactergenerator.Controllers;

import com.example.seventhseacharactergenerator.Models.SwordsmanKnack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordsman;
import static com.example.seventhseacharactergenerator.Controllers.personalInfoController.tempCharacter;

public class swordsmanKnacksController implements Initializable {
    protected static ObservableList<SwordsmanKnack> swordsmanKnacks = FXCollections.observableArrayList();
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
    private TableView<SwordsmanKnack> knackTable; // Value injected by FXMLLoader

    @FXML // fx:id="rankValue"
    private Spinner<?> rankValue; // Value injected by FXMLLoader

    @FXML // fx:id="heroPointsTotal"
    private Label heroPointsTotal; // Value injected by FXMLLoader

    @FXML // fx:id="updateButton"
    private Button updateButton; // Value injected by FXMLLoader

    @FXML
    void onContinueButton(ActionEvent event) {

    }

    @FXML
    void onUpdateButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (tempCharacter.isSorcerer()){
            heroPointsTotal.setText((String.valueOf(tempSwordSorcerer.getHeroPoints())));
            swordsmanKnacks = tempSwordSorcerer.getSwordsmanKnacks();
        } else {
            heroPointsTotal.setText(String.valueOf(tempSwordsman.getHeroPoints()));
            swordsmanKnacks = tempSwordsman.getSwordsmanKnacks();
        }
        knackTable.setItems(swordsmanKnacks);

        knackNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        knackRankCol.setCellValueFactory(new PropertyValueFactory<>("knackLevel"));
        knackTable.setOnMouseClicked((MouseEvent event) -> {
            if(tempCharacter.isSorcerer()){
                tempSwordSorcerer.getSwordsmanKnacks();
            } else {
                tempSwordsman.getSwordsmanKnacks();
            }
            if(event.getButton().equals(MouseButton.PRIMARY)){
                knackName.setVisible(true);
                knackName.setText(knackTable.getSelectionModel().getSelectedItem().getName());
                knackDescription.setVisible(true);
                knackDescription.setText(knackTable.getSelectionModel().getSelectedItem().getDescription());
            }
        });
    }
}
