package com.chuevalexander.lesson7;

import com.chuevalexander.lesson7.Bus;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bus ourBus;
        Bus firstBus;
        Bus secondBus;
        ourBus = new Bus();
        firstBus = new Bus();
        secondBus = new Bus();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Grey";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();

    }
}