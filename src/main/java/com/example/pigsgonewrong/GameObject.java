package com.example.pigsgonewrong;

public class GameObject extends Game {
    protected float x, y;
    protected Pieces pieces;
    protected float velX = 0, velY = 0;
    protected boolean tomber = true;

    public GameObject(float x, float y, Pieces pieces) {
        this.x = x;
        this.y = y;
        this.pieces = pieces;
    }

    public GameObject() {
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }


}
