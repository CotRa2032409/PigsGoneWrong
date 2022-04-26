package com.example.pigsgonewrong;

import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class NextGen {

    //Attributs
    private Rectangle cinq;


    //Méthodes
    public NextGen() {
        cinq = new Rectangle(855, 520, 220, 5);
        cinq.setRotate(15);
    }

    public List<Rectangle> dataminer(int niveau) {    //Reference à Binding of Isaac, crée les hitbox du sol
        List<Rectangle> collision = new ArrayList<>();

        switch (niveau) {
            case 1: {

            }
            case 2: {

            }
            case 3: {

            }
            default: {
                System.err.println("Je pense tu devrais choisir un niveau... si tu veux jouer bien entendu");
            }
        }

        return collision;
    }

    public Rectangle getCinq() {
        return cinq;
    }

    public void setCinq(Rectangle cinq) {
        this.cinq = cinq;
    }

}
