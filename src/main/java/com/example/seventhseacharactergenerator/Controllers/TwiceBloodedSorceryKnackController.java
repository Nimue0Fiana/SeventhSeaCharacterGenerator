package com.example.seventhseacharactergenerator.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;

public class TwiceBloodedSorceryKnackController implements Initializable {

        @FXML
        private Button addButton;

        @FXML
        private TableColumn<?, ?> availKnacksCol1;

        @FXML
        private TableColumn<?, ?> availKnacksCol2;

        @FXML
        private TableColumn<?, ?> availableSkillNameCol1;

        @FXML
        private TableColumn<?, ?> availableSkillNameCol2;

        @FXML
        private TableView<?> availableSkillsTable;

        @FXML
        private TableView<?> availableSkillsTable2;

        @FXML
        private TableColumn<?, ?> chosenAttachedKnackCol;

        @FXML
        private Button chosenGoButton;

        @FXML
        private TextField chosenSearch;

        @FXML
        private TableColumn<?, ?> chosenSkillCol;

        @FXML
        private TableView<?> chosenSkillsTable;

        @FXML
        private Button continueButton;

        @FXML
        private Label sorcery1Name;

        @FXML
        private Label sorcery1Points;

        @FXML
        private Label sorcery2Name;

        @FXML
        private Label sorcery2Points;

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                sorcery1Points.setText(String.valueOf(tempSorcerer.getSorceryPoints1()));
                sorcery2Points.setText(String.valueOf(tempSorcerer.getSorceryPoints2()));
                //sorcery1Name.setText();
        }
        @FXML
        public void onAddSelected(ActionEvent actionEvent) {
        }

        @FXML
        void onContinue(ActionEvent event) {

        }
}
