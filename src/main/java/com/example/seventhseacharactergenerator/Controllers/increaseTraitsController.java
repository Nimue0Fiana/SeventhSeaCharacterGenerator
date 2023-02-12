package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'increaseTraitsPage.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordsman;
import static com.example.seventhseacharactergenerator.Controllers.personalInfoController.tempCharacter;
public class increaseTraitsController implements Initializable {
        private int initHeroPoints;
        private int heroPoints;
        private int brawn;
        private int finesse;
        private int panache;
        private int resolve;
        private int wits;
        private int pointsSpent = 0;
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

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                if(tempCharacter.getId() == -1){
                        brawn = 0;
                        finesse = 0;
                        wits = 0;
                        panache = 0;
                        resolve = 0;
                }
                if(tempCharacter.isSorcerer() && tempCharacter.isSwordsman()) {
                        initHeroPoints = tempSwordSorcerer.getHeroPoints();
                } else if (tempCharacter.isSwordsman()) {
                        initHeroPoints = tempSwordsman.getHeroPoints();
                } else if (tempCharacter.isSorcerer()) {
                        initHeroPoints = tempSorcerer.getHeroPoints();
                } else {
                        initHeroPoints = tempCharacter.getHeroPoints();
                }
                heroPointsRemaining.setText(String.valueOf(initHeroPoints));
        }

        public void onBrawnRank1(MouseEvent mouseEvent) {
                brawnRank3.setFill(Paint.valueOf("white"));
                brawnRank2.setFill(Paint.valueOf("white"));
                brawn = 0;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));

        }

        public void onFinesseRank1(MouseEvent mouseEvent) {
                finesseRank3.setFill(Paint.valueOf("white"));
                finesseRank2.setFill(Paint.valueOf("white"));
                finesse = 0;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        public void onWitsRank1(MouseEvent mouseEvent) {
                witsRank3.setFill(Paint.valueOf("white"));
                witsRank2.setFill(Paint.valueOf("white"));
                wits = 0;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        public void onResolveRank1(MouseEvent mouseEvent) {
                resolveRank3.setFill(Paint.valueOf("white"));
                resolveRank2.setFill(Paint.valueOf("white"));
                resolve = 0;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        public void onPanacheRank1(MouseEvent mouseEvent) {
                panacheRank3.setFill(Paint.valueOf("white"));
                panacheRank2.setFill(Paint.valueOf("white"));
                panache = 0;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }
        @FXML
        void onBrawnRank2(MouseEvent event) {
                brawnRank2.setFill(Paint.valueOf("black"));
                if(brawnRank3.getFill().equals(Paint.valueOf("black"))){
                        brawnRank3.setFill(Paint.valueOf("white"));
                }
                brawn = 1;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onBrawnRank3(MouseEvent event) {
                brawnRank3.setFill(Paint.valueOf("black"));
                brawnRank2.setFill(Paint.valueOf("black"));
                brawn = 2;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onFinesseRank2(MouseEvent event) {
                finesseRank2.setFill(Paint.valueOf("black"));
                if(finesseRank3.getFill().equals(Paint.valueOf("black"))){
                        finesseRank3.setFill(Paint.valueOf("white"));
                }
                finesse = 1;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onFinesseRank3(MouseEvent event) {
                finesseRank3.setFill(Paint.valueOf("black"));
                finesseRank2.setFill(Paint.valueOf("black"));
                finesse = 2;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onPanacheRank2(MouseEvent event) {
                panacheRank2.setFill(Paint.valueOf("black"));
                if(panacheRank3.getFill().equals(Paint.valueOf("black"))){
                        panacheRank3.setFill(Paint.valueOf("white"));
                }
                panache = 1;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onPanacheRank3(MouseEvent event) {
                panacheRank3.setFill(Paint.valueOf("black"));
                panacheRank2.setFill(Paint.valueOf("black"));
                panache = 2;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onResolveRank2(MouseEvent event) {
                resolveRank2.setFill(Paint.valueOf("black"));
                if(resolveRank3.getFill().equals(Paint.valueOf("black"))){
                        resolveRank3.setFill(Paint.valueOf("white"));
                }
                resolve = 1;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onResolveRank3(MouseEvent event) {
                resolveRank3.setFill(Paint.valueOf("black"));
                resolveRank2.setFill(Paint.valueOf("black"));
                resolve = 2;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onWitsRank2(MouseEvent event) {
                witsRank2.setFill(Paint.valueOf("black"));
                if(witsRank3.getFill().equals(Paint.valueOf("black"))){
                        witsRank3.setFill(Paint.valueOf("white"));
                }
                wits = 1;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onWitsRank3(MouseEvent event) {
                witsRank3.setFill(Paint.valueOf("black"));
                witsRank2.setFill(Paint.valueOf("black"));
                wits = 2;
                pointsSpent = 8 * (brawn + finesse + wits + panache + resolve);
                heroPoints = initHeroPoints - pointsSpent;
                System.out.println(brawn + finesse + wits + panache + resolve);
                System.out.println(pointsSpent);
                System.out.println(heroPoints);
                heroPointsRemaining.setText(String.valueOf(heroPoints));
        }

        @FXML
        void onContinue(ActionEvent event) {
                if(heroPoints < 0) {
                        Alert alert = new Alert(Alert.AlertType.WARNING, "You've spent too many points.\n Decrease some traits and try again.");
                        alert.showAndWait();
                } else {
                        if (tempCharacter.isSorcerer() && tempCharacter.isSwordsman()) {
                                tempSwordSorcerer.setHeroPoints(heroPoints);
                                tempSwordSorcerer.setBrawn(brawn + 1);
                                tempSwordSorcerer.setFinesse(finesse + 1);
                                tempSwordSorcerer.setWits(wits + 1);
                                tempSwordSorcerer.setResolve(resolve + 1);
                                tempSwordSorcerer.setPanache(panache + 1);
                        } else if (tempCharacter.isSwordsman()) {
                                tempSwordsman.setHeroPoints(heroPoints);
                                tempSwordsman.setBrawn(brawn + 1);
                                tempSwordsman.setFinesse(finesse + 1);
                                tempSwordsman.setWits(wits + 1);
                                tempSwordsman.setResolve(resolve + 1);
                                tempSwordsman.setPanache(panache + 1);
                        } else if (tempCharacter.isSorcerer()) {
                                tempSorcerer.setHeroPoints(heroPoints);
                                tempSorcerer.setBrawn(brawn + 1);
                                tempSorcerer.setFinesse(finesse + 1);
                                tempSorcerer.setWits(wits + 1);
                                tempSorcerer.setResolve(resolve + 1);
                                tempSorcerer.setPanache(panache + 1);
                        } else {
                                tempCharacter.setHeroPoints(heroPoints);
                                tempCharacter.setHeroPoints(heroPoints);
                                tempCharacter.setBrawn(brawn + 1);
                                tempCharacter.setFinesse(finesse + 1);
                                tempCharacter.setWits(wits + 1);
                                tempCharacter.setResolve(resolve + 1);
                                tempCharacter.setPanache(panache + 1);
                        }
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
        }

}
