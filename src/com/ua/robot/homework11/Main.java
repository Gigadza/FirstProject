package com.ua.robot.homework11;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.introduce();
        car.Type();

        PassengerCar passengerCar = new PassengerCar();
        passengerCar.introduce();
        passengerCar.Type();

        Lorry lorry = new Lorry();
        lorry.introduce();
        lorry.Type();
    }
}
