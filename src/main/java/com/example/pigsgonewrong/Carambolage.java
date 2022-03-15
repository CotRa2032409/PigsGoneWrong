package com.example.pigsgonewrong;

import java.util.List;

public abstract class Carambolage extends Pieces implements Runnable {

    //Attributs
    private double angle;
    private double vitesse;
    private double accelGravit = -9.8;
    private static double masse;

    public Carambolage(double angle, double vitesse, double accelGravit) {
        this.angle = angle;
        this.vitesse = vitesse;
        this.accelGravit = accelGravit;
    }

    public Carambolage() {

    }

    public void calculVitesse(List<Pieces> pieces) {
        double masseTout = 0;
        for (int i = 0; i < pieces.size(); i++) {
            masseTout += pieces.get(i).getMasse();
        }

        masse = masseTout;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        vitesse = masse * -9.8;
        System.out.println(vitesse);
    }

    public void calculVitesse(Pieces pieces) {

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


    public abstract void destructionDerby(double allo);
}
