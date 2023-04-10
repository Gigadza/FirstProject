package com.ua.robot.homework15.HW;

public class Main {

    public static void main(String[] args) {
        Flying f1 = new Pilot();

        Pilot p1 =  (Pilot) f1;
        Flying f2 = p1;

        f1.fly();

    }
}
