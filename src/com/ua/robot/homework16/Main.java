package com.ua.robot.homework16;

public class Main {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek);
        System.out.println(DayOfWeek.ALL_DAYS.name());
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
        System.out.println(monday);
        System.out.println();

        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value);
        }
    }
}
