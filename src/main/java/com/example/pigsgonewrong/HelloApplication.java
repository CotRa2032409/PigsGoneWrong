package com.example.pigsgonewrong;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setMaximized(true);


        Rectangle rectangle = new Rectangle(100, 50);


        TranslateTransition test = new TranslateTransition(Duration.seconds(5), rectangle);
        test.setByY(500);
        test.setCycleCount(Timeline.INDEFINITE);
        test.play();

        Group root = new Group(rectangle);
        Scene scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}

