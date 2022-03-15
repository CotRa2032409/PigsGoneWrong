package com.example.pigsgonewrong;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Pieces extends GameObject {

    //Attributs
    private double masse;
    private double resistance;
    private boolean activable;
    private Polygon hitbox;
    public static Group test = new Group();
    protected static Thread thread;

    public Pieces(float x, float y, Pieces pieces) {
        super(x, y, pieces);
    }

    public Pieces() {

    }


    //Méthodes
    public void boiteBois() {
        Rectangle boiteBois = new Rectangle(50, 50, 50, 50);
        boiteBois.setStrokeWidth(20);
        boiteBois.setStroke(Color.BROWN);
        masse = 2;
    }

    public void boiteFibre() {
        Rectangle boiteFibre = new Rectangle(50, 50, 50, 50);
        boiteFibre.setStrokeWidth(20);
        boiteFibre.setStroke(Color.BLACK);
        masse = 1;
    }

    public void boiteMetal() {
        Rectangle boiteMetal = new Rectangle(50, 50, 50, 50);
        boiteMetal.setStrokeWidth(20);
        boiteMetal.setStroke(Color.GRAY);
        masse = 3;
    }

    public Circle cochon() {
        //Mettre imageView içi
        Circle baseCochon = new Circle(50, Color.GREENYELLOW);
        Circle nezCochon = new Circle(50);
        getBounds(50);

        setMasse(0.5);
        return baseCochon;
    }

    public void roue() {

    }

    public static Circle getBounds(float rayon) {
        Circle hitbox = new Circle(50);
        hitbox.setStroke(Color.TRANSPARENT);
        return hitbox;
    }

    public void gravityTesting() {

    }

    public static Group getTest() {
        return test;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
