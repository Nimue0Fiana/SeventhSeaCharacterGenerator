package com.example.seventhseacharactergenerator.Controllers;

/**
 * Sample Skeleton for 'chooseSorceryNation.fxml' Controller Class
 */

import com.example.seventhseacharactergenerator.DBAccess.DBNation;
import com.example.seventhseacharactergenerator.Models.Nation;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.confirmSorceryController.tempSorcerer;

public class chooseSorceryNationController implements Initializable {
    Nation nation = null;
        @FXML // fx:id="avalon"
        private Button avalon; // Value injected by FXMLLoader

        @FXML // fx:id="castille"
        private Button castille; // Value injected by FXMLLoader

        @FXML // fx:id="continueButton"
        private Button continueButton; // Value injected by FXMLLoader

        @FXML // fx:id="montaigne"
        private Button montaigne; // Value injected by FXMLLoader

        @FXML // fx:id="vodacce"
        private Button vodacce; // Value injected by FXMLLoader

        @FXML // fx:id="nation2Description"
        private Label nation2Description; // Value injected by FXMLLoader

        @FXML
        void onAvalon(ActionEvent event) {
                nation = DBNation.getNationByName("avalon");
                nation2Description.setText(nation.getDescription());
                nation2Description.setVisible(true);
                System.out.println(nation.toString());
        }

        @FXML
        void onCastille(ActionEvent event) {
                nation = DBNation.getNationByName("castille");
                nation2Description.setText(nation.getDescription());
                nation2Description.setVisible(true);
                System.out.println(nation.toString());
        }
        @FXML
        void onMontaigne(ActionEvent event) {
                nation = DBNation.getNationByName("montaigne");
                nation2Description.setText(nation.getDescription());
                nation2Description.setVisible(true);
                System.out.println(nation.toString());
        }

        @FXML
        void onVodacce(ActionEvent event) {
                nation = DBNation.getNationByName("vodacce");
                nation2Description.setText(nation.getDescription());
                nation2Description.setVisible(true);
                System.out.println(nation.toString());
        }

        @FXML
        void onClick(ActionEvent event) {
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

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                System.out.println(tempSorcerer.toString());
        }
}
