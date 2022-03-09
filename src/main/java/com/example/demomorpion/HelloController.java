package com.example.demomorpion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private TextField Joueurdeux;

    @FXML
    private TextField Joueurun;

    @FXML
    private Button boutton;

    @FXML
    private Label welcomeText;
    @FXML
    private Label erreur;

    @FXML
    void nouvellepartie(ActionEvent event) {
        System.out.println(Joueurun.getText()+""+ Joueurdeux.getText());

        HelloApplication.changeScene ("morpion", new Morpion(Joueurun.getText(), Joueurdeux.getText()));
    }




    public void onHelloButtonClick(MouseEvent mouseEvent) {
    }
}
