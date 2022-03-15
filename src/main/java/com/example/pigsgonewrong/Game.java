package com.example.pigsgonewrong;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collections;

public class Game extends Application implements Runnable {


    private GameObject object;
    private Carambolage gravity;
    private boolean closed;
    private static Thread thread;
    private static boolean running = false;


    public synchronized void start(Stage stage) throws IOException {
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();
        Pieces pieces = new Pieces();
        pieces.cochon();
        object = new GameObject(50, 50, pieces);
        Rectangle test = new Rectangle(32, 64);
        Group root = new Group(Pieces.getTest());
        Scene scene = new Scene(root);
        stage.setMaximized(true);
        stage.setTitle("Bad Piggies 3 Lite");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(ae -> thread.stop());
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                updates++;
                delta--;
            }
            frames++;
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames + " TICKS: " + updates);
                frames = 0;
                updates = 0;
            }
        }
    }


    public static void main(String[] args) {
        launch();
    }
}

