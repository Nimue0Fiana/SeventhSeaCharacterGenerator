package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'confirmSwordSchoolPage.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.DBAccess.DBSwordsmanDegree;
import com.example.seventhseacharactergenerator.DBAccess.DBSwordsmanKnack;
import com.example.seventhseacharactergenerator.DBAccess.DBSwordsmanSchool;
import com.example.seventhseacharactergenerator.Models.Sorcery;
import com.example.seventhseacharactergenerator.Models.SwordAndSorcerer;
import com.example.seventhseacharactergenerator.Models.Swordsman;
import com.example.seventhseacharactergenerator.Models.SwordsmanSchool;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;
import static com.example.seventhseacharactergenerator.Controllers.personalInfoController.tempCharacter;

public class confirmSwordController implements Initializable {
    public static SwordAndSorcerer tempSwordSorcerer = new SwordAndSorcerer();
    public static Swordsman tempSwordsman = new Swordsman();
    SwordsmanSchool swordsmanSchool = null;
    private int heroType; //0=playerCharacter, 1=sorcerer, 2=swordsman, 3=both sorcerer and swordsman
    private boolean isSwordsman;
    private int nationId;
    String schoolName;
    String schoolDesc;
    String nextPage;
    @FXML // fx:id heroPointsTotal
    private Label heroPointsTotal; //Value injected by FXMLLoader
    @FXML // fx:id="continueButton"
    private Button continueButton; // Value injected by FXMLLoader

    @FXML // fx:id="myNation"
    private Button myNation; // Value injected by FXMLLoader

    @FXML // fx:id="noSwordSchool"
    private Button noSwordSchool; // Value injected by FXMLLoader

    @FXML // fx:id="otherNation"
    private Button otherNation; // Value injected by FXMLLoader

    @FXML // fx:id="swordSchoolDescription"
    private Label swordSchoolDescription; // Value injected by FXMLLoader

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (tempCharacter.isSorcerer()) {
            heroType = 1;
            heroPointsTotal.setText(String.valueOf(tempSorcerer.getHeroPoints()));
        } else {
            heroType = 0;
            heroPointsTotal.setText(String.valueOf(tempCharacter.getHeroPoints()));
        }
    }

    @FXML
    void onMyNation(ActionEvent event) {
        if (heroType == 0) {
            nationId = tempCharacter.getNation().getId();
            swordsmanSchool = DBSwordsmanSchool.getSwordSchoolById(nationId);
            schoolName = DBSwordsmanSchool.getSwordSchoolNameById(nationId);
            schoolDesc = DBSwordsmanSchool.getSwordSchoolDescById(nationId);

        } else if (heroType == 1) {
            nationId = tempSorcerer.getNation().getId();
            swordsmanSchool = DBSwordsmanSchool.getSwordSchoolById(nationId);
            schoolName = DBSwordsmanSchool.getSwordSchoolNameById(nationId);
            schoolDesc = DBSwordsmanSchool.getSwordSchoolDescById(nationId);
        }
        //25 points
        isSwordsman = true;
        swordSchoolDescription.setVisible(true);
        swordSchoolDescription.setText("Cost: 25 points\nSchool: " + schoolName + " - " + schoolDesc);
        nextPage = "/com/example/seventhseacharactergenerator/swordKnacksPage-view.fxml";
    }

    @FXML
    void onOther(ActionEvent event) {
        isSwordsman = true;
        swordsmanSchool = null;
        swordSchoolDescription.setText("Cost: 35 points");
        nextPage = "/com/example/seventhseacharactergenerator/chooseSwordsmanNation-view.fxml";
    }

    @FXML
    void onNoSwordSchool(ActionEvent event) {
        isSwordsman = false;
        swordsmanSchool = null;
        nextPage = "/com/example/seventhseacharactergenerator/increaseTraitsPage-view.fxml";
    }

    @FXML
    void onContinue(ActionEvent event) {
        tempCharacter.setSwordsman(isSwordsman);

        if (tempCharacter.isSwordsman()) {
            if (tempCharacter.isSorcerer() && tempCharacter.isSwordsman()) {
                if (tempSorcerer.getBlood() == 3) {
                    tempSwordSorcerer = tempSwordSorcerer.transformDoubleSorcererToSwordSorcerer(tempSorcerer);
                    if(swordsmanSchool != null) {
                        tempSwordSorcerer.addSwordsmanSchool(swordsmanSchool);
                        tempSwordSorcerer.addSwordsmanDegree(DBSwordsmanDegree.getSwordsmanDegreeBySchoolId(swordsmanSchool.getId()));
                        tempSwordSorcerer.setSwordsmanKnacks(DBSwordsmanKnack.getInitKnacksForSwordsman(swordsmanSchool.getId()));
                        tempSwordSorcerer.setHeroPoints(tempSwordSorcerer.getHeroPoints() - 25);
                    } else {
                        tempSwordSorcerer.setHeroPoints(tempSwordSorcerer.getHeroPoints() - 35);
                    }
                } else {
                    if(swordsmanSchool != null) {
                        tempSwordSorcerer = tempSwordSorcerer.transformSorcererToSwordAndSorcerer(tempSorcerer);
                        tempSwordSorcerer.addSwordsmanSchool(swordsmanSchool);
                        tempSwordSorcerer.addSwordsmanDegree(DBSwordsmanDegree.getSwordsmanDegreeBySchoolId(swordsmanSchool.getId()));
                        tempSwordSorcerer.setSwordsmanKnacks(DBSwordsmanKnack.getInitKnacksForSwordsman(swordsmanSchool.getId()));
                        tempSwordSorcerer.setHeroPoints(tempSwordSorcerer.getHeroPoints() - 25);
                    } else {
                        tempSwordSorcerer = tempSwordSorcerer.transformSorcererToSwordAndSorcerer(tempSorcerer);
                        tempSwordSorcerer.setHeroPoints(tempSwordSorcerer.getHeroPoints() - 35);
                    }

                }
            } else if (!tempCharacter.isSorcerer()) {
                if(swordsmanSchool != null) {
                    tempSwordsman = tempSwordsman.transformPCToSwordsman(tempCharacter);
                    tempSwordsman.addSwordsmanSchool(swordsmanSchool);
                    tempSwordsman.addSwordsmanDegree(DBSwordsmanDegree.getSwordsmanDegreeBySchoolId(swordsmanSchool.getId()));
                    tempSwordsman.setSwordsmanKnacks(DBSwordsmanKnack.getInitKnacksForSwordsman(swordsmanSchool.getId()));
                    tempSwordsman.setHeroPoints(tempSwordsman.getHeroPoints() - 25);
                } else {
                    tempSwordsman = tempSwordsman.transformPCToSwordsman(tempCharacter);
                    tempSwordsman.setHeroPoints(tempSwordsman.getHeroPoints() - 35);
                }

            }
            System.out.println(String.valueOf(tempSwordsman.getHeroPoints()));
        }
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
