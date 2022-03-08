package com.example.pigsgonewrong;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


public class Pieces {

    //Attributs
    private double masse;
    private double resistance;
    private boolean activable;
    private Polygon hitbox;
    public static Group test = new Group();

    //Méthodes
    public void boite() {

        Rectangle boiteFibre = new Rectangle(50, 50, 50, 50);
        boiteFibre.setStrokeWidth(20);
        boiteFibre.setStroke(Color.BLACK);

        Rectangle boiteBois = new Rectangle(50, 50, 50, 50);
        boiteBois.setStrokeWidth(20);
        boiteBois.setStroke(Color.BROWN);

        Rectangle boiteMetal = new Rectangle(50, 50, 50, 50);
        boiteMetal.setStrokeWidth(20);
        boiteMetal.setStroke(Color.GRAY);

    }

    public static void cochon() {

        Circle baseCochon = new Circle(50,50, 50, Color.GREENYELLOW);
        Circle nezCochon = new Circle(50, 50, 50);

    }

    public void roue() {

    }

    public Circle getBounds() {
        return new Circle(50, 50,50, Color.GREENYELLOW);
    }

}
