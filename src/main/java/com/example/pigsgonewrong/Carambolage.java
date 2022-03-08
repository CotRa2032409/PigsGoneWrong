package com.example.pigsgonewrong;

public abstract class Carambolage {

    //Attributs
    private double angle;
    private double vitesse;
    private double accelGravit = 9.8;

    public Carambolage(double angle, double vitesse, double accelGravit) {
        this.angle = angle;
        this.vitesse = vitesse;
        this.accelGravit = accelGravit;
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
