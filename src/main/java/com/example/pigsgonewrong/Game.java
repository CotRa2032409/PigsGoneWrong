package com.example.pigsgonewrong;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;


import java.io.IOException;
import java.lang.reflect.RecordComponent;

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
        stage.setMaximized(true);
        stage.setTitle("Bad Piggies 3 Lite");
        stage.setResizable(false);
        stage.setScene(scene);

        stage.show();
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
        while(running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames + " TICKS: " + updates);
                frames = 0;
                updates = 0;
            }
        }
    }

    private void tick() {

    }

    private void render() {

    }

    public static void main(String[] args) {
        launch();
    }
}


