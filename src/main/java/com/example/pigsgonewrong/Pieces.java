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
    private ImageView pieces;


    public static Group test = new Group();

    public Pieces(ImageView pieces) {
        this.pieces = pieces;
    }

    //Méthodes
    public void boiteBois() {
        Rectangle boiteBois = new Rectangle(50, 50, 50, 50);
        boiteBois.setStrokeWidth(20);
        boiteBois.setStroke(Color.BROWN);
        masse = 1.5;
    }

    public static void boiteFibre() {
        Rectangle boiteFibre = new Rectangle(50, 50, 50, 50);
        boiteFibre.setStrokeWidth(20);
        boiteFibre.setStroke(Color.BLACK);
        masse = 1;
    }

    public static void boiteMetal() {
        Rectangle boiteMetal = new Rectangle(50, 50, 50, 50);
        boiteMetal.setStrokeWidth(20);
        boiteMetal.setStroke(Color.GRAY);
        masse = 3;
    }

    public static Pieces cochon() {
        //Mettre imageView içi
        Pieces cochon = new Pieces(new ImageView("file:SnowRunner Screenshot 2022.01.24 - 13.40.32.45.png"));

        return cochon;
    }

    public void roue() {

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
