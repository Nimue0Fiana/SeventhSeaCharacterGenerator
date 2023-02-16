
/**
 * Sample Skeleton for 'chooseSwordsmanNation-view.fxml' Controller Class
 */

package com.example.seventhseacharactergenerator.Controllers;

import com.example.seventhseacharactergenerator.DBAccess.DBSwordsmanDegree;
import com.example.seventhseacharactergenerator.DBAccess.DBSwordsmanKnack;
import com.example.seventhseacharactergenerator.DBAccess.DBSwordsmanSchool;
import com.example.seventhseacharactergenerator.Models.Nation;
import com.example.seventhseacharactergenerator.Models.SwordAndSorcerer;
import com.example.seventhseacharactergenerator.Models.Swordsman;
import com.example.seventhseacharactergenerator.Models.SwordsmanSchool;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.confirmSwordController.tempSwordsman;
import static com.example.seventhseacharactergenerator.Controllers.personalInfoController.tempCharacter;

public class chooseSchoolNationController implements Initializable {
    private int heroType; //0=playerCharacter, 1=sorcerer, 2=swordsman, 3=both sorcerer and swordsman
    private boolean isSwordsman;
    SwordsmanSchool school;

    private ObservableList<SwordsmanSchool> nationButtons = DBSwordsmanSchool.getNonNativeSwordSchool(tempCharacter.getNation().getId());
    @FXML // fx:id="continueButton"
    private Button continueButton; // Value injected by FXMLLoader

    @FXML // fx:id="school1"
    private Button school1; // Value injected by FXMLLoader

    @FXML // fx:id="school2"
    private Button school2; // Value injected by FXMLLoader

    @FXML // fx:id="school3"
    private Button school3; // Value injected by FXMLLoader

    @FXML // fx:id="schoolDescription"
    private Label schoolDescription; // Value injected by FXMLLoader

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        school1.setText(nationButtons.get(0).getName());
        school2.setText(nationButtons.get(1).getName());
        school3.setText(nationButtons.get(2).getName());
    }

    /**
     * @param event
     */
    @FXML
    void onSchool1(ActionEvent event) {
        school = nationButtons.get(0);
        schoolDescription.setVisible(true);
        schoolDescription.setText("School: " + school.getName() + " - " + school.getDescription());

    }

    /**
     * @param event
     */
    @FXML
    void onSchool2(ActionEvent event) {
        school = nationButtons.get(1);
        schoolDescription.setVisible(true);
        schoolDescription.setText("School: " + school.getName() + " - " + school.getDescription());
    }

    /**
     * @param event
     */
    @FXML
    void onSchool3(ActionEvent event) {
        school = nationButtons.get(2);
        schoolDescription.setVisible(true);
        schoolDescription.setText("School: " + school.getName() + " - " + school.getDescription());
    }

    /**
     * @param event
     */
//Set Swordsman Knacks to basic levels
    @FXML
    void onContinue(ActionEvent event) {
        if (tempCharacter.isSorcerer()) {
            tempSwordSorcerer.addSwordsmanSchool(school);
            tempSwordSorcerer.addSwordsmanDegree(DBSwordsmanDegree.getSwordsmanDegreeBySchoolId(school.getId()));
            tempSwordSorcerer.setSwordsmanKnacks(DBSwordsmanKnack.getInitKnacksForSwordsman(school.getId()));
            System.out.println(tempSwordSorcerer.getName());
            System.out.println(tempSwordSorcerer);
        } else {
            tempSwordsman.addSwordsmanSchool(school);
            tempSwordsman.addSwordsmanDegree(DBSwordsmanDegree.getSwordsmanDegreeBySchoolId(school.getId()));
            tempSwordsman.setSwordsmanKnacks(DBSwordsmanKnack.getInitKnacksForSwordsman(school.getId()));
            System.out.println(tempSwordsman.getName());
            System.out.println(tempSwordsman);
        }
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/swordKnacksPage-view.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
