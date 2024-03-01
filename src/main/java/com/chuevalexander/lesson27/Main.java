package com.chuevalexander.lesson27;

public class Main {
    public static void main(String[] args) {

        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Leg leg = new Leg();

        Robot<SmallHead> robot = new Robot<SmallHead>(body, smallHead);
        Robot<BigHead> robot1 = new Robot<BigHead>(body, bigHead);

        Robot robot2 = new Robot(body, mediumHead);

        robot.getHead().burn();
        robot1.getHead().turn();

        Robot robot2 = new Robot(body, mediumHead);
        robot2 = robot1;

    }
}
