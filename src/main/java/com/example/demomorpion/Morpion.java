package com.example.demomorpion;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Morpion implements Initializable {
    private String symbol = "X";
    private String Joueurun;
    private String Joueurdeux;
    @FXML
    private Label lblJoueur;

    @FXML
    private ListView<String> listeCoups;

    public Morpion(String joueurun, String joueurdeux) {
        Joueurun = joueurun;
        Joueurdeux = joueurdeux;

    }

    @FXML
    void OnClickLabel(MouseEvent event) {
        Label label = (Label) event.getSource();
        label.setText(symbol);
        if(label.getText().isEmpty());{


        if (symbol.equals(("X"))) {
            symbol = "O";
            this.lblJoueur.setText(this.Joueurdeux);
            listeCoups.getItems().add(Joueurun+"a fais un coup");
        }else{
            this.symbol = "X";
            this.lblJoueur.setText(this.Joueurun);
            listeCoups.getItems().add(Joueurdeux+"a fais un coup");
        }
        }else{

        }

        }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblJoueur.setText(Joueurun);
    }
}