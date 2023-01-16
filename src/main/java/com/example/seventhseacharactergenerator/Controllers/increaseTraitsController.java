package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'increaseTraitsPage.fxml' Controller Class
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
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class increaseTraitsController {

        @FXML // fx:id="brawnRank2"
        private Circle brawnRank2; // Value injected by FXMLLoader

        @FXML // fx:id="brawnRank3"
        private Circle brawnRank3; // Value injected by FXMLLoader

        @FXML // fx:id="continueButton"
        private Button continueButton; // Value injected by FXMLLoader

        @FXML // fx:id="finesseRank2"
        private Circle finesseRank2; // Value injected by FXMLLoader

        @FXML // fx:id="finesseRank3"
        private Circle finesseRank3; // Value injected by FXMLLoader

        @FXML // fx:id="heroPointsRemaining"
        private Label heroPointsRemaining; // Value injected by FXMLLoader

        @FXML // fx:id="panacheRank2"
        private Circle panacheRank2; // Value injected by FXMLLoader

        @FXML // fx:id="panacheRank3"
        private Circle panacheRank3; // Value injected by FXMLLoader

        @FXML // fx:id="resolveRank2"
        private Circle resolveRank2; // Value injected by FXMLLoader

        @FXML // fx:id="resolveRank3"
        private Circle resolveRank3; // Value injected by FXMLLoader

        @FXML // fx:id="witsRank2"
        private Circle witsRank2; // Value injected by FXMLLoader

        @FXML // fx:id="witsRank3"
        private Circle witsRank3; // Value injected by FXMLLoader

        @FXML
        void onBrawnRank2(MouseEvent event) {

        }

        @FXML
        void onBrawnRank3(MouseEvent event) {

        }

        @FXML
        void onContinue(ActionEvent event) {
                try {
                        Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/chooseAdvantagesPage-view.fxml"));
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        @FXML
        void onFinesseRank2(MouseEvent event) {

        }

        @FXML
        void onFinesseRank3(MouseEvent event) {

        }

        @FXML
        void onPanacheRank2(MouseEvent event) {

        }

        @FXML
        void onPanacheRank3(MouseEvent event) {

        }

        @FXML
        void onResolveRank2(MouseEvent event) {

        }

        @FXML
        void onResolveRank3(MouseEvent event) {

        }

        @FXML
        void onWitsRank2(MouseEvent event) {

        }

        @FXML
        void onWitsRank3(MouseEvent event) {

        }
}
