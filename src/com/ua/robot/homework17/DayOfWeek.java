package com.ua.robot.homework17;

public enum DayOfWeek {

    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    int priority;

    DayOfWeek(int priority) {
        this.priority = priority;
    }
    public static DayOfWeek of(int dayNumber) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.priority == dayNumber) {
                return day;
            }
        }
        return null;
    }


}
