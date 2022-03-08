package com.example.pigsgonewrong;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application implements Runnable {

    private static boolean running = false;
    private static Thread thread;

    public synchronized void start(Stage stage) throws IOException {
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setTitle("Bad Piggies 3 Lite");
        stage.setResizable(false);
        stage.setScene(scene);

        stage.show();
    }

    @Override
    public void run() {
        System.out.println("Thread has begun");
    }

    public static void main(String[] args) {
        launch();
    }
}
