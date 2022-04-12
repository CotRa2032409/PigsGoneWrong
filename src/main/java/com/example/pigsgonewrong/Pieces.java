package com.example.pigsgonewrong;

import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pieces extends ImageView {

    //Attributs
    protected Carambolage carambolage;
    private static double masse;
    private double resistance;
    private boolean activable;
    private boolean conteneur;
    private boolean contenu;

    public Pieces(String urlImage) {
        super(urlImage);
    }

    public Pieces() {

    }

    //Méthodes
    public void boiteBois() {
        Rectangle boiteBois = new Rectangle(50, 50, 50, 50);
        boiteBois.setStrokeWidth(20);
        boiteBois.setStroke(Color.BROWN);
        masse = 1.5;
        resistance = 2;
        conteneur = true;
    }

    public void boiteFibre() {
        Rectangle boiteFibre = new Rectangle(50, 50, 50, 50);
        boiteFibre.setStrokeWidth(20);
        boiteFibre.setStroke(Color.BLACK);
        masse = 1;
        resistance = 1;
        conteneur = true;
    }

    public void boiteMetal() {
        Rectangle boiteMetal = new Rectangle(50, 50, 50, 50);
        boiteMetal.setStrokeWidth(20);
        boiteMetal.setStroke(Color.GRAY);
        masse = 3;
        resistance = 3;
        conteneur = true;
    }

    public Pieces cochon() {
        //Mettre imageView içi
        Pieces cochon = new Pieces("file:SnowRunner Screenshot 2022.01.24 - 13.40.32.45.png");
        masse = 0.5;
        contenu = true;
        return cochon;
    }

    public void roue() {

        masse = 1;
        resistance = 2;
    }

    public void moteur() {

        masse = 2.5;
        activable = true;
        contenu = true;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        Pieces.masse = masse;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
