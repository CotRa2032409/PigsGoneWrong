package com.example.pigsgonewrong;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pieces extends ImageView {

    //Attributs
    protected Carambolage carambolage;
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
        setResistance(2);
        setConteneur(true);
        setContenu(false);

    }

    public void boiteFibre() {
        setImage(new Image("file:SnowRunner Screenshot 2022.01.24 - 13.40.32.45.png"));
        setResistance(1);
        setConteneur(true);
        setContenu(false);
    }

    public void boiteMetal() {
        setImage(new Image("file:SnowRunner Screenshot 2022.01.24 - 13.40.32.45.png"));
        setResistance(3);
        setConteneur(true);
        setContenu(false);
    }

    public void cochon() {
        //Mettre imageView içi
        setImage(new Image("file:SnowRunner Screenshot 2022.01.24 - 13.40.32.45.png"));
        setContenu(true);
        setConteneur(false);
    }

    public void roue() {
        setResistance(2);
        setConteneur(false);
        setContenu(false);
    }

    public void moteur() {

        setActivable(true);
        setContenu(true);
    }

    public void reacteur() {
        setResistance(2);
        setActivable(true);
        setContenu(false);
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
