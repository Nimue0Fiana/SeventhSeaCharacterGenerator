package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'characterSummaryPage.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.Models.Advantages;
import com.example.seventhseacharactergenerator.Models.Knack;
import com.example.seventhseacharactergenerator.Models.SorceryKnack;
import com.example.seventhseacharactergenerator.Models.SwordsmanKnack;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordsman;
import static com.example.seventhseacharactergenerator.Controllers.personalInfoController.tempCharacter;

public class characterSummaryController implements Initializable {

    int brawn;
    int finesse;
    int wits;
    int resolve;
    int panache;

    String name;
    String playerName;
    String nation;
    String sorcery;
    String swordsmanSchool;

    ObservableList<Advantages> advantages;
    ObservableList<SorceryKnack> sorceryKnacks;
    ObservableList<SwordsmanKnack> swordsmanKnacks;

    ObservableList<Knack> knacks;
    @FXML
    public Circle brawn1;

    @FXML
    public Circle brawn2;

    @FXML
    public Circle brawn3;

    @FXML
    public Circle finesse1;

    @FXML
    public Circle finesse2;

    @FXML
    public Circle finesse3;

    @FXML
    public Circle wits1;

    @FXML
    public Circle wits2;

    @FXML
    public Circle wits3;

    @FXML
    public Circle resolve1;

    @FXML
    public Circle resolve2;

    @FXML
    public Circle resolve3;

    @FXML
    public Circle panache1;

    @FXML
    public Circle panache2;

    @FXML
    public Circle panache3;

    @FXML
    public Label descriptionLabel;

    @FXML
    public Label sorceryLabel;

    @FXML
    public Label swordsmanSchoolLabel;
    @FXML // fx:id="DRCol"
    private TableColumn<?, ?> DRCol; // Value injected by FXMLLoader

    @FXML // fx:id="advantageNameCol"
    private TableColumn<?, ?> advantageNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="advantageTable"
    private TableView<Advantages> advantageTable; // Value injected by FXMLLoader

    @FXML // fx:id="characterName"
    private Label characterName; // Value injected by FXMLLoader

    @FXML // fx:id="knackDescCol"
    private TableColumn<?, ?> knackDescCol; // Value injected by FXMLLoader

    @FXML // fx:id="knackNameCol"
    private TableColumn<?, ?> knackNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="knackRankCol"
    private TableColumn<?, ?> knackRankCol; // Value injected by FXMLLoader

    @FXML // fx:id="nation"
    private Label nationLabel; // Value injected by FXMLLoader

    @FXML // fx:id="playerName"
    private Label playerNameLabel; // Value injected by FXMLLoader

    @FXML // fx:id="skillsTable"
    private TableView<Knack> skillsTable; // Value injected by FXMLLoader

    @FXML // fx:id="sorKnackRankCol"
    private TableColumn<?, ?> sorKnackRankCol; // Value injected by FXMLLoader

    @FXML // fx:id="sorceryKnackDescCol"
    private TableColumn<?, ?> sorceryKnackDescCol; // Value injected by FXMLLoader

    @FXML // fx:id="sorceryKnackNameCol"
    private TableColumn<?, ?> sorceryKnackNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="sorceryTable"
    private TableView<SorceryKnack> sorceryTable; // Value injected by FXMLLoader

    @FXML // fx:id="swordSchoolNameCol"
    private TableColumn<?, ?> swordSchoolNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="swordSchoolRankCol"
    private TableColumn<?, ?> swordSchoolRankCol; // Value injected by FXMLLoader

    @FXML // fx:id="swordsmanSchoolTable"
    private TableView<SwordsmanKnack> swordsmanSchoolTable; // Value injected by FXMLLoader


    @FXML //fx:id="saveButton"
    private Button saveButton; //Value injected by FXMLLoader

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("TempChar: " + tempCharacter);
        System.out.println("TempSorcerer: " + tempSorcerer.getSorcery().getName() + tempSorcerer.getSorceries());
        System.out.println(tempSwordsman);
        System.out.println("tempSwordSorcerer: " + tempSwordSorcerer.getSorcery() + tempSwordSorcerer.getSorceries());
        if (tempCharacter.isSorcerer() && tempCharacter.isSwordsman()) {
            brawn = tempSwordSorcerer.getBrawn();
            System.out.println(tempSwordSorcerer.getBrawn());
            finesse = tempSwordSorcerer.getFinesse();
            wits = tempSwordSorcerer.getWits();
            resolve = tempSwordSorcerer.getResolve();
            panache = tempSwordSorcerer.getPanache();

            name = tempSwordSorcerer.getName();
            playerName = tempSwordSorcerer.getPlayer();
            nation = tempSwordSorcerer.getNation().getNation_name();
            sorcery = tempSwordSorcerer.getSorceries().toString();
            if (tempSwordSorcerer.getSorceries().size() == 0) {
                sorcery = tempSwordSorcerer.getSorcery().getName();
            }
            swordsmanSchool = tempSwordSorcerer.getSwordsmanSchools().toString();

            advantages = tempSwordSorcerer.getAdvantages();
            sorceryKnacks = tempSwordSorcerer.getSorceryKnacks1();
            sorceryKnacks.addAll(tempSwordSorcerer.getSorceryKnacks2());

            swordsmanKnacks = tempSwordSorcerer.getSwordsmanKnacks();

            knacks = tempSwordSorcerer.getKnacks();

        } else if (tempCharacter.isSwordsman()) {
            brawn = tempSwordsman.getBrawn();
            finesse = tempSwordsman.getFinesse();
            wits = tempSwordsman.getWits();
            resolve = tempSwordsman.getResolve();
            panache = tempSwordsman.getPanache();

            name = tempSwordsman.getName();
            playerName = tempSwordsman.getPlayer();
            nation = tempSwordsman.getNation().getNation_name();
            sorcery = "N/A";
            swordsmanSchool = tempSwordsman.getSwordsmanSchools().toString();
            advantages = tempSwordsman.getAdvantages();

            swordsmanKnacks = tempSwordsman.getSwordsmanKnacks();

            knacks = tempSwordsman.getKnacks();
        } else if (tempCharacter.isSorcerer()) {
            brawn = tempSorcerer.getBrawn();
            finesse = tempSorcerer.getFinesse();
            wits = tempSorcerer.getWits();
            resolve = tempSorcerer.getResolve();
            panache = tempSorcerer.getPanache();

            name = tempSorcerer.getName();
            playerName = tempSorcerer.getPlayer();
            nation = tempSorcerer.getNation().getNation_name();
            sorcery = tempSorcerer.getSorceries().toString();
            if (tempSorcerer.getSorceries() == null) {
                sorcery = tempSorcerer.getSorcery().getName();
            }
            swordsmanSchool = "N/A";

            advantages = tempSorcerer.getAdvantages();
            sorceryKnacks = tempSorcerer.getSorceryKnacks1();
            sorceryKnacks.addAll(tempSorcerer.getSorceryKnacks2());


            knacks = tempSorcerer.getKnacks();
        } else {
            brawn = tempCharacter.getBrawn();
            finesse = tempCharacter.getFinesse();
            wits = tempCharacter.getWits();
            resolve = tempCharacter.getResolve();
            panache = tempCharacter.getPanache();

            name = tempCharacter.getName();
            playerName = tempCharacter.getPlayer();
            nation = tempCharacter.getNation().getNation_name();
            sorcery = "N/A";
            swordsmanSchool = "N/A";

            advantages = tempCharacter.getAdvantages();

            knacks = tempCharacter.getKnacks();
        }
        //Set Brawn
        if (brawn == 3) {
            brawn2.setFill(Paint.valueOf("black"));
            brawn3.setFill(Paint.valueOf("black"));
        } else if (brawn == 2) {
            brawn2.setFill(Paint.valueOf("black"));
        }
        //Set Finesse
        if (finesse == 3) {
            finesse3.setFill(Paint.valueOf("black"));
            finesse2.setFill(Paint.valueOf("black"));
        } else if (finesse == 2) {
            finesse2.setFill(Paint.valueOf("black"));
        }
        //Set Wits
        if (wits == 3) {
            wits3.setFill(Paint.valueOf("black"));
            wits2.setFill(Paint.valueOf("black"));
        } else if (wits == 2) {
            wits2.setFill(Paint.valueOf("black"));
        }
        //Set Resolve
        if (resolve == 3) {
            resolve3.setFill(Paint.valueOf("black"));
            resolve2.setFill(Paint.valueOf("black"));
        } else if (resolve == 2) {
            resolve2.setFill(Paint.valueOf("black"));
        }
        //Set Panache
        if (panache == 3) {
            panache3.setFill(Paint.valueOf("black"));
            panache2.setFill(Paint.valueOf("black"));
        } else if (panache == 2) {
            panache2.setFill(Paint.valueOf("black"));
        }

        //Set Labels
        characterName.setText("Name: " + name);
        playerNameLabel.setText("Player: " + playerName);
        nationLabel.setText("Nationality: " + nation);
        sorceryLabel.setText("Sorcery: " + sorcery);
        swordsmanSchoolLabel.setText("Swordsman School: " + swordsmanSchool);

        //Populate tables

        //Advantage Table
        if (advantages != null) {
            advantageTable.setItems(advantages);
            advantageNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        }
        advantageTable.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                if (advantageTable.getSelectionModel().getSelectedItem() != null) {
                    descriptionLabel.setVisible(true);
                    descriptionLabel.setText("Advantage: " + advantageTable.getSelectionModel().getSelectedItem().getName() +
                            " - " + advantageTable.getSelectionModel().getSelectedItem().getDescription());
                }
            }
        });


        //Sorcery Knacks Table
        if (sorceryKnacks != null) {
            sorceryTable.setItems(sorceryKnacks);
            sorceryKnackNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
            sorceryKnackDescCol.setCellValueFactory(new PropertyValueFactory<>("description"));
            sorKnackRankCol.setCellValueFactory(new PropertyValueFactory<>("knackLevel"));
        }
        sorceryTable.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                if (sorceryTable.getSelectionModel().getSelectedItem() != null) {
                    descriptionLabel.setVisible(true);
                    descriptionLabel.setText("Sorcery Knack: " + sorceryTable.getSelectionModel().getSelectedItem().getName() +
                            " - " + sorceryTable.getSelectionModel().getSelectedItem().getDescription());
                }
            }
        });

        //Swordsman Knacks Table
        if (swordsmanKnacks != null) {
            swordsmanSchoolTable.setItems(swordsmanKnacks);
            swordSchoolNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
            swordSchoolRankCol.setCellValueFactory(new PropertyValueFactory<>("knackLevel"));
        }
        swordsmanSchoolTable.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                if (swordsmanSchoolTable.getSelectionModel().getSelectedItem() != null) {
                    descriptionLabel.setVisible(true);
                    descriptionLabel.setText("Swordsman Knack: " + swordsmanSchoolTable.getSelectionModel().getSelectedItem().getName() +
                            " - " + swordsmanSchoolTable.getSelectionModel().getSelectedItem().getDescription());
                }
            }
        });

        //Knacks Table
        if (knacks != null) {
            skillsTable.setItems(knacks);
            knackNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
            knackDescCol.setCellValueFactory(new PropertyValueFactory<>("description"));
            knackRankCol.setCellValueFactory(new PropertyValueFactory<>("knackLevel"));
        }
        skillsTable.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                if (skillsTable.getSelectionModel().getSelectedItem() != null) {
                    descriptionLabel.setText("Knack: " + skillsTable.getSelectionModel().getSelectedItem().getName() +
                            " - " + skillsTable.getSelectionModel().getSelectedItem().getDescription());
                    descriptionLabel.setVisible(true);
                }
            }
        });

    }

    public void onSaveButton(ActionEvent actionEvent) {
    }

}
