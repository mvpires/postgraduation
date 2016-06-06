package com.mvpires;

/**
 * Created by mv_pi on 06/06/2016.
 */
public class Enemy {

    private double positionX;
    private double positionY;

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public Enemy(double positionX, double positionY)
    {
        setPositionX(positionX);
        setPositionY(positionY);
    }

}
