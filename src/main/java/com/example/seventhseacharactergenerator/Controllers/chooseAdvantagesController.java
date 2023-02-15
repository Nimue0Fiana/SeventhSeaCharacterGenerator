package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'chooseAdvantagesPage.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.DBAccess.DBAdvantage;
import com.example.seventhseacharactergenerator.Models.Advantages;
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
import javafx.scene.input.KeyEvent;
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
//TODO: Make search work
public class chooseAdvantagesController implements Initializable {

    private int initHeroPoints;
    private ObservableList<Advantages> allAdvantages = DBAdvantage.getAllAdvantages();
    private ObservableList<Advantages> purchasedAdvantages = FXCollections.observableArrayList();
    @FXML // fx:id="advantageDescriptionLabel"
    private Label advantageDescriptionLabel;

    @FXML // fx:id="availableAdvantages"
    private TableView<Advantages> availableAdvantages; // Value injected by FXMLLoader
    @FXML // fx:id="availAdvantageName"
    private TableColumn<?, ?> availAdvantageName; // Value injected by FXMLLoader
    @FXML // fx:id="availAdvantageDesc"
    private TableColumn<?, ?> availAdvantageDesc; // Value injected by FXMLLoader
    @FXML // fx:id="availAdvantageCost"
    private TableColumn<?, ?> availAdvantageCost; // Value injected by FXMLLoader


    @FXML // fx:id="chosenAdvantages"
    private TableView<Advantages> chosenAdvantages; // Value injected by FXMLLoader
    @FXML // fx:id="chosenAdvantageName"
    private TableColumn<?, ?> chosenAdvantageName; // Value injected by FXMLLoader
    @FXML // fx:id="chosenAdvantageDescription"
    private TableColumn<?, ?> chosenAdvantageDescription; // Value injected by FXMLLoader

    @FXML // fx:id="heroPointsTotal"
    private Label heroPointsTotal; // Value injected by FXMLLoader

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if (tempCharacter.isSorcerer() && tempCharacter.isSwordsman()) {
            initHeroPoints = tempSwordSorcerer.getHeroPoints();
            //purchasedAdvantages = tempSwordSorcerer.getAdvantages();
        } else if (tempCharacter.isSwordsman()) {
            initHeroPoints = tempSwordsman.getHeroPoints();
            //purchasedAdvantages = tempSwordsman.getAdvantages();
        } else if (tempCharacter.isSorcerer()) {
            initHeroPoints = tempSorcerer.getHeroPoints();
            //purchasedAdvantages = tempSorcerer.getAdvantages();
        } else {
            initHeroPoints = tempCharacter.getHeroPoints();
            //purchasedAdvantages = tempCharacter.getAdvantages();
        }
        heroPointsTotal.setText(String.valueOf(initHeroPoints));

        availableAdvantages.setItems(allAdvantages);
        availAdvantageName.setCellValueFactory(new PropertyValueFactory<>("name"));
        availAdvantageDesc.setCellValueFactory(new PropertyValueFactory<>("description"));
        availAdvantageCost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        availableAdvantages.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                advantageDescriptionLabel.setVisible(true);
                advantageDescriptionLabel.setText(availableAdvantages.getSelectionModel().getSelectedItem().getName()
                        + ": " + availableAdvantages.getSelectionModel().getSelectedItem().getDescription());
            }
        });
        chosenAdvantages.setItems(purchasedAdvantages);
        chosenAdvantageName.setCellValueFactory(new PropertyValueFactory<>("name"));
        chosenAdvantageDescription.setCellValueFactory(new PropertyValueFactory<>("description"));


    }

    @FXML
    void onAddSelected(ActionEvent event) {
        Advantages selectedAdvantage = availableAdvantages.getSelectionModel().getSelectedItem();
        if(selectedAdvantage == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please select an advantage to add.");
            alert.showAndWait();
        } else {
            purchasedAdvantages.add(selectedAdvantage);
            allAdvantages.remove(selectedAdvantage);
            initHeroPoints = initHeroPoints - selectedAdvantage.getCost();
            heroPointsTotal.setText(String.valueOf(initHeroPoints));
        }
    }

    public void onRemoveSelected(ActionEvent actionEvent) {
        Advantages selectedAdvantage = chosenAdvantages.getSelectionModel().getSelectedItem();
        if(selectedAdvantage == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please select an advantage to remove.");
            alert.showAndWait();
        } else {
            allAdvantages.add(selectedAdvantage);
            purchasedAdvantages.remove(selectedAdvantage);
            initHeroPoints = initHeroPoints + selectedAdvantage.getCost();
            heroPointsTotal.setText(String.valueOf(initHeroPoints));
        }
    }


    @FXML
    void onContinueButton(ActionEvent event) {
        if (initHeroPoints < 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "You've spent too many points.\n Remove some advantages and try again.");
            alert.showAndWait();
        } else {
            if (tempCharacter.isSorcerer() && tempCharacter.isSwordsman()) {
                tempSwordSorcerer.setHeroPoints(initHeroPoints);
                tempSwordSorcerer.setAdvantages(purchasedAdvantages);
            } else if (tempCharacter.isSwordsman()) {
                tempSwordsman.setHeroPoints(initHeroPoints);
                tempSwordsman.setAdvantages(purchasedAdvantages);
            } else if (tempCharacter.isSorcerer()) {
                tempSorcerer.setHeroPoints(initHeroPoints);
                tempSorcerer.setAdvantages(purchasedAdvantages);
            } else {
                tempCharacter.setHeroPoints(initHeroPoints);
                tempCharacter.setAdvantages(purchasedAdvantages);
            }
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
    }

}
