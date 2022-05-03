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
    private final double consAccel = 1.96;
    private final double vitesseMax = 150;
    private double vitesseVerticale = 0;
    private double vitesseHorizontale = 0;
    private boolean tomber = true;
    private List<ImageView> piecesList = new ArrayList<>();

    //Méthodes
    public Carambolage(double vitesse) {
        this.vitesse = vitesse;
    }

    public Carambolage() {

    }

    public void calculVitesse(List<ImageView> piecesList) {
        this.piecesList = piecesList;
        vitesse = 0;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        NextGen nextGen = new NextGen();
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(200), ae -> {
            if (tomber) {
                vitesseVerticale += consAccel;

            } else {
                /*vitesse += (consAccel * Math.sin(nextGen..getRotate()));
                vitesseHorizontale = (vitesse * Math.cos(nextGen.getCinq().getRotate()));
                vitesseVerticale = (vitesse * Math.sin(nextGen.getCinq().getRotate()));*/
            }
            vitesseVerticale = Math.min(vitesseMax, vitesseVerticale);
            transition(piecesList);

        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }

    public void transition(List<ImageView> piecesList) {
        for (ImageView imageView : piecesList) {
            TranslateTransition transition = new TranslateTransition(Duration.millis(200), imageView);
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
