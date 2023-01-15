package com.example.seventhseacharactergenerator.controllers;

/**
 * Sample Skeleton for 'chooseNationPage.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.CharacterApplication;
import com.example.seventhseacharactergenerator.models.PlayerCharacter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class chooseNationController {
        private String name;
        @FXML // fx:id="avalon"
        private Button avalon; // Value injected by FXMLLoader

        @FXML // fx:id="castille"
        private Button castille; // Value injected by FXMLLoader

        @FXML // fx:id="continueButton"
        private Button continueButton; // Value injected by FXMLLoader

        @FXML // fx:id="montaigne"
        private Button montaigne; // Value injected by FXMLLoader

        @FXML // fx:id="nationDescription"
        private Label nationDescription; // Value injected by FXMLLoader

        @FXML // fx:id="vodacce"
        private Button vodacce; // Value injected by FXMLLoader

        @FXML
        void onAvalon(ActionEvent event) {
                nationDescription.setVisible(true);
                nationDescription.setText(CharacterApplication.nation.getDescription());
                PlayerCharacter pc = new PlayerCharacter(-1, "Villanova", "player1", 100,
                        "male", CharacterApplication.nation, 1,1,1,2,1);

        }

        @FXML
        void onCastille(ActionEvent event) {

        }

        @FXML
        void onClick(ActionEvent event) {
                try {
                        Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/confirmSorceryPage-view.fxml"));
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        @FXML
        void onMontaigne(ActionEvent event) {

        }

        @FXML
        void onVodacce(ActionEvent event) {

        }

}
