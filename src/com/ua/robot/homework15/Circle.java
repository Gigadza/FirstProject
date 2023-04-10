package com.ua.robot.homework15;

public class Circle implements Figure{
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
