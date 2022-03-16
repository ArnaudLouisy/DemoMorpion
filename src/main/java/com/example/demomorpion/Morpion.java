package com.example.demomorpion;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
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
    @FXML
    private GridPane maGrid;

    private int[][][] testVictoire = {
            {{0,0},{0,1},{0,2}},
            {{1,0},{1,1},{1,2}},
            {{2,0},{2,1},{2,2}},
            {{0,0},{1,0},{2,0}},
            {{0,1},{1,1},{2,1}},
            {{0,2},{1,2},{2,2}},
            {{0,0},{1,1},{2,2}},
            {{0,2},{1,1},{2,0}},

    };

    public Morpion(String joueurun, String joueurdeux) {
        Joueurun = joueurun;
        Joueurdeux = joueurdeux;

    }

    @FXML
    void OnClickLabel(MouseEvent event) {
        Label label = (Label) event.getSource();

        label.setText(symbol);
        if (symbol.equals(("X"))) {
            symbol = "O";
            this.lblJoueur.setText(this.Joueurdeux);
            listeCoups.getItems().add(Joueurun+"a fais un coup");
        }else{
            this.symbol = "X";
            this.lblJoueur.setText(this.Joueurun);
            listeCoups.getItems().add(Joueurdeux+"a fais un coup");
        }
    }

//ajout de victoire

private  boolean checkVictoire(){
        for (int i = 0 ; i< testVictoire.length; i++){
            if(getNodeFromGrindidPane(testVictoire[i][0][0],testVictoire[i][0][1]).getText())
        }
return  false;
    }






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblJoueur.setText(Joueurun);
    }
    private Label getNodeFromGrindidPane(int col, int row){
        for (Node node : maGrid.getChildren()){
            if(GridPane.getColumnIndex(node)==col && GridPane.getRowIndex(node)==row){
                return(Label) node;
            }
        }


        return null;
    }
}