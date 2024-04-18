package com.example.assignment_3_java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("Dollar to Rupee Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
