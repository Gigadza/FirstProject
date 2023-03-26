package com.ua.robot.homework11;

public class Car {

    public static String type= "Car";

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    public int setSpeed(int speed) {
        this.speed = speed;
        return speed;

    }
    public static void ride(){
        System.out.println("Car is riding");
    }


    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}
