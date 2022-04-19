package com.example.pigsgonewrong;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pieces extends ImageView {

    //Attributs
    protected Carambolage carambolage;
    private double masse;
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
        setImage(new Image("file:SnowRunner Screenshot 2022.01.24 - 13.40.32.45.png"));
        masse = 1.5;
        resistance = 2;
        setConteneur(true);
        setContenu(false);

    }

    public void boiteFibre() {
        Rectangle boiteFibre = new Rectangle(50, 50, 50, 50);
        boiteFibre.setStrokeWidth(20);
        boiteFibre.setStroke(Color.BLACK);
        masse = 1;
        resistance = 1;
        setConteneur(true);
    }

    public void boiteMetal() {
        setImage(new Image("file:SnowRunner Screenshot 2022.01.24 - 13.40.32.45.png"));
        masse = 3;
        resistance = 3;
        setConteneur(true);
    }

    public void cochon() {
        //Mettre imageView içi
        setImage(new Image("file:SnowRunner Screenshot 2022.01.24 - 13.40.32.45.png"));
        masse = 0.5;
        setContenu(true);
        setConteneur(false);
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
        this.masse = masse;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public boolean isActivable() {
        return activable;
    }

    public void setActivable(boolean activable) {
        this.activable = activable;
    }

    public boolean isConteneur() {
        return conteneur;
    }

    public void setConteneur(boolean conteneur) {
        this.conteneur = conteneur;
    }

    public boolean isContenu() {
        return contenu;
    }

    public void setContenu(boolean contenu) {
        this.contenu = contenu;
    }
}
