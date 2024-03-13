package com.chuevalexander.lesson29;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws PerimetrException {
        if (side <= 0) {
            throw new PerimetrException("Side is incorrect");
        }
        this.side = side;
    }
}
