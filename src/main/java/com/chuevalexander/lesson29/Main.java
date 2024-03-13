package com.chuevalexander.lesson29;

public class Main {
    public static void main(String[] args) {
        PerimetrSquare perimetrSquare = new PerimetrSquare();
        try {
            perimetrSquare.getPerimeter("g");
        } catch (PerimetrException e) {
            throw new RuntimeException(e);
        }
    }
}
