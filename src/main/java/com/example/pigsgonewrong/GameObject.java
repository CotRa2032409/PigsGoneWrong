package com.example.pigsgonewrong;

public abstract class GameObject {
    protected float x, y;
    protected Pieces pieces;
    protected float velx = 0, vely = 0;


    public GameObject(float x, float y, Pieces pieces) {
        this.x = x;
        this.y = y;
        this.pieces = pieces;
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

    public float getVelx() {
        return velx;
    }

    public void setVelx(float velx) {
        this.velx = velx;
    }

    public float getVely() {
        return vely;
    }

    public void setVely(float vely) {
        this.vely = vely;
    }
}
