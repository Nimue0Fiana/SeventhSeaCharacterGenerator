package com.example.seventhseacharactergenerator.controllers;

/**
 * Sample Skeleton for 'confirmSorceryPage.fxml' Controller Class
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

public class confirmSorceryController {
        String nextPage;

        @FXML // fx:id="continueButton"
        private Button continueButton; // Value injected by FXMLLoader

        @FXML // fx:id="fullBlooded"
        private Button fullBlooded; // Value injected by FXMLLoader

        @FXML // fx:id="halfBlooded"
        private Button halfBlooded; // Value injected by FXMLLoader

        @FXML // fx:id="noSorcery"
        private Button noSorcery; // Value injected by FXMLLoader

        @FXML // fx:id="sorceryChoiceDescription"
        private Label sorceryChoiceDescription; // Value injected by FXMLLoader
        @FXML // fx:id="costLabel"
        private Label costLabel; // Value injected by FXMLLoader

        @FXML // fx:id="twiceBlooded"
        private Button twiceBlooded; // Value injected by FXMLLoader

        @FXML
        void onContinue(ActionEvent event) {
                if (nextPage == null) {
                        sorceryChoiceDescription.setVisible(true);
                        sorceryChoiceDescription.setStyle("-fx-text-fill:RED;-fx-font-weight: bold;");
                        sorceryChoiceDescription.setText("No sorcery choice detected. Please choose an option below before continuing.");
                } else {
                        try {
                                Parent root = FXMLLoader.load(getClass().getResource(nextPage));
                                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                                Scene scene = new Scene(root);
                                stage.setScene(scene);
                                stage.show();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }
        }
        @FXML
        public void onFullBlooded(ActionEvent actionEvent) {
                nextPage = "/com/example/seventhseacharactergenerator/sorceryKnacksPage-view.fxml";
                sorceryChoiceDescription.setVisible(true);
                sorceryChoiceDescription.setText("Will allow access to highest ranked magic");
                costLabel.setVisible(true);
                costLabel.setText("Cost: 40 Hero Points");
        }
        @FXML
        public void onHalfBlooded(ActionEvent actionEvent) {
                nextPage = "/com/example/seventhseacharactergenerator/sorceryKnacksPage-view.fxml";
                sorceryChoiceDescription.setVisible(true);
                sorceryChoiceDescription.setText("Your character can only ever access the first rank in magical knacks");
                costLabel.setVisible(true);
                costLabel.setText("Cost: 20 Hero Points");
        }
        @FXML
        public void onTwiceBlooded(ActionEvent actionEvent) {
                nextPage = "/com/example/seventhseacharactergenerator/sorceryKnacksPage-view.fxml";
                sorceryChoiceDescription.setVisible(true);
                sorceryChoiceDescription.setText("Your character can access magic from two bloodlines, but can only use the first rank of those knacks");
                costLabel.setVisible(true);
                costLabel.setText("Cost: 40 Hero Points");
        }
        @FXML
        public void onNoSorcery(ActionEvent actionEvent) {
                nextPage = "/com/example/seventhseacharactergenerator/confirmSwordSchoolPage-view.fxml";
                sorceryChoiceDescription.setVisible(true);
                sorceryChoiceDescription.setText("Your character does not have any magical skill");
                costLabel.setVisible(true);
                costLabel.setText("Cost: 0 Hero Points");
        }
}
