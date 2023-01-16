package com.example.seventhseacharactergenerator.Controllers;
/**
 * Sample Skeleton for 'personalInfoPage.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.Models.PlayerCharacter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class personalInfoController {
        private int id = -1;
        private String PCName;
        private String player;
        private String gender;
        public static PlayerCharacter tempCharacter = new PlayerCharacter();

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
        @FXML //fx:id="errorMessage"
        public Label errorMessage; // // Value injected by FXMLLoader

        public void onContinue(ActionEvent actionEvent) {
                if(playerName.getText().isBlank() || characterName.getText().isBlank()) {
                        errorMessage.setText("Please fill all fields before continuing.");
                        errorMessage.setVisible(true);
                }
                PCName = characterName.getText();
                player = playerName.getText();
                if(genderMale.isSelected()) {
                        gender = "male";
                } else if (genderFemale.isSelected()) {
                        gender = "female";
                } else {
                        if(genderOther.getText().isBlank()) {
                                errorMessage.setText("Please fill all fields before continuing.");
                                errorMessage.setVisible(true);
                        } else {
                                gender = genderOther.getText();
                        }
                }
                tempCharacter.setId(id);
                tempCharacter.setName(PCName);
                tempCharacter.setPlayer(player);
                tempCharacter.setGender(gender);

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

}
