package com.chuevalexander.lesson17;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D23HA6";
    public final int SERIAL_NUMBER2 = 245365;

    public void go() {
        System.out.println("Go");
    }

    public void showKm(int km) {
        km = km + 2;
      /*  engine = new Engine();
        int km = 65;
        String str = "70km";*/
//        return engine;
        System.out.println(km);

    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.go();
        int km = 65;
        bus.showKm(km);
    }

}
