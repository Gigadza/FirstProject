package com.ua.robot.homework10;
public class Main {

    public static void main(String[] args) {

        Student Sergei = new Student("Sergei", "male", 18, "engineer","5");
        System.out.println(Sergei);

        Teacher Ivan = new Teacher("Ivan", "male", 56, 678, "math");
        System.out.println(Ivan);

        ArrayClass arr1 = new ArrayClass();
        arr1.fillArray();
        arr1.sortArray1();
        arr1.sortArray2();
    }
}
