package com.example.pigsgonewrong;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;


public class Carambolage implements Runnable {

    //Attributs
    private double angle;
    private double vitesse;
    private double vitesseMax = 100;
    private double accelGravit = -9.8;
    private static double masse;
    private List<ImageView> piecesList = new ArrayList<>();
    private Thread thread;


    public Carambolage(double angle, double vitesse, double accelGravit) {
        super();
        this.angle = angle;
        this.vitesse = vitesse;
        this.accelGravit = accelGravit;
    }

    public Carambolage() {

    }


    public void calculVitesse(List<ImageView> pieces) {
        double masseTout = 0;
        pieces = piecesList;
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
            vitesse -= 9.8;
            System.err.println(vitesse);
        }));


    }


    //Méthodes
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

    public double getAccelGravit() {
        return accelGravit;
    }

    public void setAccelGravit(double accelGravit) {
        this.accelGravit = accelGravit;
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

}
