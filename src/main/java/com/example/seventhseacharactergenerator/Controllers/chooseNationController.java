package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'chooseNationPage.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.CharacterApplication;
import com.example.seventhseacharactergenerator.DBAccess.DBNation;
import com.example.seventhseacharactergenerator.Models.Nation;
import com.example.seventhseacharactergenerator.Models.PlayerCharacter;
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

public class chooseNationController implements Initializable {
        Nation nation = null;
        String nextPage = "/com/example/seventhseacharactergenerator/confirmSorceryPage-view.fxml";
        @FXML // fx:id="avalon"
        private Button avalon; // Value injected by FXMLLoader

        @FXML // fx:id="castille"
        private Button castille; // Value injected by FXMLLoader

        @FXML // fx:id="continueButton"
        private Button continueButton; // Value injected by FXMLLoader

        @FXML // fx:id="montaigne"
        private Button montaigne; // Value injected by FXMLLoader

        @FXML // fx:id="nationDescription"
        private Label nationDescription; // Value injected by FXMLLoader

        @FXML // fx:id="vodacce"
        private Button vodacce; // Value injected by FXMLLoader

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                System.out.println(tempCharacter.toString());
        }

        @FXML
        void onAvalon(ActionEvent event) {
                nation = DBNation.getNationByName("avalon");
                nationDescription.setText(nation.getDescription());
                nationDescription.setVisible(true);
                System.out.println(nation.toString());
                System.out.println(nation.getFavored_trait());
        }

        @FXML
        void onCastille(ActionEvent event) {
                nation = DBNation.getNationByName("castille");
                nationDescription.setText(nation.getDescription());
                nationDescription.setVisible(true);
                System.out.println(nation.toString());
        }
        @FXML
        void onMontaigne(ActionEvent event) {
                nation = DBNation.getNationByName("montaigne");
                nationDescription.setText(nation.getDescription());
                nationDescription.setVisible(true);
                System.out.println(nation.toString());
        }

        @FXML
        void onVodacce(ActionEvent event) {
                nation = DBNation.getNationByName("vodacce");
                nationDescription.setText(nation.getDescription());
                nationDescription.setVisible(true);
                System.out.println(nation.toString());
        }

        @FXML
        void onClick(ActionEvent event) {

                tempCharacter.setNation(nation);
                String trait = nation.getFavored_trait();
                if(trait.equals("resolve")) {
                        tempCharacter.setResolve(1);
                } else if(trait.equals("finesse")) {
                        tempCharacter.setFinesse(1);
                } else if (trait.equals("wits")) {
                        tempCharacter.setWits(1);
                        if(tempCharacter.getGender().equals("male")) {
                                nextPage = "/com/example/seventhseacharactergenerator/confirmSwordSchoolPage-view.fxml";
                        }
                } else if (trait.equals("panache")) {
                        tempCharacter.setPanache(1);
                } else if (trait.equals("brawn")) {
                        tempCharacter.setBrawn(1);
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
