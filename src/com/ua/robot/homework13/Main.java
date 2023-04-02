package com.ua.robot.homework13;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        Driver driver = new Driver();

        pilot.introduce();
        pilot.drive();
        pilot.fly();
        System.out.println();
        driver.introduce();
        driver.drive();
    }
}