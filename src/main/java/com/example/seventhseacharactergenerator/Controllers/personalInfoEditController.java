package com.example.seventhseacharactergenerator.Controllers;

import com.example.seventhseacharactergenerator.DBAccess.DBPlayerCharacter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.seventhseacharactergenerator.Controllers.personalInfoController.tempCharacter;

public class personalInfoEditController implements Initializable {
    int brawn = tempCharacter.getBrawn();
    int newBrawn;
    int finesse = tempCharacter.getFinesse();
    int newFinesse;
    int wits = tempCharacter.getWits();
    int newWits;
    int resolve = tempCharacter.getResolve();
    int newResolve;
    int panache = tempCharacter.getPanache();
    int newPanache;
    int initHeroPoints = tempCharacter.getHeroPoints();
    String charName = tempCharacter.getName();
    String playName = tempCharacter.getPlayer();
    int pointsSpent = 0;
    int heroPoints;

    @FXML
    public TextField characterName;
    @FXML
    public TextField playerName;
    @FXML
    public Label heroPointsTotal;
    @FXML
    public Circle brawnRank1;
    @FXML
    public Circle brawnRank2;
    @FXML
    public Circle brawnRank3;
    @FXML
    public Circle finesseRank1;
    @FXML
    public Circle finesseRank2;
    @FXML
    public Circle finesseRank3;
    @FXML
    public Circle witsRank1;
    @FXML
    public Circle witsRank2;
    public Circle witsRank3;
    @FXML
    public Circle resolveRank1;
    @FXML
    public Circle resolveRank2;
    @FXML
    public Circle resolveRank3;
    @FXML
    public Circle panacheRank1;
    @FXML
    public Circle panacheRank2;
    @FXML
    public Circle panacheRank3;
    @FXML
    public Label errorMessage;

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        characterName.setText(charName);
        playerName.setText(playName);
        heroPointsTotal.setText(String.valueOf(initHeroPoints));

        if (brawn == 3) {
            brawnRank3.setFill(Paint.valueOf("black"));
            brawnRank2.setFill(Paint.valueOf("black"));
        } else if (brawn == 2) {
            brawnRank2.setFill(Paint.valueOf("black"));
        }
        if (finesse == 3) {
            finesseRank3.setFill(Paint.valueOf("black"));
            finesseRank2.setFill(Paint.valueOf("black"));
        } else if (finesse == 2) {
            finesseRank2.setFill(Paint.valueOf("black"));
        }
        if (wits == 3) {
            witsRank3.setFill(Paint.valueOf("black"));
            witsRank2.setFill(Paint.valueOf("black"));
        } else if (wits == 2) {
            witsRank2.setFill(Paint.valueOf("black"));
        }
        if (resolve == 3) {
            resolveRank3.setFill(Paint.valueOf("black"));
            resolveRank2.setFill(Paint.valueOf("black"));
        } else if (resolve == 2) {
            resolveRank2.setFill(Paint.valueOf("black"));
        }
        if (panache == 3) {
            panacheRank3.setFill(Paint.valueOf("black"));
            panacheRank2.setFill(Paint.valueOf("black"));
        } else if (panache == 2) {
            panacheRank2.setFill(Paint.valueOf("black"));
        }
    }

    /**
     * @param mouseEvent
     */
    public void onBrawnRank1(MouseEvent mouseEvent) {
        brawnRank3.setFill(Paint.valueOf("white"));
        brawnRank2.setFill(Paint.valueOf("white"));
        newBrawn = 1;
        System.out.println("brawn: " + brawn);
        System.out.println("newBrawn: " + newBrawn);
        pointsSpent = 8 * (brawn - newBrawn);
        System.out.println("pointsSpent: " + pointsSpent);

        initHeroPoints = initHeroPoints + pointsSpent;
        System.out.println("herPoints: " + heroPoints);
        brawn = newBrawn;
        System.out.println(brawn);
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onBrawnRank2(MouseEvent mouseEvent) {
        brawnRank2.setFill(Paint.valueOf("black"));
        if (brawnRank3.getFill().equals(Paint.valueOf("black"))) {
            brawnRank3.setFill(Paint.valueOf("white"));
        }
        newBrawn = 2;
        System.out.println("brawn: " + brawn);
        System.out.println("newBrawn: " + newBrawn);
        pointsSpent = 8 * (brawn - newBrawn);
        System.out.println("pointsSpent: " + pointsSpent);
        initHeroPoints = initHeroPoints + pointsSpent;
        System.out.println("herPoints: " + heroPoints);
        brawn = newBrawn;
        System.out.println(brawn);
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onBrawnRank3(MouseEvent mouseEvent) {
        brawnRank3.setFill(Paint.valueOf("black"));
        brawnRank2.setFill(Paint.valueOf("black"));
        newBrawn = 3;
        System.out.println("brawn: " + brawn);
        System.out.println("newBrawn: " + newBrawn);
        pointsSpent = 8 * (brawn - newBrawn);
        System.out.println("pointsSpent: " + pointsSpent);
        initHeroPoints = initHeroPoints + pointsSpent;
        System.out.println("herPoints: " + heroPoints);
        brawn = newBrawn;
        System.out.println(brawn);
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onFinesseRank1(MouseEvent mouseEvent) {
        finesseRank3.setFill(Paint.valueOf("white"));
        finesseRank2.setFill(Paint.valueOf("white"));
        newFinesse = 1;
        pointsSpent = 8 * (finesse - newFinesse);
        initHeroPoints = initHeroPoints + pointsSpent;
        finesse = newFinesse;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onFinesseRank2(MouseEvent mouseEvent) {
        finesseRank2.setFill(Paint.valueOf("black"));
        if (finesseRank3.getFill().equals(Paint.valueOf("black"))) {
            finesseRank3.setFill(Paint.valueOf("white"));
        }
        newFinesse = 2;
        pointsSpent = 8 * (finesse - newFinesse);
        initHeroPoints = initHeroPoints + pointsSpent;
        finesse = newFinesse;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onFinesseRank3(MouseEvent mouseEvent) {
        finesseRank3.setFill(Paint.valueOf("black"));
        finesseRank2.setFill(Paint.valueOf("black"));
        newFinesse = 3;
        pointsSpent = 8 * (finesse - newFinesse);
        initHeroPoints = initHeroPoints + pointsSpent;
        finesse = newFinesse;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onWitsRank1(MouseEvent mouseEvent) {
        witsRank3.setFill(Paint.valueOf("white"));
        witsRank2.setFill(Paint.valueOf("white"));
        newWits = 1;
        pointsSpent = 8 * (wits - newWits);
        initHeroPoints = initHeroPoints + pointsSpent;
        wits = newWits;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onWitsRank2(MouseEvent mouseEvent) {
        witsRank2.setFill(Paint.valueOf("black"));
        if (witsRank3.getFill().equals(Paint.valueOf("black"))) {
            witsRank3.setFill(Paint.valueOf("white"));
        }
        newWits = 2;
        pointsSpent = 8 * (wits - newWits);
        initHeroPoints = initHeroPoints + pointsSpent;
        wits = newWits;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onWitsRank3(MouseEvent mouseEvent) {
        witsRank3.setFill(Paint.valueOf("black"));
        witsRank2.setFill(Paint.valueOf("black"));
        newWits = 3;
        pointsSpent = 8 * (wits - newWits);
        initHeroPoints = initHeroPoints + pointsSpent;
        wits = newWits;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onResolveRank1(MouseEvent mouseEvent) {
        resolveRank3.setFill(Paint.valueOf("white"));
        resolveRank2.setFill(Paint.valueOf("white"));
        newResolve = 1;
        pointsSpent = 8 * (resolve - newResolve);
        initHeroPoints = initHeroPoints + pointsSpent;
        resolve = newResolve;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onResolveRank2(MouseEvent mouseEvent) {
        resolveRank2.setFill(Paint.valueOf("black"));
        if (resolveRank3.getFill().equals(Paint.valueOf("black"))) {
            resolveRank3.setFill(Paint.valueOf("white"));
        }
        newResolve = 2;
        pointsSpent = 8 * (resolve - newResolve);
        initHeroPoints = initHeroPoints + pointsSpent;
        resolve = newResolve;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onResolveRank3(MouseEvent mouseEvent) {
        resolveRank3.setFill(Paint.valueOf("black"));
        resolveRank2.setFill(Paint.valueOf("black"));
        newResolve = 3;
        pointsSpent = 8 * (resolve - newResolve);
        initHeroPoints = initHeroPoints + pointsSpent;
        resolve = newResolve;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onPanacheRank1(MouseEvent mouseEvent) {
        panacheRank3.setFill(Paint.valueOf("white"));
        panacheRank2.setFill(Paint.valueOf("white"));
        newPanache = 3;
        pointsSpent = 8 * (panache - newPanache);
        initHeroPoints = initHeroPoints + pointsSpent;
        panache = newPanache;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onPanacheRank2(MouseEvent mouseEvent) {
        panacheRank2.setFill(Paint.valueOf("black"));
        if (panacheRank3.getFill().equals(Paint.valueOf("black"))) {
            panacheRank3.setFill(Paint.valueOf("white"));
        }
        newPanache = 2;
        pointsSpent = 8 * (panache - newPanache);
        initHeroPoints = initHeroPoints + pointsSpent;
        panache = newPanache;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param mouseEvent
     */
    public void onPanacheRank3(MouseEvent mouseEvent) {
        panacheRank3.setFill(Paint.valueOf("black"));
        panacheRank2.setFill(Paint.valueOf("black"));
        newPanache = 3;
        pointsSpent = 8 * (panache - newPanache);
        initHeroPoints = initHeroPoints + pointsSpent;
        panache = newPanache;
        heroPointsTotal.setText(String.valueOf(initHeroPoints));
    }

    /**
     * @param actionEvent
     */
    public void onSave(ActionEvent actionEvent) {
        DBPlayerCharacter.updatePersonalInfo(characterName.getText(), playerName.getText(), initHeroPoints, brawn,
                finesse, wits, resolve, panache, tempCharacter.getId());
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/seventhseacharactergenerator/savedCharactersReport-view.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
