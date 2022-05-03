package com.example.pigsgonewrong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application implements Runnable {

    private final Carambolage gravity = new Carambolage();
    private static Thread thread;
    private static boolean running = false;
    protected NextGen nextGen;
    private static Stage stage;
    public Menus menu = new Menus();


    public synchronized void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setMaximized(true);
        stage.setTitle("Bad Piggies 3 Lite");
        stage.setResizable(false);
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();

        nextGen = new NextGen();




        gravity.calculVitesse(gravity.getPiecesList());

        Scene scene = menu.mainMenu();

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

    public static Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}

