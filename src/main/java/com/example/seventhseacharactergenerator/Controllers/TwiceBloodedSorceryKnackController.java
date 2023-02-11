package com.example.seventhseacharactergenerator.Controllers;

import com.example.seventhseacharactergenerator.DBAccess.DBSorceryDegree;
import com.example.seventhseacharactergenerator.Models.SorceryKnack;
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
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;

public class TwiceBloodedSorceryKnackController implements Initializable {


    ObservableList<SorceryKnack> sorceryKnacks1 = tempSorcerer.getSorceryKnacks1();
    ObservableList<SorceryKnack> sorceryKnacks2 = tempSorcerer.getSorceryKnacks2();
    int initSorceryPoints1;
    int initSorceryPoints2;
    @FXML
    private Spinner<Integer> spinner1;

    @FXML
    private Spinner<Integer> spinner2;
    @FXML
    public Label description1;
    @FXML
    public Label description2;
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
    private TableView<SorceryKnack> availableSkillsTable;

    @FXML
    private TableView<SorceryKnack> availableSkillsTable2;

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
    private Label sorcery1PointsLabel;

    @FXML
    private Label sorcery2Name;

    @FXML
    private Label sorcery2PointsLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initSorceryPoints1 = tempSorcerer.getSorceryPoints1();
        initSorceryPoints2 = tempSorcerer.getSorceryPoints2();
        sorcery1PointsLabel.setText(String.valueOf(initSorceryPoints1));
        sorcery2PointsLabel.setText(String.valueOf(initSorceryPoints2));
        sorcery1Name.setText(tempSorcerer.getSorceries().get(0).getName());
        sorcery2Name.setText((tempSorcerer.getSorceries().get(1).getName()));

        availableSkillsTable.setItems(sorceryKnacks1);
        availableSkillsTable2.setItems(sorceryKnacks2);

        availableSkillNameCol1.setCellValueFactory(new PropertyValueFactory<>("name"));
        availKnacksCol1.setCellValueFactory(new PropertyValueFactory<>("knackLevel"));

        availableSkillNameCol2.setCellValueFactory(new PropertyValueFactory<>("name"));
        availKnacksCol2.setCellValueFactory(new PropertyValueFactory<>("knackLevel"));

        availableSkillsTable.setOnMouseClicked((MouseEvent event) -> {
            tempSorcerer.getSorceryKnacks1();
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                description1.setVisible(true);
                description1.setText(availableSkillsTable.getSelectionModel().getSelectedItem().getDescription());
            }


        });

        availableSkillsTable2.setOnMouseClicked((MouseEvent event) -> {
            tempSorcerer.getSorceryKnacks2();
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                description2.setVisible(true);
                description2.setText(availableSkillsTable2.getSelectionModel().getSelectedItem().getDescription());
            }


        });

    }

    @FXML
    public void onAddSelected(ActionEvent actionEvent) {
        int prevKnackLevel = availableSkillsTable.getSelectionModel().getSelectedItem().getKnackLevel();
        availableSkillsTable.getSelectionModel().getSelectedItem().setKnackLevel(spinner1.getValue());
        availableSkillsTable.refresh();
        int newKnackLevel = availableSkillsTable.getSelectionModel().getSelectedItem().getKnackLevel();
        initSorceryPoints1 = initSorceryPoints1 + (prevKnackLevel - newKnackLevel);
        sorcery1PointsLabel.setText(String.valueOf(initSorceryPoints1));
    }


    public void onAddSelected2(ActionEvent actionEvent) {
        int prevKnackLevel = availableSkillsTable2.getSelectionModel().getSelectedItem().getKnackLevel();
        availableSkillsTable2.getSelectionModel().getSelectedItem().setKnackLevel(spinner2.getValue());
        availableSkillsTable2.refresh();
        int newKnackLevel = availableSkillsTable2.getSelectionModel().getSelectedItem().getKnackLevel();
        initSorceryPoints2 = initSorceryPoints2 + (prevKnackLevel - newKnackLevel);
        sorcery2PointsLabel.setText(String.valueOf(initSorceryPoints2));
    }

    @FXML
    void onContinue(ActionEvent event) {

        if (initSorceryPoints1 < 0 || initSorceryPoints2 < 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "You've spent too many points.\n Reduce some knacks and try again.");
            alert.showAndWait();
        } else {
            tempSorcerer.setSorceryKnacks1(sorceryKnacks1);
            tempSorcerer.setSorceryKnacks2(sorceryKnacks2);
            tempSorcerer.setSorceryPoints1(initSorceryPoints1);
            tempSorcerer.setSorceryPoints2(initSorceryPoints2);
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/confirmSwordSchoolPage-view.fxml"));
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
