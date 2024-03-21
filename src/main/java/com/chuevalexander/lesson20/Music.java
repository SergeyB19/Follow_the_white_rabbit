package com.chuevalexander.lesson20;

public enum Music {
    CLASSIC(5,"classic"),ROCK(8,"rock"), POP(12,"pop");
    private int i;
    private String name;

    Music(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public void foo() {
        System.out.println("It's true");
        System.out.println(Music.CLASSIC.getI());
    }
}

class Main {
    public static void main(String[] args) {
        Music music = Music.CLASSIC;
        for (Music element : Music.values()) {
            System.out.println(element);
        }
        Music music1 = Music.valueOf(Music.class, "ROCK");
        System.out.println(music1);
        System.out.println(music1.ordinal());
        switch (music) {
            case CLASSIC:
            System.out.println("Classic");
            break;
            case POP:
                System.out.println("Pop");
                break;
            case ROCK:
                System.out.println("Rock");
                break;

        }
        System.out.println(music.getI());
        System.out.println(music.getName());
        music.foo();

    }



}
