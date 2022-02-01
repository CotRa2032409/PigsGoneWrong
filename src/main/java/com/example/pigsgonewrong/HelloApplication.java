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

        Vector vector = new Vector(0, 9.8);

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

class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {

    }

    public void setVector(double x, double y) {

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Gravity {
    public Vector gravityAcceleration(Vector projectile) {
        double x = 0;
        double y = 9.8;

        Vector gravity = new Vector();

        gravity.setVector(x, y);             //setVector is in PhysicsVector class and makes vector

        return gravity;
    }
}