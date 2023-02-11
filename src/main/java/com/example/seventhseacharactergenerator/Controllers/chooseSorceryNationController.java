package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'chooseSorceryNation.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.DBAccess.DBNation;
import com.example.seventhseacharactergenerator.DBAccess.DBSorcery;
import com.example.seventhseacharactergenerator.DBAccess.DBSorceryDegree;
import com.example.seventhseacharactergenerator.DBAccess.DBSorceryKnack;
import com.example.seventhseacharactergenerator.Models.Nation;
import com.example.seventhseacharactergenerator.Models.Sorcery;
import com.example.seventhseacharactergenerator.Models.SorceryKnack;
import javafx.collections.ObservableList;
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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;

public class chooseSorceryNationController implements Initializable {
    Nation nation = null;

    ObservableList<Sorcery> sorceries = tempSorcerer.getSorceries();
    String characterNation;
    Sorcery sorcery;
    @FXML // fx:id="nation2Description"
    private Label nation2Description; // Value injected by FXMLLoader
    @FXML // fx:id="avalon"
    private Button avalon; // Value injected by FXMLLoader


    @FXML // fx:id="continueButton"
    private Button continueButton; // Value injected by FXMLLoader

    @FXML // fx:id="montaigne"
    private Button montaigne; // Value injected by FXMLLoader

    @FXML // fx:id="vodacce"
    private Button vodacce; // Value injected by FXMLLoader

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        characterNation = tempSorcerer.getNation().getNation_name();
        if (characterNation.equals("vodacce") || (tempSorcerer.getGender().equals("male"))) {
            vodacce.setDisable(true);
        }
        if (characterNation.equals("montaigne")) {
            montaigne.setDisable(true);
        }
        if (characterNation.equals("avalon")) {
            avalon.setDisable(true);
        }

    }

    @FXML
    void onAvalon(ActionEvent event) {
        nation = DBNation.getNationByName("avalon");
        nation2Description.setText(nation.getDescription());
        nation2Description.setVisible(true);
    }

    @FXML
    void onMontaigne(ActionEvent event) {
        nation = DBNation.getNationByName("montaigne");
        nation2Description.setText(nation.getDescription());
        nation2Description.setVisible(true);
    }

    @FXML
    void onVodacce(ActionEvent event) {
        nation = DBNation.getNationByName("vodacce");
        nation2Description.setText(nation.getDescription());
        nation2Description.setVisible(true);
    }

    @FXML
    void onClick(ActionEvent event) {
        if (nation == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please choose a nation to use as your second sorcery.");
            alert.showAndWait();
        } else {
            sorcery = DBSorcery.getSorceryByNationId(nation.getId());
            tempSorcerer.addSorcery(sorcery);
            tempSorcerer.addSorceryDegree(DBSorceryDegree.getSorceryDegreeBySorcery(sorcery.getId()));
            ObservableList<SorceryKnack> sorceryKnacks = DBSorceryKnack.getAllKnacksForSorcery(sorcery.getId());
            tempSorcerer.setSorceryKnacks2(sorceryKnacks);

            try {
                Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/TwiceBloodedSorceryKnack-view.fxml"));
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
