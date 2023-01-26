
/**
 * Sample Skeleton for 'chooseSwordsmanNation-view.fxml' Controller Class
 */

package com.example.seventhseacharactergenerator.Controllers;

import com.example.seventhseacharactergenerator.DBAccess.DBSwordsmanSchool;
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

import static com.example.seventhseacharactergenerator.Controllers.personalInfoController.tempCharacter;

public class chooseSchoolNationController implements Initializable {

    private ObservableList<String> nationButtons = DBSwordsmanSchool.getNonNativeSwordSchool(tempCharacter.getNation().getId());
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        school1.setText(nationButtons.get(0));
        school2.setText(nationButtons.get(1));
        school3.setText(nationButtons.get(2));
    }

    @FXML
    void onSchool1(ActionEvent event) {
        schoolDescription.setText(DBSwordsmanSchool.getSchoolDescByName(school1.getText()));
    }

    @FXML
    void onSchool2(ActionEvent event) {
        schoolDescription.setText(DBSwordsmanSchool.getSchoolDescByName(school2.getText()));
    }

    @FXML
    void onSchool3(ActionEvent event) {
        schoolDescription.setText(DBSwordsmanSchool.getSchoolDescByName(school3.getText()));
    }
//Set Swordsman Knacks to basic levels
    @FXML
    void onContinue(ActionEvent event) {
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
