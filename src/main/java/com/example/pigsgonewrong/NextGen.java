package com.example.pigsgonewrong;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class NextGen {

    //Attributs
    private Rectangle cinq;


    //Méthodes
    public NextGen() {
        cinq = new Rectangle(855, 520, 220, 5);
    }

    public void createTerrain() {
        cinq.setRotate(35);
        cinq.setFill(Color.BLUE);

    }

    public List<Rectangle> dataminer() {    //Reference à Binding of Isaac, crée les hitbox du sol

        return null;
    }

    public Rectangle getCinq() {
        return cinq;
    }

    public void setCinq(Rectangle cinq) {
        this.cinq = cinq;
    }

}
