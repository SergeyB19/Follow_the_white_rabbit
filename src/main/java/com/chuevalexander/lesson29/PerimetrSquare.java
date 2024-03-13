package com.chuevalexander.lesson29;

public class PerimetrSquare {
    public void getPerimeter(String str) throws PerimetrException {

        Square square = new Square();

        try {
            double side = Double.parseDouble(str);
            square.setSide(0);
        } catch (NumberFormatException e) {
            throw new PerimetrException("String is incorrect",e);
        } catch (PerimetrException e) {
            System.err.println(e.getMessage());
        }
    }
}
