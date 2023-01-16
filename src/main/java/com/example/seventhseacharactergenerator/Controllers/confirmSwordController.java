package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'confirmSwordSchoolPage.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class confirmSwordController {

        @FXML // fx:id="continueButton"
        private Button continueButton; // Value injected by FXMLLoader

        @FXML // fx:id="myNation"
        private Label myNation; // Value injected by FXMLLoader

        @FXML // fx:id="noSwordSchool"
        private Label noSwordSchool; // Value injected by FXMLLoader

        @FXML // fx:id="otherNation"
        private Rectangle otherNation; // Value injected by FXMLLoader

        @FXML // fx:id="swordSchoolDescription"
        private Label swordSchoolDescription; // Value injected by FXMLLoader

        @FXML
        void onClick(MouseEvent event) {

        }

        @FXML
        void onContinue(ActionEvent event) {
                try {
                        Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/increaseTraitsPage-view.fxml"));
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        @FXML
        void onMyNation(MouseEvent event) {

        }

        @FXML
        void onNoSwordSchool(MouseEvent event) {

        }
}
