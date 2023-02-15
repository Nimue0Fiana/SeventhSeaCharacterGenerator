/**
 * Sample Skeleton for 'savedCharactersReport-view.fxml' Controller Class
 */

package com.example.seventhseacharactergenerator.Controllers;

import com.example.seventhseacharactergenerator.DBAccess.DBPlayerCharacter;
import com.example.seventhseacharactergenerator.Models.PlayerCharacter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class savedCharactersReportController implements Initializable {

    ObservableList<PlayerCharacter> allPlayerCharacters = FXCollections.observableArrayList();

    @FXML // fx:id="charTable"
    private TableView<PlayerCharacter> charTable; // Value injected by FXMLLoader

    @FXML // fx:id="charNameCol"
    private TableColumn<?, ?> charNameCol; // Value injected by FXMLLoader
    @FXML // fx:id="playerCol"
    private TableColumn<?, ?> playerCol; // Value injected by FXMLLoader
    @FXML // fx:id="genderCol"
    private TableColumn<?, ?> genderCol; // Value injected by FXMLLoader
    @FXML // fx:id="nationCol"
    private TableColumn<?, ?> nationCol; // Value injected by FXMLLoader
    @FXML // fx:id="pointsCol"
    private TableColumn<?, ?> pointsCol; // Value injected by FXMLLoader
    @FXML // fx:id="timeCol"
    private TableColumn<?, ?> timeCol; // Value injected by FXMLLoader

    @FXML // fx:id="continueButton"
    private Button continueButton; // Value injected by FXMLLoader


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        allPlayerCharacters = DBPlayerCharacter.getAllCharacters();
        charTable.setItems(allPlayerCharacters);
        charNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        playerCol.setCellValueFactory(new PropertyValueFactory<>("player"));
        genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));
        nationCol.setCellValueFactory(new PropertyValueFactory<>("nationName"));
        pointsCol.setCellValueFactory(new PropertyValueFactory<>("heroPoints"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("createDate"));
    }

    @FXML
    void onBackButton(ActionEvent event) {

    }

    @FXML
    void onDeleteButton(ActionEvent event) {

    }

    @FXML
    void onEditButton(ActionEvent event) {

    }
}
