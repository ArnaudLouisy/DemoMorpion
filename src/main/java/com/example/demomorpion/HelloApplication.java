package com.example.demomorpion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static  Stage stage;
    @Override
    public void start(Stage firstStage) throws IOException {
       stage = firstStage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Morpion!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {

        launch();
    }
    public static void changeScene(String nomScene,Object controller)  {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nomScene+".fxml"));
        Scene scene = null;
        try {
            fxmlLoader.setController(controller);
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Morpion!");
        stage.setScene(scene);
        stage.show();
    }
}