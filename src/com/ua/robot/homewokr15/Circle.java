package com.ua.robot.homewokr15;

public class Circle implements Figure{
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
