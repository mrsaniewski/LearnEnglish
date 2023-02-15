package com.example.angol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public HelloApplication() {
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Angielski dla dzieci!");
        primaryStage.setScene(new Scene(root, 800.0D, 700.0D));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}
