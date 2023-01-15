package com.example.seventhseacharactergenerator.controllers;
/**
 * Sample Skeleton for 'personalInfoPage.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class personalInfoController {
        private String name;

        @FXML // fx:id="characterName"
        private TextField characterName; // Value injected by FXMLLoader

        @FXML // fx:id="genderFemale"
        private RadioButton genderFemale; // Value injected by FXMLLoader

        @FXML // fx:id="genderMale"
        private RadioButton genderMale; // Value injected by FXMLLoader

        @FXML // fx:id="genderOther"
        private TextField genderOther; // Value injected by FXMLLoader

        @FXML // fx:id="other"
        private RadioButton other; // Value injected by FXMLLoader

        @FXML // fx:id="playerName"
        private TextField playerName; // Value injected by FXMLLoader

        public void onContinue(ActionEvent actionEvent) {
                name = characterName.getText();

                try {
                        Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/chooseNationPage-view.fxml"));
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                        
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        public void onOther(ActionEvent actionEvent) {
        }
}
