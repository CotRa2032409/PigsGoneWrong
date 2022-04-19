package com.example.pigsgonewrong;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class Carambolage implements Runnable {

    //Attributs
    private double angle;
    private double vitesse;
    private final double consAccel = 4.9;
    private final double vitesseMax = 150;
    private double vitesseVerticale = 0;
    private double vitesseHorizontale = 0;
    private double masse;
    private boolean tomber = true;
    private List<ImageView> piecesList = new ArrayList<>();
    private Thread thread;

    //Méthodes
    public Carambolage(double vitesse) {
        this.vitesse = vitesse;
    }

    public Carambolage() {

    }

    public void calculVitesse(List<ImageView> piecesList) {
        double masseTout = 0;
        this.piecesList = piecesList;
        vitesse = 0;
        /*for (int i = 0; i < pieces.size(); i++) {
            masseTout += pieces.get(i).getMasse();
        }*/

        masse = masseTout;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(500), ae -> {
            if (tomber) {
                vitesseVerticale += consAccel;
            } else {
                NextGen nextGen = new NextGen();
                nextGen.createTerrain();
                vitesse += (consAccel * Math.sin(nextGen.getCinq().getRotate())) * -1;
                vitesseHorizontale = (vitesse * Math.cos(nextGen.getCinq().getRotate())) * -1;
                vitesseVerticale = (vitesse * Math.sin(nextGen.getCinq().getRotate())) * -1;
            }
            vitesseVerticale = Math.min(vitesseMax, vitesseVerticale);

            transition(piecesList);
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }

    public void transition(List<ImageView> piecesList) {
        for (int i = 0; i < piecesList.size(); i++) {
            TranslateTransition transition = new TranslateTransition(Duration.millis(500), piecesList.get(i));
            transition.setInterpolator(Interpolator.LINEAR);
            transition.setByY(vitesseVerticale);
            transition.setCycleCount(1);
            transition.play();
        }
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public List<ImageView> getPiecesList() {
        return piecesList;
    }

    public void addToList(ImageView pieces) {
        piecesList.add(pieces);
    }

    public void removeFromList(ImageView pieces) {
        piecesList.remove(pieces);
    }

    public void setTomber(boolean tomber) {
        this.tomber = tomber;
    }

    public double getVitesseHorizontale() {
        return vitesseHorizontale;
    }

    public void setVitesseHorizontale(double vitesseHorizontale) {
        this.vitesseHorizontale = vitesseHorizontale;
    }

    public double getVitesseVerticale() {
        return vitesseVerticale;
    }

    public void setVitesseVerticale(double vitesseVerticale) {
        this.vitesseVerticale = vitesseVerticale;
    }
}
