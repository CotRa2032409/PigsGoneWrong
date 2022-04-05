package com.example.pigsgonewrong;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Game extends Application implements Runnable {

    private Carambolage gravity = new Carambolage();
    private static Thread thread;
    private static boolean running = false;
    protected NextGen nextGen;


    public synchronized void start(Stage stage) throws IOException {
        stage.setMaximized(true);
        stage.setTitle("Bad Piggies 3 Lite");
        stage.setResizable(false);
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();

        List<ImageView> allo = new ArrayList<>();
        nextGen = new NextGen();
        nextGen.createTerrain();

        Pieces pieces = Pieces.cochon();
        allo.add(pieces);

        gravity.setTomber(false);

        GridPane gridPane = new GridPane();
        gridPane.add(allo.get(0), 0, 0);
        Group root = new Group(gridPane);
        pieces.setScaleX(0.2);
        pieces.setScaleY(0.2);

        gravity.addToList(pieces);
        gravity.calculVitesse(gravity.getPiecesList());
        gravity.transition(gravity.getPiecesList());
        Scene scene = new Scene(root);

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

